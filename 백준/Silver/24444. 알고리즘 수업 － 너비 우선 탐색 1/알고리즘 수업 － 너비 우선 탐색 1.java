import java.io.*;
import java.util.*;

public class Main {
    static int N,M,R;
    static List<Integer>[] list;
    static int[] result;
    static boolean[] visited;
    static int order = 1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        result = new int[N+1];
        visited = new boolean[N+1];

        list = new ArrayList[N + 1];
        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0 ; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        //오름차순!!
        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i]);
        }

        bfs(R);

        for(int i = 1; i<=N; i++){
            System.out.println(result[i]);
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            result[x] = order++;

            for(int k : list[x]){
                if(!visited[k]){
                    visited[k] = true;
                    q.offer(k);
                }
            }
        }
    }
}