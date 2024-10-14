import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<N; i++){
            String text = sc.next();
            if(text.equals("push")){
                int x = sc.nextInt();
                stack.push(x);
            }else if(text.equals("pop")){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.pop());
                }
            }else if(text.equals("size")){
                System.out.println(stack.size());
            }else if(text.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else{ // top
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}