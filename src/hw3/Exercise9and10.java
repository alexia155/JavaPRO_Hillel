package hw3;

import java.util.Scanner;

public class Exercise9and10 {
    public static void main(String[] args) {
        Scanner scannerNumbers = new Scanner(System.in);
        System.out.println("Enter numbers to the array in one line: ");
        String stringOfNumbers = scannerNumbers.nextLine();
        String[] arrayOfString = stringOfNumbers.split(" ");
        int min = Integer.parseInt(arrayOfString[0]);
        int max = Integer.parseInt(arrayOfString[0]);

        for (int i = 0; i < arrayOfString.length; i++) {
            int parse = Integer.parseInt(arrayOfString[i]);
            //9 exercise - to show MIN
            if (parse < min) {
                min = parse;
            }
            //10 exercise - to show MAX
            if (parse > max) {
                max = parse;
            }
        }
        System.out.println("The min value is " + min);
        System.out.println("The max value is " + max);
    }
}
