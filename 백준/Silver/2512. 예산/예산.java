import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int list[] = new int[N];
        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        int M = sc.nextInt(); // M은 N이상 10억 이하
        int answer = 0;

        //일단 정렬하자!
        Arrays.sort(list);

        //이분탐색
        int left = 0;
        int right = list[N-1];
        while(left <= right){
            int mid = (left + right)/2;
            long sum = 0;

            for(int x : list){
                if(mid >= x){
                    sum += x;
                }else{
                    sum += mid;// 초과되면 제한해
                }
            }

            if(sum > M){
                right = mid-1;
            }else{
                left = mid+1;
                answer = Math.max(answer,mid);
            }
        }

        System.out.println(answer);
    }
}