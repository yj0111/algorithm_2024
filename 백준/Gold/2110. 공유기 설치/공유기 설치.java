import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] houses = new int[N];

        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }

        Arrays.sort(houses);

        int left = 1;
        int right = houses[N - 1] - houses[0]; // 최대거리
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 1; // 첫 번째 집에 공유기 설치
            int last = houses[0];

            for (int i = 1; i < N; i++) {
                if (houses[i] - last >= mid) {
                    count++;
                    last = houses[i];
                }
            }

            if (count >= C) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}