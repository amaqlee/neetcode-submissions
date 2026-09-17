class Solution {
    public int evalRPN(String[] tokens) {
        //reverse polish notation
        //if token is operand, push onto stack
        //when reach operator, perform operation on top two elem
        //push result back into stack
        Stack<Integer> nums = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a+b);
            }else if(s.equals("-")){
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a-b);
            }else if(s.equals("*")){
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a*b);
            }else if(s.equals("/")){
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a/b);
            }else{
                nums.push(Integer.parseInt(s));
            }
        }
        return nums.pop();
    }
}
