import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                int NewValue = map.get(num)+1;
                map.put(num,NewValue);
            }else{
                map.put(num,1);
            }
        }
//        System.out.println(map);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(map.containsKey(target)){
                bw.write(map.get(target)+" ");
            }else{
                bw.write("0 ");
            }
        }

        bw.flush();
    }
}