public class LoopQ2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("==== " + i + "단 ====");
            for (int o = 1; o <= 9; o++) {
                System.out.println(i + " x " + o + " = " + i * o);
            }
            System.out.print("\n");
        }
    }
}