public class ArrayQ2 {
    public static void main(String[] args) {
        int[] i = {2, 5, 8};
        int p = 0;
        for (int j = 0; j<i.length; j++) {
            p += i[j];
        }
        System.out.print("누적합: " + p);
    }
}
