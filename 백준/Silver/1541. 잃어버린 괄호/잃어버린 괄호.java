import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String[] str = input.split("[-]"); // - 이나 [-] 이나 똑같음!
        int answer = 0;

        for(int i = 0; i<str.length; i++){
            String[] temp = str[i].split("[+]");
            if(i == 0){
                answer += cal(temp);
            }else {
                answer -= cal(temp);
            }
        }

        System.out.println(answer);
    }

    static int cal(String[] s){
       int sum = 0;
       for(int i = 0; i<s.length; i++){
           sum+= Integer.parseInt(s[i]);
       }
       return sum;
    }
}