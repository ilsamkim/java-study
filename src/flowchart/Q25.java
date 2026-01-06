package flowchart;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("초기 잔액을 설정하세요: ");
        int money = sc.nextInt();

        while (money != 0) {
            System.out.print("\n번호를 입력하세요(1.입금 2.출금): ");
            int select = sc.nextInt();

            if (select != 1 && select != 2){
                System.out.println("입금은 1번을, 출금은 2번을 입력해 주세요.");
                continue;
            }

            System.out.print("금액을 입력하세요: ");
            int amount = sc.nextInt();

            switch (select) {
                case 1:
                    money = money + amount;
                    System.out.println("잔액: " + money);
                    continue;
                case 2:
                    if (money < amount) {
                        System.out.println("출금하려는 금액이 잔액보다 많습니다.");
                    } else {
                        money = money - amount;
                        System.out.println("잔액: " + money);
                    }
                    break;
            }
        }
    }
}
