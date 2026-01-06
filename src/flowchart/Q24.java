package flowchart;

import java.util.Random;
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int i = random.nextInt(100) + 1;
        int num;

        while (true) {
            System.out.print("1~100 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();

            if (num == i) {
                System.out.println("정답입니다.");
                break;
            } else if (num > i) {
                System.out.println("정답보다 큰 숫자입니다.");
            } else {
                System.out.println("정답보다 작은 숫자입니다.");
            }
        }
        sc.close();
    }
}
