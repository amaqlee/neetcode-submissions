class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            numToIndex.put(nums[i], i);
        }

        for(int num : numToIndex.keySet()){
            int other = target - num;
            if(numToIndex.keySet().contains(other)){
                int index1 = numToIndex.get(num);
                int index2 = numToIndex.get(other);
                if(index1 < index2){
                    result[0] = index1;
                    result[1] = index2;
                }else if(index2 < index1){
                    result[0] = index2;
                    result[1] = index1;
                }
            }
        }

        return result;
    }
}
