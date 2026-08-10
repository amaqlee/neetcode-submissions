class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int[] output = new int[2];

        // for(int i = 0; i < nums.length; i++){
        //     int leftover = target - nums[i];
        //     if(numToIndex.containsKey(leftover)){
        //         output[0] = numToIndex.get(leftover);
        //         output[1] = i;
        //         return output;
        //     }
        //     numToIndex.put(nums[i], i);
        // }
        // return output;
        for(int i = 0; i < nums.length; i++){
            numToIndex.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int leftover = target - nums[i];
            if(numToIndex.containsKey(leftover)){
                int index = numToIndex.get(leftover);
                if(index < i){
                    output[0] = index;
                    output[1] = i;
                    return output;
                }else if(index > i){
                    output[0] = i;
                    output[1] = index;
                    return output;
                }
            }
        }
        return output;
    }
}
