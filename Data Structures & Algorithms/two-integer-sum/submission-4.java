class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int other = target - num;
            if(numToIndex.containsKey(other)){
                result[0] = numToIndex.get(other);
                result[1] = i;
            }
            numToIndex.put(num, i);
        }
        return result;
    }
}
