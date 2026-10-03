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
                int prevIndex = seen.get(r);
                left = Math.max(left, prevIndex+1);
                
            }
            seen.put(r, right);

            int currLength = right - left + 1;
            max = Math.max(max, currLength);
            right++;
        }

        return max;
    }
}
