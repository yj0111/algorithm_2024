import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<String,Integer> Nmap = new HashMap<>();
        for(int i = 0; i<N; i++){
            Nmap.put(sc.next(), 1);
        }

        int answer = 0;
        //검사
        for(int i = 0; i<M; i++){
            if(Nmap.containsKey(sc.next())){
               answer++;
            }
        }

        System.out.println(answer);
    }
}