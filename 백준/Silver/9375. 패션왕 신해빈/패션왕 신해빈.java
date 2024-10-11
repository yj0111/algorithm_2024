import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt(); //테스트 수
        for(int t = 0; t<tc; t++){
            int n = sc.nextInt();

            HashMap<String,Integer> map = new HashMap<>();
            for(int i = 0; i<n; i++){
                String s1 = sc.next();
                String s2 = sc.next();
                map.put(s2,map.getOrDefault(s2,0)+1);
            }

            int answer = 1;

            for (int count : map.values()) {
                answer *= (count + 1);
            }
            answer -= 1; // 옷 안입는 경우

            System.out.println(answer);
        }
    }
}