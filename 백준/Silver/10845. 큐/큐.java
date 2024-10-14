import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<N; i++){
            String text = sc.next();
            if(text.equals("push")){
                int x = sc.nextInt();
                q.offer(x);
            }else if(text.equals("pop")){
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(q.poll());
                }
            }else if(text.equals("size")){
                System.out.println(q.size());
            }else if(text.equals("empty")){
                if(q.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if(text.equals("front")){
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(q.peek());
                }
            }else{ // back
                if(q.isEmpty()){
                    System.out.println("-1");
                }else{
                    int size = q.size();
                    for(int k = 1; k<=size -1 ; k++){
                        q.offer(q.remove());
                    }
                    System.out.println(q.peek());
                    q.offer(q.remove());
                }
            }
        }
    }
}