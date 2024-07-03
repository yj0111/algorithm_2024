import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (String croAlpha : cro) {
            if (text.contains(croAlpha)) {
                text = text.replace(croAlpha, " ");
            }
        }

        System.out.println(text.length());
    }
}