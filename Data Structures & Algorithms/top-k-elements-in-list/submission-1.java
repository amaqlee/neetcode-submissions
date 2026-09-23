class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numToFreq = new HashMap<>();
        for(int num : nums){
            int curr = 0;
            if(numToFreq.containsKey(num)){
                curr = numToFreq.get(num);
            }
            numToFreq.put(num, curr + 1);
        }
        //ea row for ea num
        //col 0: freq
        //col 1: num
        List<int[]> freqToNum = new ArrayList<>();
        for(int key : numToFreq.keySet()){
            int[] freq = new int[2];
            freq[0] = numToFreq.get(key);
            freq[1] = key;
            freqToNum.add(freq);
            //freqToNum.add(new int[] {numToFreq.get(key), key})
        }
        //if res neg, a comes before b
        //if res pos, b comes before a
        //else, position stays same
        freqToNum.sort((a, b) -> b[0] - a[0]);

        int res[] = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = freqToNum.get(i)[1];
        }

        return res;
    }
}
