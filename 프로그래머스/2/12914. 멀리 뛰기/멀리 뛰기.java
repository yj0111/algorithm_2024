import java.io.*;
import java.util.*;

class Solution {
    public long solution(int n) {
        long[] fb = new long[2001];
        
        fb[1] = 1;
        fb[2] = 2;
        
        for(int i = 3; i<=n; i++){
            fb[i] = (fb[i-2] + fb[i-1]) % 1234567;
        }
        
        return fb[n];
    }
}