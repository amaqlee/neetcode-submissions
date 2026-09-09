class Solution {
    public int longestConsecutive(int[] nums) {
        //start of sequence if num-1 doesn't exist
        Set<Integer> numSet = new HashSet<>();
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            numSet.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            //check if start of sequence
            int curr = nums[i];
            if(!numSet.contains(curr-1)){
                //find length of sequence
                int currLength = 1;
                while(numSet.contains(curr+1)){
                    currLength++;
                    curr++;
                }
                if(currLength > max){
                    max = currLength;
                }
            }
            
        }
        return max;
    }
}
