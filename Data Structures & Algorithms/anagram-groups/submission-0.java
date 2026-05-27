class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int[] chCount = new int[26];
        Map<Integer, List<String>> hashMap = new HashMap<>();
        for(String str: strs){
            for(int i=0;i<26;i++)
            {
                chCount[i]=0;
            }
            for(char ch: str.toCharArray())
            {
                chCount[ch-'a']++;
            }
            int hc = Arrays.hashCode(chCount);
            //System.out.printf("%s (%s) hash is %d\n", str, Arrays.toString(chCount),hc);
            List<String> f = hashMap.get(hc);
            if (f==null){
                f = new ArrayList<>();
                hashMap.put(hc,f);
            }
            f.add(str);
        }
        result.addAll(hashMap.values());
        return result;
    }
}
