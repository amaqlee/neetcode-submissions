class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> contain = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!contain.contains(nums[i])){
                contain.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}