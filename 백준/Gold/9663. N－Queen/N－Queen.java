import java.io.*;
import java.util.*;

public class Main { // N-Queen
    static int N, answer;
    static int[] col; // col[i] : i번 행의 퀸은 col[i]번 열에 놓았다는 기록

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        col = new int[N+1];
        answer = 0;

        func(1); // 1번 행부터 시작
        System.out.println(answer);
    }

    static void func(int row){
        if(row == N + 1){ // 모든 행에 퀸을 놓았다면
            answer++;
        } else {
            for(int c = 1; c <= N; c++){
                boolean flag = true;
                for(int i = 1; i < row; i++){
                    if(attackable(row, c, i, col[i])){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    col[row] = c;
                    func(row + 1);
                    col[row] = 0; // 백트래킹
                }
            }
        }
    }

    // 공격 가능한지?
    static boolean attackable(int r1, int c1, int r2, int c2){
        if(r1 == r2) return true; // 같은 행
        if(c1 == c2) return true; // 같은 열
        if(Math.abs(r1 - r2) == Math.abs(c1 - c2)) return true; // 대각선 공격

        return false;
    }
}