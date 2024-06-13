import java.io.*;
import java.util.*;

public class Main {
    static int N,S,ans;
    static int[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();
        list = new int[N];

        for(int i = 0; i<N; i++){
            list[i] = sc.nextInt();
        }

        func(0,0);

        if(S == 0) ans--; //합이 0인경우 공집합이 하나 포함되니까 ! 하나 빼!

        System.out.println(ans);

    }

    static void func(int k, int value){
        if(k == N){
            if(value == S){
                ans++;
            }
        }else{
            func(k+1,value+list[k]);
            func(k+1,value);
        }
    }
}