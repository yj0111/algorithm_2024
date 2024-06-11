import java.io.*;
import java.util.*;

public class Main {
    //중복 허용 X 증가
    static int N;
    static int M;
    static int[] list;
    static int[] result;
    static boolean[] visited;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        list = new int[N+1];
        result = new int[M];
        visited = new boolean[N+1];
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 1; i<=N; i++){
            list[i] = i;
        }

        check(0,1);
        bw.flush();

    }

    static void check(int num,int start) throws IOException{
        if(num == M){
            for(int i = 0; i<M; i++){
                bw.append(result[i]+" ");
            }
            bw.append("\n");
            return;
        }

        for(int i = start; i<=N; i++){
            if(!visited[i]){
                visited[i] = true;
                result[num] = list[i];
                check(num+1,i);
                visited[i] = false;
            }
        }
    }
}