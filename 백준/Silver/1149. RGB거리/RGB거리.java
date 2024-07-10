import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] paint = new int[N][3];
        int[][] dp = new int[N][3];
        for(int i = 0; i<N; i++) {
            for (int j = 0; j < 3; j++) {
                paint[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = paint[0][0];
        dp[0][1] = paint[0][1];
        dp[0][2] = paint[0][2];

        for(int i = 1; i<N; i++){
            dp[i][0] = paint[i][0] + Math.min(dp[i-1][1] , dp[i-1][2]);
            dp[i][1] = paint[i][1] + Math.min(dp[i-1][0] , dp[i-1][2]);
            dp[i][2] = paint[i][2] + Math.min(dp[i-1][0] , dp[i-1][1]);
        }

        int min = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));

        System.out.println(min);
    }
}