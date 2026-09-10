class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }

        Stack<Character> half = new Stack<>();
        for(int i = 0; i < s.length() / 2; i++){
            half.push(s.charAt(i));
        }

        for(int i = s.length() / 2; i < s.length(); i++){
            char removed = half.pop();
            char curr = s.charAt(i);
            if(curr == ')' && removed != '('){
                return false;
            }
            if(curr == '}' && removed != '{'){
                return false;
            }
            if(curr == ']' && removed != '['){
                return false;
            }
        }
        return true;
    }
}
