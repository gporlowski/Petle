public class Petle10 {
    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = x; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
