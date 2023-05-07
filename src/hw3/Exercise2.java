package hw3;

public class Exercise2 {
    static int n;
    static int i;
    static int factorial;

    public static void main(String[] args) {
        n = 10;
        factorial = 1;
        for (i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("n = " + n + ". Factorial of this number is " + factorial);
    }
}
