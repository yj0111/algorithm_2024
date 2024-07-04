import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        char[][] board = new char[N][M];
        for(int i = 0; i<N; i++){
            String line = sc.next();
            for(int j = 0; j<M; j++){
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        //8x8 탐색
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j<= M-8; j++){
                min = Math.min(min, findMin(board,i,j));
            }
        }

        System.out.println(min);

    }

    public static int findMin(char[][] board, int x, int y){
        String[] patterns = { "BWBWBWBW", "WBWBWBWB" };
        int paint1 = 0; //BWBWBW
        int paint2 = 0; //WBWBWB

        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                if(board[x+i][y+j] != patterns[i%2].charAt(j)){
                    paint1++;
                }

                if(board[x+i][y+j] != patterns[(i+1)%2].charAt(j)){
                    paint2++;
                }
            }
        }
        return Math.min(paint1,paint2);
    }
}