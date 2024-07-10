import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stairs = new int[N+1];

        for(int i = 1; i<=N; i++){
            stairs[i] = sc.nextInt();
        }

        int[] dp = new int[N+1];

        if(N == 1) {
            dp[1] = stairs[1];
        }else if(N == 2) {
            dp[2] = stairs[1] + stairs[2];
        }else{
            dp[1] = stairs[1];
            dp[2] = stairs[1] + stairs[2];
            dp[3] = Math.max(stairs[1]+ stairs[3] , stairs[2]+ stairs[3]); // 계단 1칸 -> 3칸 올라가기 or 계단 2칸 -> 3칸 올라가기

            for(int i = 4; i<=N; i++){
                dp[i] = Math.max(dp[i-3] + stairs[i] + stairs[i-1], dp[i-2] + stairs[i]);
            }
        }
        System.out.println(dp[N]);
    }
}