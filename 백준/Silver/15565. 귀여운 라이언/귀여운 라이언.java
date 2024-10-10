import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int cnt = 0; // 라이언 몇개
        int answer = Integer.MAX_VALUE;
        int lt = 0; // 왼쪽

        for(int rt = 0; rt < N; rt++) {
            if(arr[rt] == 1) { 
                cnt++;
            }

            while(cnt >= K) {
                answer = Math.min(answer, rt - lt + 1);
                if(arr[lt] == 1) {
                    cnt--;
                }
                lt++;
            }
        }

        if(answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}