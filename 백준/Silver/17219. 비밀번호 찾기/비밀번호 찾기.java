import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();//주소의 수
        int M = sc.nextInt();//비번 찾고싶어

        HashMap<String, String> map = new HashMap<>();
        for(int i = 0 ; i<N; i++){
            String site = sc.next();
            String pwd = sc.next();

            map.put(site,pwd);
        }

        for(int i = 0; i<M; i++){
            String find = sc.next();
            System.out.println(map.get(find));
        }

    }
}