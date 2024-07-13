import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] list = new Integer[N];
        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        //내림차순 정렬
        Arrays.sort(list, Collections.reverseOrder());
        int total = 0;

        for(int i = 0; i<N; i++){
            total = Math.max(total, list[i] * (i+1));
        }

        System.out.println(total);
    }
}