import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[] degree;
    static StringBuilder sb;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sb = new StringBuilder();

        list = new ArrayList[N+1];

        for(int i = 1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        degree = new int[N+1];

        for(int i = 0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            list[x].add(y);

            degree[y]++;
        }

        topo();
        System.out.println(sb);
    }

    static void topo() {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (degree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();

            sb.append(now + " ");

            for (int conn : list[now]) {
                if (--degree[conn] == 0) {
                    q.offer(conn);
                }
            }
        }
    }
}