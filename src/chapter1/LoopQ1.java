package chapter1;

import java.util.Scanner;

public class LoopQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 구구단 단수를 입력하세요 (2~9): ");
        int o = scanner.nextInt();

        // for문 활용하기
        //for (int i = 1; i <= 9; i++) {
        //    System.out.println(o + " x " + i + " = " + i * o);
        //}

        // while문 활용하기
        int i = 1;
        while (i <= 9) {
            System.out.println(o + " x " + i + " = " + i * o);
            i++;
        }
    }
}
