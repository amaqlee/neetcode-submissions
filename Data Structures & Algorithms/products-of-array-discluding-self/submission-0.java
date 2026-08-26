class Solution {
    public int[] productExceptSelf(int[] nums) {
        //find prefix and suffix, multiply
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        //iterate left to right to find prefix sums
        int pre = 1;
        prefix[0] = pre;
        for(int i = 1; i < nums.length; i++){
            pre *= nums[i-1];
            prefix[i] = pre;
        }
        //iterate right to left to find suffix sums
        int suff = 1;
        suffix[nums.length - 1] = suff;
        for(int j = nums.length-2; j >= 0; j--){
            suff *= nums[j+1];
            suffix[j] = suff;
        }

        for(int z = 0; z < nums.length; z++){
            result[z] = prefix[z]*suffix[z];
        }

        return result;
    }

    
}  
