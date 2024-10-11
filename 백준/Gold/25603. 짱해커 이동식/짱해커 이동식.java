import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] list = new int[N];

        for(int i = 0; i < N; i++){
            list[i] = sc.nextInt();
        }

        // 우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < K; i++) {
            pq.add(list[i]);
        }

        int res = pq.peek();

        // 슬라이딩 윈도우
        for (int i = K; i < N; i++) {
            pq.remove(list[i - K]); // 왼쪽 제거
            pq.add(list[i]);         // 오른쪽 추가

            // 최솟값을 갱신하면서 결과 찾기
            res = Math.max(res, pq.peek());
        }

        System.out.println(res);
    }
}