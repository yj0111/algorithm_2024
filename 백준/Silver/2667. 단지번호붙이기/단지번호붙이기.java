import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        map = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i<N; i++){
            String line = sc.next();
            for(int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int count = dfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int house : list) {
            System.out.println(house);
        }
    }

    static int dfs(int x, int y){
        visited[x][y] = true;
        int count = 1;

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx<N && ny>=0 && ny<N &&
                    map[nx][ny] == 1 && !visited[nx][ny]){
                count += dfs(nx,ny);
            }
        }
        return count;
    }
}