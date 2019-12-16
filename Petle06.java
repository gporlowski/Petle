public class Petle06 {
    public static void main(String[] args) {
        int from = 1, to = 459, sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        System.out.println("Suma liczb z zakresu od " + from + " do " + to + " wynosi: " + sum);
    }
}
