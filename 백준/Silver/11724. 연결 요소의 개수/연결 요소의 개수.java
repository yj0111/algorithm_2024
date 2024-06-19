import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
           list[i] = new ArrayList<>();
        }

        int M = Integer.parseInt(st.nextToken());
        for(int i =1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            list[s].add(e);
            list[e].add(s);
        }

        int count = 0;
        for(int i = 1; i<N+1; i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int i){
        if(visited[i]){
            return;
        }
        visited[i] = true;
        for(int a : list[i]){
            if(!visited[a]){
                dfs(a);
            }
        }
    }
}