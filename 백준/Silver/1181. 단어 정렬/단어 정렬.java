import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] list = new String[N];

        for(int i = 0; i<N; i++){
            list[i] = sc.next();
        }

        Arrays.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }else{
                    return o1.length() - o2.length();
                }
            }
        });


        System.out.println(list[0]);

        for(int i = 1; i<N; i++){
            if(!list[i].equals(list[i-1])){
                System.out.println(list[i]);
            }
        }
    }
}