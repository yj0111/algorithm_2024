import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();

        int[] index = new int[line.length()];

        for(int i = 0; i<line.length(); i++){
            if(line.charAt(i) == 'Y'){
                index[i] = 1;
            }else{
                index[i] = 0;
            }
        }

        int count = 0;

        for(int i = 0; i<line.length(); i++){
            if(index[i] == 1){
                count++;
                for(int j = i; j<line.length(); j+=(i+1)){
                    if(index[j] == 1){
                        index[j] =0;
                    }else{
                        index[j] = 1;
                    }
                }
            }
        }
        System.out.println(count);


    }
}