import java.io.*;
import java.util.*;

public class Main {
    static int N; // 1~N
    static int M; // M개 고르기
    static int[] list; // 1~N 저장
    static int[] result; // 결과
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = sc.nextInt();
        M = sc.nextInt();

        list = new int[N+1];
        for(int i = 1; i<=N; i++){
            list[i] = i;
        }

        result = new int[M];
        check(0);

        bw.flush();
    }

    public static void check(int num) throws IOException{
        if(num == M){
            for(int i = 0; i<M; i++){
                bw.append(result[i]+" ");
            }
            bw.append("\n");
            return;
        }

        for(int i = 1; i<=N; i++){
            result[num] = list[i];
            check(num+1);
        }
    }
}