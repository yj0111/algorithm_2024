import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list); //이진탐색은 정렬 후 사용해 !!

        int M = sc.nextInt();
        for(int i = 0; i<M; i++){
            if(binarySearch(list, sc.nextInt()) >= 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

    //이진탐색 함수
    static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return 0;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
            return -1;
    }
}