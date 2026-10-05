class Solution {
    public int characterReplacement(String s, int k) {
        //wibdow len - count of most freq - k <= 0
        int left = 0;
        int longest = 0; 
        Map<Character, Integer> charToCount = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            charToCount.put(curr, charToCount.getOrDefault(curr, 0) + 1);
            while((right - left + 1) - Collections.max(charToCount.values()) > k){
                char first = s.charAt(left);
                charToCount.put(first, charToCount.get(first) - 1);
                left++;
            }
            
            longest = Math.max(right - left + 1, longest);
        }
        return longest;
    }
}
