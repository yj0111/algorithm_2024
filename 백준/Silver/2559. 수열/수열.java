import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int answer = 0;
        
        //일단 개수만큼 합 구하기
        for(int i = 0; i<K; i++){
            sum += arr[i];
            answer = sum;
        }
        
        for(int rt = K; rt<N; rt++){
            sum += arr[rt] - arr[rt-K];
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}