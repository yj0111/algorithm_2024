import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int answer = 0;
    
        int first = 0;
        int last = people.length-1;
        
        while(first <= last){
            if(people[first] + people[last] <= limit){
                first++;
            }
            
            last--;
            answer++;
            
        }
        return answer;
    }
}