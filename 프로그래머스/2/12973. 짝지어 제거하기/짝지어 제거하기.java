import java.io.*;
import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        char[] list = s.toCharArray();
        
        for(int i = 0; i<list.length; i++){
            char c = list[i];
            
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek() == c){
                    stack.pop(); // 짝지어 제거
                }else{
                    stack.push(c);
                }
            }
        }

        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}