package hw14;
import hw14.exceptions.ArrayDataException;
import hw14.exceptions.ArraySizeException;

public class ArrayValueCalculator {

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException{
        String[][] arrayExample = new String[4][4];
        int sum = 0;

        if (!(array.length == arrayExample.length)) {
            throw new ArraySizeException("The size of array is not appropriate!");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum += num;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Incorrect data at cell: [" + i + "][" + j + "]!");
                }
            }
        }
        return sum;
    }

}


