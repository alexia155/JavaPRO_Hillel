package hw16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------THE 1ST TASK------------------");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter one word: ");
        String phrase = scanner1.nextLine();
        System.out.print("Enter the letter to calculate: ");
        char letter = scanner1.next().charAt(0);
        int result1 = findSymbolOccurance(phrase, letter);
        System.out.println("Result: " + result1);

        System.out.println("------------------THE 2ND TASK------------------");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter source word: ");
        String source = scanner2.nextLine();
        System.out.print("Enter target part: ");
        String target = scanner2.nextLine();
        int result2 = findWordPosition(source, target);
        System.out.println("Result: " + result2);

        System.out.println("------------------THE 3RD TASK------------------");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter one word to reverse: ");
        String wordReverse = scanner3.nextLine();
        String result3 = stringReverse(wordReverse);
        System.out.println("Result: " + result3);

        System.out.println("------------------THE 4TH TASK------------------");
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter one word to check if it's a palindrome: ");
        String palindrome = scanner4.nextLine();
        boolean result4 = isPalindrome(palindrome);
        System.out.println("Result: " + result4);
    }

    public static int findSymbolOccurance(String phrase, char letter) {
        int result = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter) {
                result++;
            }
        }
        return result;
    }

    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target.charAt(0));
        }
        return -1;
    }

    public static String stringReverse(String wordReverse) {
        StringBuilder reversed = new StringBuilder();

        for (int i = wordReverse.length() - 1; i >= 0; i--) {
            reversed.append(wordReverse.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String palindrome) {
        int i = 0;
        int length = palindrome.length() - 1;

        while (i < length) {
            if (palindrome.charAt(i) == palindrome.charAt(length)) {
                return true;
            }
            i++;
            length--;
        }
        return false;
    }
}