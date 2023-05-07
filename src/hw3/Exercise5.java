package hw3;

public class Exercise5 {
    static int x;
    static int n;
    static int result;

    public static void main(String[] args) {
        x = 3;
        n = 2;

        System.out.println("Result is " + calculateDegree(x, n));
    }

    private static int calculateDegree(int x, int n) {
        result = (int) Math.pow(x, n);
        return result;
    }
}