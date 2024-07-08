import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        //일단 5그람을 최대한 많이 쓰자
        while(N % 5 != 0 && N >=0){
            N -= 3;
            count++;
        }

        if(N<0){
            System.out.println(-1);
        }else{
            count += N/5;
            System.out.println(count);
        }
    }
}
