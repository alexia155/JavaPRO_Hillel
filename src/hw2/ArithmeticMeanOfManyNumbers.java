package hw2;

public class ArithmeticMeanOfManyNumbers {
    public static void main(String[] args) {
        System.out.println("This program will calculate the arithmetic mean of an arbitrary number of numbers you'll set.");

        double sum = 0;
        double result = 0;
        System.out.println("Enter the array size: " + args.length);

        for (String numbers : args) {
            System.out.println(numbers);
            double i;

            i = Double.parseDouble(numbers);
            sum += i;
            result = sum / args.length;
        }

        System.out.println("The arithmetic mean of these numbers is " + result);
    }
}
