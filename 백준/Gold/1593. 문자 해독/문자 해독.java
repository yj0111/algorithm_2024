import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //찾고싶은 단어 길이
        int M = sc.nextInt(); //벽화에서 발견한 단어 길이
        String word = sc.next();//찾고싶은 단어
        HashMap<Character, Integer> wordMap = new HashMap<>();

        //다 짤라서 저장하기
        for(char c : word.toCharArray()){
            wordMap.put(c, wordMap.getOrDefault(c,0)+1);
        }

        String find = sc.next();//실제 단어
        HashMap<Character,Integer> findMap = new HashMap<>();
        for(int i = 0; i<N-1; i++){
            findMap.put(find.charAt(i),findMap.getOrDefault(find.charAt(i),0)+1);
        } //단어길이 하나 짧은거 초기 세팅해두기

        int lt = 0;
        int answer = 0;

        for(int rt = N-1; rt<M; rt++){
            findMap.put(find.charAt(rt), findMap.getOrDefault(find.charAt(rt),0)+1); // 뒤에꺼 추가해

            if(wordMap.equals(findMap)){
                answer++;
            } // 비교하기 

            findMap.put(find.charAt(lt),findMap.get(find.charAt(lt)) - 1); // 전에꺼 지워줘

            if(findMap.get(find.charAt(lt)) == 0){
                findMap.remove(find.charAt(lt));
            } // 비어있는거 지워주기

            lt++;
        }


        System.out.println(answer);
    }
}