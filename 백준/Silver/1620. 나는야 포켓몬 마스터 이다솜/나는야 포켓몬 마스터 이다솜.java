import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String,String> map = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            map.put(Integer.toString(i),name);
            map2.put(name,Integer.toString(i));
        }

        //문제
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            String input = st.nextToken();

            if(map.containsKey(input)){
                System.out.println(map.get(input));
            }else{
                if(map2.containsKey(input)){
                    System.out.println(map2.get(input));
                }
            }
        }
    }
}