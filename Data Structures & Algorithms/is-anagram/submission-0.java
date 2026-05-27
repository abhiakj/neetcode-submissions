class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chs = new int[26];
        for(char ch: s.toCharArray()){
            chs[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            chs[ch-'a']--;
        }
        for(int x: chs){
            if (x != 0)
                return false;
        }
        return true;
    }
}
