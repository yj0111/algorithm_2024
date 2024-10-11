import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] num = new int[N + 1];
        num[1] = 1;

        for (int i = 2; i <= N; i++) {
            if (num[i] == 0) {
                for (int j = i + i; j <= N; j += i) { // i의 배수 제거
                    num[j] = 1;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (num[i] == 0) { 
                System.out.println(i);
            }
        }
    }
}