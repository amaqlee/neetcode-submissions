class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        for(int i : nums){
            if(exist.contains(i)){
                return true;
            }
            exist.add(i);
        }
        return false;
    }
}