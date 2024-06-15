import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list = new int[9];

        int sum = 0;
        for(int i = 0; i<9; i++){
            list[i] = sc.nextInt();
            sum += list[i];
        }

        for(int i = 0; i<8; i++){
            for(int j = i+1; j<9; j++){
                if(list[i] + list[j] == (sum-100)){
                    list[i] = 0;
                    list[j] = 0;
                    Arrays.sort(list);
                    for(int k = 2; k <9; k++){
                        System.out.println(list[k]);
                    }
                    return;
                }
            }
        }
    }
}