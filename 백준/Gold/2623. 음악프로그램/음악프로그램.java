import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] degree;
    static StringBuilder sb;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 가수의 수
        M = sc.nextInt(); // PD의 수
        degree = new int[N + 1];
        list = new ArrayList[N + 1];
        sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int count = sc.nextInt();
            int[] orders = new int[count];
            for (int j = 0; j < count; j++) {
                orders[j] = sc.nextInt();
            }
            for (int j = 0; j < count - 1; j++) {
                int from = orders[j];
                int to = orders[j + 1];
                list[from].add(to);
                degree[to]++;
            }
        }

        topo();

        // 모든 노드를 처리하지 못했으면 순서를 정하는 것이 불가능하다.
        for (int i = 1; i <= N; i++) {
            if (degree[i] > 0) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(sb.toString());
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
            sb.append(now).append('\n');

            for (int conn : list[now]) {
                if (--degree[conn] == 0) {
                    q.offer(conn);
                }
            }
        }
    }
}