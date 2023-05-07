package hw3;

public class Exercise8 {
    public static void main(String[] args) {
        int[] new_array = new int[10];
        int counter = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                new_array[counter++] = i;
            }
        }

        int new_array_length = new_array.length;
        for(int i = 0; i<= new_array_length - 1; i++) {
            if(i < new_array_length - 1) {
                System.out.printf("%3d,", new_array[i]);
            }else {
                System.out.printf("%3d.", new_array[i]);
            }
        }
    }
}
