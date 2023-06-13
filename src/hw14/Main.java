package hw14;
import hw14.exceptions.ArraySizeException;
import hw14.exceptions.ArrayDataException;

public class Main {
    public static void main(String[] args) throws ArraySizeException, ArrayDataException{
        String[][] array = ArrayGenerator.generateArray();
        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            int result = calculator.doCalc(array);
            System.out.println("Sum: " + result);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
