import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int[] list = new int[N.length()];

        for(int i = 0; i<N.length(); i++){
            list[i] = Integer.parseInt(N.substring(i,i+1));
        }


        Arrays.sort(list);

        for(int i = N.length()-1; i>=0; i--){
            System.out.print(list[i]);
        }

    }
}