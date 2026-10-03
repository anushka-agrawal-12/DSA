package Strings;

import java.util.Stack;

public class longestValidParenthesis {
    public static int isValid(String s){
        int length=0;
        int maxLength=0;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    length=i-stack.peek();
                    maxLength=Math.max(length,maxLength);
                }
            }
           
        }
        return maxLength;
    }
}
