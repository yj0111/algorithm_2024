import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[101][101];
        for(int i = 0; i<4; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int k = x1; k<x2; k++){
                for(int m = y1; m<y2; m++){
                    map[k][m] = 1;
                }
            }
        }

        int ans = 0;
        for(int i = 0; i<101; i++){
            for(int j = 0; j<101; j++){
                if(map[i][j] == 1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}