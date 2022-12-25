package session27;

import java.util.Stack;

public class validpara {
	public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '['  || ch == '{'){
                stack.push(ch);
            }
            else{
            if(stack.isEmpty()){
                return false;
            }
             char ele = stack.pop();
             if( (ch==')' && ele != '(') ||  
             (ch==']' && ele != '[')   ||  (ch=='}' && ele != '{') ){
                 return false;
             }



            }




        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;






    }
}
