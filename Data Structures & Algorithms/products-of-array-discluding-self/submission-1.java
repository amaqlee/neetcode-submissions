class Solution {
    public int[] productExceptSelf(int[] nums) {
        //find prefix and suffix, multiply
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            result[i] = 1;
        }

        int pre = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] *= pre;
            pre *= nums[i];
        }
        
        int suff = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= suff;
            suff *= nums[i];
        }

        return result;
    }

    
}  
