package hw15;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("------------------THE 1ST TASK------------------");
        printThreeWords();
        System.out.println("------------------THE 2ND TASK------------------");
        checkSumSign();
        System.out.println("------------------THE 3RD TASK------------------");
        printColor();
        System.out.println("------------------THE 4TH TASK------------------");
        compareNumbers();
        System.out.println("------------------THE 5TH TASK------------------");
        int a, b;
        a = 5;
        b = 10;
        boolean result = verifySum(a, b);
        System.out.println(result);
        System.out.println("------------------THE 6TH TASK------------------");
        int number = -4;
        checkNumSign(number);
        System.out.println("------------------THE 7TH TASK------------------");
        number = 11;
        result = verifyNum(number);
        System.out.println(result);
        System.out.println("------------------THE 8TH TASK------------------");
        String phrase = "This is my phrase.";
        int times = 4;
        printPhrase(phrase, times);
        System.out.println("------------------THE 9TH TASK------------------");
        int year = 1764;
        boolean leapYearResult = determineLeapYear(year);
        System.out.println(leapYearResult);
    }

    public static void printThreeWords() {
        List<String> words = new ArrayList<>();
        words.add("Orange");
        words.add("Banana");
        words.add("Apple");

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    public static void checkSumSign() {
        int a, b, sum;
        a = 5;
        b = -10;
        sum = a + b;

        if (sum >= 0) {
            System.out.println("The sum is positive.");
        } else {
            System.out.println("The sum is negative.");
        }
    }

    public static void printColor() {
        int value = 80;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("The number must be an integer.");
        }
    }

    public static void compareNumbers() {
        int a, b;
        a = 5;
        b = -10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean verifySum(int a, int b) {
        int sum = a + b;

        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void checkNumSign(int number) {
        if (number >= 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }

    public static boolean verifyNum(int number) {
        if (number >= 0) {
            return false;
        }
        return true;
    }

    public static void printPhrase(String phrase, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(phrase);
        }
    }

    public static boolean determineLeapYear(int year) {
        boolean multipleOf4 = year % 4 == 0;
        boolean multipleOf100 = year % 100 == 0;
        boolean multipleOf400 = year % 400 == 0;

        if (multipleOf4) {
            if (multipleOf100) {
                return multipleOf400;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
