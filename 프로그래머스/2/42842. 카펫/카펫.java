class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int x = 0; 
        int y = 3; //최소 3은 있어야해
        
        int[] answer = new int[2];
        
        while(true){
            if(total % y != 0){
                y++;
                continue;
            };
            
            x = total / y;
            
            if((x-2)*(y-2) == yellow){
                return new int[] {x,y};
            }
            y++;
        }
    }
}