import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 도시
        long[] len = new long[N-1]; // 도시 사이의 거리
        long[] cost = new long[N]; // 기름 값

        for(int i = 0; i<N-1; i++){
            len[i] = sc.nextLong();
        }

        for(int i = 0; i<N; i++){
            cost[i] = sc.nextLong();
        }

        long answer = 0; // 정답

        long min = cost[0]; //일단 맨 처음 가격

        for(int i = 0; i<N-1; i++){
            if(cost[i] < min) {
                min = cost[i];
            }
            answer += min * len[i];
        }
        System.out.println(answer);
    }
}