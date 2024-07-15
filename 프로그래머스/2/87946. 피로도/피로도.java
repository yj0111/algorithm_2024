import java.io.*;
import java.util.*;

class Solution {
    static boolean[] visited;
    static int[][] dungeons;
    static int max = 0;
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        
        for(int i = 0; i<dungeons.length; i++){
            if(k >= dungeons[i][0]){
                dfs(i,k,1);
            }
        }
        
        return max;
    }
    
    public void dfs(int num , int k , int depth){
        visited[num] = true;
        k -= dungeons[num][1];
        
        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                dfs(i,k,depth+1);
             }
        }
        
        max = Math.max(depth,max);
        visited[num] = false;
    }
}