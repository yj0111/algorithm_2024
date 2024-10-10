import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = 1;  // 정상은 1로
        }

        // 고장
        for (int i = 0; i < B; i++) {
            int x = sc.nextInt();
            arr[x] = 0;
        }

        // 초기 고장 개수
        int fix = 0;
        for (int i = 1; i <= K; i++) {
            if (arr[i] == 0) {
                fix++;
            }
        }

        int minFix = fix;

        for (int i = K + 1; i <= N; i++) {
            if (arr[i] == 0) {
                fix++;
            }
            if (arr[i - K] == 0) {
                fix--;
            }

            minFix = Math.min(minFix, fix);
        }

        System.out.println(minFix);
    }
}