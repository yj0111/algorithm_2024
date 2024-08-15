import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> wordlist = new ArrayList<>(); //사용한 단어
        wordlist.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String word = words[i]; 
            //사용한 단어 인지 확인하기
            if (wordlist.contains(word)) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            String lastWord = wordlist.get(i - 1); 
            // 끝말잇기 실패 
            if (lastWord.charAt(lastWord.length() - 1) != word.charAt(0)) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            wordlist.add(word);
        }
        
        return new int[] {0, 0};
    }
}