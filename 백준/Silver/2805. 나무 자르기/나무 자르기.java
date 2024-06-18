import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 나무의 수
        int[] trees = new int[N];
        int M = sc.nextInt(); // 상근이가 가져가고 싶어

        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }

        Arrays.sort(trees);

        long left = 0;
        long right = trees[N-1];

        while(left <= right){
            long mid = (left + right)/2;

            if(TreeCut(trees,mid,M)){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }

        System.out.println(right);
    }

    static boolean TreeCut(int[] trees, long mid, int m) {
        long count = 0;

        for(int tree : trees) {
            if(tree > mid){ // 나무보다 작아야 자르지
                count += tree - mid;
            }
        }
            if(count >= m){
                return true;
            }else{
                return false;
            }
    }
}