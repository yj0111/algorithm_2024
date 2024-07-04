import java.io.*;
import java.util.*;

//2:13
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//색종이의 수

        int[][] map = new int[101][101];
        for(int i = 0; i<N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j<x+10; j++){
                for(int k = y; k<y+10; k++){
                    map[j][k] = 1;
                }
            }
        }

        int count = 0;
        for(int i = 0; i<101; i++){
            for(int j = 0; j<101; j++){
                if(map[i][j] == 1) count++;
            }
        }

        System.out.println(count);

    }
}