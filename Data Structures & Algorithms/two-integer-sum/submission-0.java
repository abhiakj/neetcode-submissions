class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> posLookup = new HashMap<>();
        for(int i = 0;i<nums.length; i++){
            int wanted = target-nums[i];
            if(posLookup.containsKey(wanted))
            {
                result[0]=posLookup.get(wanted);
                result[1]=i;
                return result;
            }
            posLookup.put(nums[i], i);
        }
        return result;
    }
}
