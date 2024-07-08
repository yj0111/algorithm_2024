import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //동전 0 문제 -> 그리디로 풀기!

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] list = new int[N];

        //동전
        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        int count = 0; //정답

        for(int i = N-1; i>=0; i--){
            count += K/list[i];
            K = K%list[i];
        }

        System.out.println(count);

    }
}