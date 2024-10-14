import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<K; i++){
            int x = sc.nextInt();

            if(x == 0){
                stack.pop();
            }else{
                stack.push(x);
            }
        }

        int answer = 0;
        for(int num : stack){
            answer += num;
        }

        System.out.println(answer);
    }
}