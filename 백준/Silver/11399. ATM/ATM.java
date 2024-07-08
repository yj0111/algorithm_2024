import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

//        System.out.println(Arrays.toString(list));

        int answer = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<=i; j++){
                answer += list[j];
            }
        }
        System.out.println(answer);
    }
}