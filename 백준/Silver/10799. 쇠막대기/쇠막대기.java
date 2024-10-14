import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i) == '('){
                stack.push('(');
            }else{// ')'이면
                    stack.pop();
                if(text.charAt(i-1) == '('){ // 레이저! 
                    answer += stack.size();
                }else{
                    answer++; // 막대기 끝
                }
            }
        }
        System.out.println(answer);
    }
}