import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int tc = 0; tc<T; tc++){
            String str = sc.next();
            String answer = "YES";

            Stack<Character> stack = new Stack<>();
            for(char x : str.toCharArray()){
                if(x == '('){ // ( 만나면 넣어 
                    stack.push(x);
                }else{
                    if(stack.isEmpty()){ // ) 만났는데 아무것도 없으면 바로 종료하기
                        answer = "NO";
                        break;
                    }else{ // )인데 (있으면 꺼내
                        stack.pop();
                    }
                }
            }

            if(!stack.isEmpty()){
                answer = "NO";
            }

            System.out.println(answer);


        }
    }
}