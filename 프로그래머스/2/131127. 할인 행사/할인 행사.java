import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0; 

        // 원하는상품map
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++){
            // 할인상품map
            HashMap<String, Integer> dMap = new HashMap<>();

            for(int j = 0; j < 10; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }

            boolean check = true;

            for(String key : map.keySet()){
                if(map.get(key) == null || !map.get(key).equals(dMap.get(key))){
                    check = false; 
                    break;
                }
            }

            if(check){
                answer++;
            }
        }

        return answer; 
    }
}
