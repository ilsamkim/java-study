package flowchart;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        int i = 1;
        while (i <= 9) {
            int result = i * num;
            System.out.println(num + " X " + i + " = " + result);
            i++;
        }

        sc.close();
    }
}
