package hw3;

public class Exercise8 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int counter = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                myArray[counter++] = i;
            }
        }

        int newLength = myArray.length;
        for (int i = 0; i <= newLength - 1; i++) {
            if (i < newLength - 1) {
                System.out.printf("%3d,", myArray[i]);
            } else {
                System.out.printf("%3d.", myArray[i]);
            }
        }
    }
}
