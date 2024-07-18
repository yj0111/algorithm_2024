class Solution {
    boolean solution(String s) {
        char[] list = s.toCharArray();
        
        int p_cnt = 0;
        int y_cnt = 0;
        
        for(int i = 0; i<list.length; i++){
            if(list[i] == 'p' || list[i] == 'P') p_cnt++;
            if(list[i] == 'y' || list[i] == 'Y') y_cnt++;
        }
        
        if(p_cnt == y_cnt){
            return true;
        }return false;
    }
}