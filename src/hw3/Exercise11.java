package hw3;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scannerNumbers = new Scanner(System.in);
        System.out.println("Enter numbers to the array in one line: ");
        String stringOfNumbers = scannerNumbers.nextLine();

        String[] arrayOfString = stringOfNumbers.split(" ");
        int min = Integer.parseInt(arrayOfString[0]);
        int max = Integer.parseInt(arrayOfString[0]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < arrayOfString.length; i++) {
            int parse = Integer.parseInt(arrayOfString[i]);
            if (parse < min) {
                min = parse;
                minIndex = i;
            }
            if (parse > max) {
                max = parse;
                maxIndex = i;
            }
        }

        arrayOfString[maxIndex] = Integer.toString(min);
        arrayOfString[minIndex] = Integer.toString(max);

        for (String s : arrayOfString) {
            System.out.printf("%s ", s);
        }


    }
}
