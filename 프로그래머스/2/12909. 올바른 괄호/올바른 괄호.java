import java.io.*;
import java.util.*;

class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            
            if(c == ')' && stack.peek() == '('){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        System.out.println(stack);

        
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
        
    }
}