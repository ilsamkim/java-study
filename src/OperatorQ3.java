import java.util.Scanner;
public class OperatorQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = scanner.nextLine();
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scanner.nextLine();
        boolean result = str1.equals(str2);
        System.out.println("두 문자열이 같은가요?" + result);
    }
}
