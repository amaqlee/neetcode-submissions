class Solution {
    public boolean isPalindrome(String s) {
        //edge: if charAt is not in the alphabet
        //not the same case
        //use two pointers
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            //loop until left is a valid char
            while(left < right && !isAlphabet(s.charAt(left))){
                left++;
            }

            //loop until right is a valid char
            while(left < right && !isAlphabet(s.charAt(right))){
                right--;
            }

            String first = s.substring(left, left+1).toLowerCase();
            String last = s.substring(right, right+1).toLowerCase();

        
            if(!first.equals(last)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isAlphabet(char c){
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
