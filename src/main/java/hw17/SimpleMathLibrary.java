package hw17;

import java.util.Arrays;

public class SimpleMathLibrary {
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double minus(double number1, double number2) {
        return number1 - number2;
    }

    public static int[] extractElements(int[] intArray) {
        int element = 4;
        int index = -1;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == element) {
                index = i;
                break;
            }
        }
        int startIndex = index + 1;
        int endIndex = intArray.length;
        int[] newArray = Arrays.copyOfRange(intArray, startIndex, endIndex);

        if (index == -1) {
            throw new RuntimeException("There is no '4' in the array.");
        }

        return newArray;
    }

    public static boolean checkArrayComposition(int[] intArray) {
        boolean contains1 = false;
        boolean contains4 = false;

        for (int element : intArray) {
            if (element == 1) {
                contains1 = true;
            } else if (element == 4) {
                contains4 = true;
            }
        }
        return contains1 && contains4;
    }

}
