import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> set = new HashSet<>();
        
        // 크기 1부터 n 까지
        for (int r = 1; r <= n; r++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = start; i < start + r; i++) {
                    sum += elements[i % n]; //원형배열
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}