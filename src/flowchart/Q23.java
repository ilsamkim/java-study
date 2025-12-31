package flowchart;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1: do-while
        System.out.println("=== 방법 1: do-while ===");
        int n1;
        do {
            System.out.print("정수 n을 입력하세요 : ");
            n1 = sc.nextInt();

            if (n1 < 0) {
                System.out.println("양의 정수를 입력해주세요.");
            }
        } while (n1 < 0);

        int result1 = 1;
        int i1 = 1;
        while (i1 <= n1){
            result1 = result1 * i1;
            i1++;
        }
        System.out.println(n1 + "! = " + result1);


        // 방법 2: boolean
        System.out.println("\n=== 방법 2: boolean 플래그 ===");
        int n2 = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("정수 n을 입력하세요 : ");
            n2 = sc.nextInt();

            if (n2 < 0) {
                System.out.println("양의 정수를 입력해주세요.");
            } else {
                valid = true;
            }
        }

        int result2 = 1;
        int i2 = 1;
        while (i2 <= n2){
            result2 = result2 * i2;
            i2++;
        }
        System.out.println(n2 + "! = " + result2);


        // 방법 3: 무한 루프
        System.out.println("\n=== 방법 3: 무한 루프 + break ===");
        int n3;

        while (true) {
            System.out.print("정수 n을 입력하세요 : ");
            n3 = sc.nextInt();

            if (n3 >= 0) {
                break;
            }
            System.out.println("양의 정수를 입력해주세요.");
        }

        int result3 = 1;
        int i3 = 1;
        while (i3 <= n3){
            result3 = result3 * i3;
            i3++;
        }
        System.out.println(n3 + "! = " + result3);

        sc.close();
    }
}
