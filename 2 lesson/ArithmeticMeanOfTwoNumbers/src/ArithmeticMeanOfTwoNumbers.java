import java.util.Scanner;

public class ArithmeticMeanOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("This program will calculate the arithmetic mean of two numbers you'll set.");

        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double number1 = firstNumber.nextDouble();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        double number2 = secondNumber.nextDouble();

        double result;
        result = CountArithmeticMeanOfTwoNumbers(number1, number2);

        System.out.println("The arithmetic mean of these two numbers is " + result);
    }

    private static double CountArithmeticMeanOfTwoNumbers(double number1, double number2) {
        double sum;
        sum = number1 + number2;
        return sum / 2;
    }

}
