import java.io.*;
import java.util.*;

public class Main {
static int M, N;
    static int[][] box;
    static int[][] days;
    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1}; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt(); 
        N = sc.nextInt(); 
        box = new int[N][M];
        days = new int[N][M]; 

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    q.add(new int[]{i, j}); // 익은 토마토의 위치를 큐에 추가
                }
            }
        }

        // BFS
        bfs(q);

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1); // 익지 않은 토마토가 남아있는 경우
                    return;
                }
                result = Math.max(result, days[i][j]); // 가장 오래 걸린 날짜를 결과로 저장
            }
        }

        System.out.println(result); 
    }

    static void bfs(Queue<int[]> q) {
        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M && box[nx][ny] == 0) {
                    box[nx][ny] = 1; // 익히고
                    days[nx][ny] = days[x][y] + 1; // 날짜 기록
                    q.add(new int[]{nx, ny}); // 새로운 익은 토마토 큐에 추가
                }
            }
        }
    }
}