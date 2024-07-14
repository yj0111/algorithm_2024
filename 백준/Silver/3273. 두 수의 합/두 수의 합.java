import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //수열의 크기
        int[] nums = new int[N];
        for(int i = 0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int result = sc.nextInt(); //두수의 합

        int left = 0;
        int right = N-1;

        int count = 0; //쌍의 개수

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == result){
                count++;
                left++;
                right--;
            }else if(sum > result){
                right--;
            }else{
                left++;
            }
        }

        System.out.println(count);
    }
}