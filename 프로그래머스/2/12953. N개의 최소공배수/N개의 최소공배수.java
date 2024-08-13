import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;

        int num = lcm(arr[0], arr[1]);

        for(int i = 2; i < arr.length; i++) {
            num = lcm(num, arr[i]);
        }

        answer = num;

        return answer;
    }

    //최대공약수
    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //최소공배수
    public int lcm(int a, int b) {
        return (a * b) / gcd(a , b);
    }
    
}
