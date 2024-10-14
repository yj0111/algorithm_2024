import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        Stack<Integer> stack = new Stack<>();  
        StringBuilder sb = new StringBuilder(); 
        int start = 0;  // 지금까지 스택에 추가한 숫자중에 젤큰거

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > start) {
                for (int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n"); 
                }
                start = num; 
            }

            if (stack.peek() != num) {
                System.out.println("NO");
                return; 
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
    }
}