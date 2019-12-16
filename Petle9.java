public class Petle9 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < x; i++) {
            for (int k = x; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
