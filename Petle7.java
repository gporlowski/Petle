public class Petle7 {
    public static void main(String[] args) {
        int firstWord = 5, difference = 2, numberOfWords = 459, sum = 0;
        for (int i = 1; i <= numberOfWords; i++) {
            sum += firstWord;
            firstWord += difference;
        }
        System.out.println("Suma wyrazów ciągu arytmetycznego wynosi: " + sum);
    }
}
