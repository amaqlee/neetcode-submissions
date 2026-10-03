class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;

        Map<Character, Integer> seen = new HashMap<>();

        while(right < s.length()){
            char r = s.charAt(right);
            if(seen.containsKey(r)){
                //repeat char
                int currLength = right - left;
                if(currLength > max){
                    max = currLength;
                }
                int prevIndex = seen.get(r);
                left = prevIndex+1;
                
            }
            seen.put(r, right);
            right++;
        }

        return max;
    }
}
