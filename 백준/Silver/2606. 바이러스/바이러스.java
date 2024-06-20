import java.io.*;
import java.util.*;

public class Main {
    static int[][] network;
    static boolean[] visited;
    static int N,M,count;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        network = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            network[a][b] = network[b][a] = 1;
        }

        dfs(1);
        System.out.println(count-1);

    }

    static void dfs(int start){
        visited[start] = true;
        count++;

        for(int i = 1; i<=N; i++){
            if(network[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

}