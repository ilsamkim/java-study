package flowchart;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = sc.nextInt();
        System.out.print("연산자를 입력하세요: ");
        operator = sc.next();

        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("\n결과: " + num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("\n결과: " + num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("\n결과: " + num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("\n0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.print("\n결과: " + num1 + " / " + num2 + " = " + result);
                }
                break;
        }

        sc.close();
    }
}
