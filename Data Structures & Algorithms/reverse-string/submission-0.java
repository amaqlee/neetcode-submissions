class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length/2; i++){
            char first = s[i];
            char sec = s[s.length-1-i];
            s[i] = sec;
            s[s.length-1-i] = first;
        }
    }
}