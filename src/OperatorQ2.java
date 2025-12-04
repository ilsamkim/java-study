public class OperatorQ2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        boolean isGreater = x > y;
        boolean isSmaller = x < y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;

        System.out.println("x가 y보다 큰가? " + isGreater);
        System.out.println("x가 y보다 작은가? " + isSmaller);
        System.out.println("x와 y가 같은가? " + isEqual);
        System.out.println("x와 y가 다른가? " + isNotEqual);
    }
}
