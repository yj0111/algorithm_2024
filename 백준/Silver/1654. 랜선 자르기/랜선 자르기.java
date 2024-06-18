import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] list = new int[K];
        for(int i = 0; i<K; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        long left = 1;
        long right = list[K-1];

        while(left <= right){
            long mid = (left + right)/2;

            if(MaxCut(list,mid,N)){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(right);
    }

    static boolean MaxCut(int[] list, long mid, int n) {
        int count = 0;

        for(int line : list){
            count += line/mid;
        }

        if(count >= n){
            return true;
        }else{
            return false;
        }
    }
}