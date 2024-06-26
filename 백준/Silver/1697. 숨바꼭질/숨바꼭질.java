import java.io.*;
import java.util.*;

public class Main {
    static int N, K;
    static boolean[] visited;
    static int[] map;
    static int[] move = {-1, 1, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        visited = new boolean[100001];
        map = new int[100001];

        if (N == K) {
            System.out.println("0");
        } else {
            System.out.println(bfs(N, K));
        }
    }

    static int bfs(int start, int target) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        map[start] = 0;

        while (!q.isEmpty()) {
            int current = q.poll();

            for (int i = 0; i < move.length; i++) {
                int next;
                if (i < 2) {
                    next = current + move[i];
                } else {
                    next = current * move[i];
                }

                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    map[next] = map[current] + 1;
                    q.offer(next);

                    if (next == target) {
                        return map[next];
                    }
                }
            }
        }
        return -1;
    }
}