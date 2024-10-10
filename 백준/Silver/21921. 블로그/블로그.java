import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        // 초기 X 기간 합
        int sum = 0;
        for(int i = 0; i < X; i++){
            sum += arr[i];
        }

        int answer = sum;
        int cnt = 1;

        for(int j = X; j < N; j++){
            sum += arr[j] - arr[j-X];

            if(sum > answer) {
                answer = sum;
                cnt = 1;
            } else if(sum == answer) {
                cnt++;
            }
        }

        if(answer == 0){
            System.out.println("SAD");
        } else {
            System.out.println(answer);
            System.out.println(cnt);
        }
    }
}