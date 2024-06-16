import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자 카드의 개수 N을 입력 받음
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        // 숫자 카드 N개의 정수를 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        // 숫자 카드를 정렬
        Arrays.sort(list);

        // 숫자 카드의 개수 M을 입력 받음
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        // 각 숫자가 숫자 카드에 존재하는지 확인하여 출력
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (binarySearch(list, target) >= 0) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        
        // 출력 버퍼를 플러쉬하고 닫기
        bw.flush();
        bw.close();
        br.close();
    }

    // 이분 탐색 함수
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}