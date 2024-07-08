import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 도시
        int[] len = new int[N-1]; // 도시 사이의 거리
        int[] cost = new int[N]; // 기름 값

        for(int i = 0; i<N-1; i++){
            len[i] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){
            cost[i] = sc.nextInt();
        }

        int answer = 0; // 정답

        int min = cost[0]; //일단 맨 처음 가격

        for(int i = 0; i<N-1; i++){
            if(cost[i] < min) {
                min = cost[i];
            }
            answer += min * len[i];
        }
        System.out.println(answer);
    }
}