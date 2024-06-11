import java.io.*;
import java.util.*;

public class Main {
    // 중복 허용 & 비내림차순
    static int N,M;
    static int[] list;
    static int[] result;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N+1];
        result = new int[M];
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i<=N; i++){
            list[i] = i;
        }

        check(0,1);
        bw.flush();

    }

    static void check(int num, int start) throws IOException{
        if(num == M){
            for(int i = 0; i<M; i++){
                bw.append(result[i] + " ");
            }
            bw.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            result[num] = i;
            check(num+1,i);
        }
    }
}