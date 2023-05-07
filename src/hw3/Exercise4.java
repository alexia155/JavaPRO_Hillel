package hw3;

public class Exercise4 {
    public static void main(String[] args) {
        outputOddNumbers();
        checkFactorial();
    }

    private static void outputOddNumbers() {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.printf(" %d", i);
            }
            i++;
        } while (i <= 99);
    }

    private static void checkFactorial() {
        int factorial = 1;
        int number = 10;
        int i = 2;

        do {
            factorial = factorial * i;
            i++;
        } while (i <= number);
        System.out.println("\n n = " + number + ". Factorial of this number is " + factorial);
    }

}
