import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] maxDp = new int[3];
        int[] minDp = new int[3];
        int[] tempMax = new int[3];
        int[] tempMin = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxDp[i] = num;
            minDp[i] = num;
        }

        // 두 번째 줄부터
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                int num = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    tempMax[j] = num + Math.max(maxDp[0], maxDp[1]);
                    tempMin[j] = num + Math.min(minDp[0], minDp[1]);
                } else if (j == 1) {
                    tempMax[j] = num + Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
                    tempMin[j] = num + Math.min(minDp[0], Math.min(minDp[1], minDp[2]));
                } else {
                    tempMax[j] = num + Math.max(maxDp[1], maxDp[2]);
                    tempMin[j] = num + Math.min(minDp[1], minDp[2]);
                }
            }

            for (int j = 0; j < 3; j++) {
                maxDp[j] = tempMax[j];
                minDp[j] = tempMin[j];
            }
        }

        int maxResult = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
        int minResult = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));

        System.out.println(maxResult + " " + minResult);
    }
}