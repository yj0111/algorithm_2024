import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N,M,V;
    static int[][] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        list = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //간선끼리 연결 되는거 1
            list[a][b] = 1;
            list[b][a] = 1;
        }


        dfs(V);
        sb.append("\n");
        visited = new boolean[N+1];
        bfs(V);

        System.out.println(sb);
    }
    static void dfs(int start){
        visited[start] = true;
        sb.append(start+ " ");

        for(int i = 0; i<=N; i++){
            if(list[start][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start + " ");

            for(int i = 1; i<=N; i++){
                if(list[start][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}