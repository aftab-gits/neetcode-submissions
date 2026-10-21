class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int result=0;

        for(String s : tokens){

            if (!s.equals("*") && !s.equals("+") && !s.equals("-") && !s.equals("/")){
                stack.push(Integer.parseInt(s));
            }
            else{
                if(s.equals("+")){
                    int num1= stack.pop();
                    int num2 = stack.pop();
                    result = num1+num2;
                    stack.push(result);
                }
                else if(s.equals("-")){
                    int num1= stack.pop();
                    int num2 = stack.pop();
                    result =  num2-num1;
                    stack.push(result);
                }
                else if(s.equals("*")){
                    int num1= stack.pop();
                    int num2 = stack.pop();
                    result = num1*num2;
                    stack.push(result);
                }
                else{
                    
                    int num1= stack.pop();
                    int num2 = stack.pop();
                    result = num2/num1;
                    stack.push(result);
                }
                
                

            }
        }
        
        return stack.peek();
    }
}