import java.util.*;

public class Main {
    static int[][][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 계속 계산하면 시간 초과나니까 값 저장해두기
        dp = new int[21][21][21];
        //크기가 21 인 이유 : 조건 1) 하나라도 음수이면 바로 1 반환하고
        //조건 2 ) 하나라도 20 이상이면 w(20,20,20)을 반환하기 떄문에 더 큰 숫자 필요없음!!

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if (x == -1 && y == -1 && z == -1) break;

            System.out.printf("w(%d, %d, %d) = %d\n", x, y, z, w(x, y, z));
        }
    }

    static int w(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return 1;
        } 
        
        if (x > 20 || y > 20 || z > 20) {
            return w(20, 20, 20);
        }

        if (dp[x][y][z] != 0) {
            return dp[x][y][z];
        }

        if (x < y && y < z) {
            dp[x][y][z] = w(x, y, z - 1) + w(x, y - 1, z - 1) - w(x, y - 1, z);
            return dp[x][y][z];
        }

        dp[x][y][z] = w(x - 1, y, z) + w(x - 1, y - 1, z)
                    + w(x - 1, y, z - 1) - w(x - 1, y - 1, z - 1);
        return dp[x][y][z];
    }
}