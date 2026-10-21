class Solution {
    public boolean isValid(String s) {

    Deque<Character> stack = new ArrayDeque<>();

    char c;

    for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            stack.push(s.charAt(i));
        }
        else{

            if(stack.isEmpty()==true){
                return false;
            }

            if(s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
                
            }
             else if(s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
                
            }
            else{
                return false;
            }
        }
        
    }

    return stack.isEmpty();





        
    }
}