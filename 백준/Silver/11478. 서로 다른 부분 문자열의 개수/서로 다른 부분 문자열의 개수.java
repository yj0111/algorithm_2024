import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int size = text.length();

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 1; i<=size; i++){
            for(int j = 0; j<=size-i; j++){
                map.put(text.substring(j,j+i),map.getOrDefault(text.substring(j,j+i),0)+1);
            }
        }

        System.out.println(map.size());
    }
}