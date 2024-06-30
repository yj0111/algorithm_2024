import java.io.*;
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        int[] list = new int[arr.length];
        
        for(int i = 0; i< list.length; i++){
            list[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(list);
        
        return list[0] + " " + list[list.length-1];
    }
}