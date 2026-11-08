class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        Set<Character> exist = new HashSet<>();

        int l = 0;
        int r = 1;

        int max = 0;

        exist.add(s.charAt(l));
        while(r < s.length()){
            if(exist.contains(s.charAt(r))){
                while(exist.contains(s.charAt(r))){
                    exist.remove(s.charAt(l));
                    l++;
                }
            }
            if(r-l+1 > max){
                max = r-l+1;
            }
            exist.add(s.charAt(r));
            r++;
        }

        return max;
    }
}
