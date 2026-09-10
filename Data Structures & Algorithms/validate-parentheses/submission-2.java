class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }

        Stack<Character> half = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                half.push(curr);
            }else{
                //curr is a closed bracket
                //removed should be an open one
                if(half.isEmpty()){
                    return false;
                }
                char removed = half.pop();
                if((curr == ')' && removed != '(')
                    || (curr == ']' && removed != '[')
                    || (curr == '}' && removed != '{')){
                        return false;
                }
            }
        }
        if(half.size() != 0){
            return false;
        }
        return true;
    }
}
