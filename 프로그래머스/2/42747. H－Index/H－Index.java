class Solution {
    public int solution(int[] citations) {
        int[] useList = new int[10001]; //인용 리스트
        for(int num : citations ){ 
            useList[num]++;
        }
        
        int n = citations.length;
        int answer = 0;
        
        for(int h = 1; h <= 10000; h++){
            n -= useList[h-1]; 
            if(n >= h){
                answer=h;
            }else break;
        }
        return answer;
    }
}