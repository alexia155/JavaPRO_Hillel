package hw3;

public class Exercise6 {
    static int quantity;
    static int firstNumber;
    public static void main(String[] args) {
        quantity = 10;
        firstNumber = 0;

        int[] array = new int[quantity];

        for (int i = 0; i < quantity; i++, firstNumber -= 5) {
            array[i] = firstNumber;
            System.out.print(array[i] + " ");
        }
    }
}
