package hw3;

public class Exercise3 {
    public static void main(String[] args) {
        outputOddNumbers();
        checkFactorial();
    }

    private static void outputOddNumbers() {
        int i = 1;
        while (i <= 99) {
            if (i % 2 != 0) {
                System.out.printf(" %d", i);
            }
            i++;
        }
    }

    private static void checkFactorial() {
        int factorial = 1;
        int number = 10;
        int i = 2;

        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("\n n = " + number + ". Factorial of this number is " + factorial);
    }

}
