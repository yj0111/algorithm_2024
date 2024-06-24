import java.io.*;
import java.util.*;

public class Main {
    static int N, M, R;
    static List<Integer>[] node;
    static boolean[] visited;
    static int[] result;
    static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        node = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            node[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];
        result = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            node[x].add(y);
            node[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(node[i]);
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(result[i]);
        }
    }

    static void dfs(int x) {
        visited[x] = true;
        result[x] = order++;
        for (int y : node[x]) {
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
}