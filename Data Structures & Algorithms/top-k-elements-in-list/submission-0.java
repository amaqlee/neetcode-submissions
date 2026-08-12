class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        //bucket sort based on frequency of number
        //nums.length buckets

        Map<Integer, Integer> numToFreq = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int newVal = 0;
            if(numToFreq.containsKey(curr)){
                newVal = numToFreq.get(curr);
            }
            numToFreq.put(curr, newVal+1);
        }

        List<Integer>[] freqToNums = new List[nums.length + 1];
        for(int j = 0; j < nums.length+1; j++){
            freqToNums[j] = new ArrayList<>();
        }

        for(Integer num : numToFreq.keySet()){
            int freq = numToFreq.get(num);
            freqToNums[freq].add(num);
        }

        int count = 0;
        for(int i = nums.length; i > 0 && count < k; i--){
            for(int n : freqToNums[i]){
                result[count] = n;
                count++;
                if(count == k){
                    return result;
                }
            }
        }

        return result;
    }
}
