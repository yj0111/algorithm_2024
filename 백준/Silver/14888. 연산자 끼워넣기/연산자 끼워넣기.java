import java.io.*;
import java.util.*;

public class Main {
    static int N, max, min;
    static int[] numbers; // 주어진 숫자
    static int[] operator; // 연산자들 + - * /
    static int[] order; // 연산자들 넣을 순서

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        operator = new int[4];
        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        order = new int[N - 1]; // 숫자가 N개면 연산자는 N-1 개

        func(0);
        System.out.println(max);
        System.out.println(min);
    }

    static int cal() { // 계산기
        int value = numbers[0]; //초기값
        for (int i = 0; i < N - 1; i++) {
            if (order[i] == 0) {
                value += numbers[i + 1];
            } else if (order[i] == 1) {
                value -= numbers[i + 1];
            } else if (order[i] == 2) {
                value *= numbers[i + 1];
            } else if (order[i] == 3) {
                value /= numbers[i + 1];
            }
        }
        return value;
    }

    static void func(int k) {
        if (k == N - 1) {
            int value = cal();
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int i = 0; i < 4; i++) {
                if (operator[i] > 0) {
                    operator[i]--;
                    order[k] = i;
                    func(k + 1);
                    operator[i]++;
                }
            }
        }
    }
}