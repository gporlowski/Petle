public class Petle5 {
    public static void main(String[] args) {
        int from = 0, to = 100;
        for (int i = from; i <= to; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(", podzielne przez 2");
            }
            if (i % 3 == 0) {
                System.out.print(", podzielne przez 3");
            }
            if (i % 5 == 0) {
                System.out.print(", podzielne przez 5");
            }
            System.out.println();
        }
    }
}
