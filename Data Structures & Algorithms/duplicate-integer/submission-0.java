class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> contain = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!contain.containsKey(nums[i])){
                contain.put(nums[i], 1);
            }else{
                return true;
            }
        }
        return false;
    }
}