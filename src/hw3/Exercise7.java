package hw3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d * %3d = %3d \n", i, number, (i * number));
        }
    }
}

