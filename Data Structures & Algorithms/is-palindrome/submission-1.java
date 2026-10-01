class Solution {
    public boolean isPalindrome(String s) {
       int l = 0;
       int r = s.length() - 1;

       while(l < r){
            //skip invalid chars
            while(l < r && !inAlphabet(s.charAt(l))){
                l++;
            }
            while(l < r && !inAlphabet(s.charAt(r))){
                r--;
            }
            if(s.toLowerCase().charAt(l) != s.toLowerCase().charAt(r)){
                return false;
            }
            l++;
            r--;
       } 
       return true;
    }

    private boolean inAlphabet(char c){
        return (c >= 'A' && c <= 'Z') ||
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9');     
    }
}
