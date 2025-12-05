package chapter1;

public class ArrayQ1 {
    public static void main(String[] args) {
        int[] i = {3, 4, 7, 10, 15, 20};
        System.out.print("짝수: ");
        for(int j = 0; j<i.length; j++){
            if(i[j] % 2 == 0) {
                System.out.print(i[j] + " ");
            }
        }
    }
}
