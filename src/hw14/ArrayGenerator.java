package hw14;

public class ArrayGenerator {
    public static String[][] generateArray(){
        String[][] array = new String[4][4];

        array[0][0] = "1";
        array[0][1] = "12";
        array[0][2] = "123";
        array[0][3] = "1234";

        array[1][0] = "-1";
        array[1][1] = "-12";
        array[1][2] = "-123";
        array[1][3] = "-1234";

        array[2][0] = "+0";
        array[2][1] = "+14";
        array[2][2] = "+17";
        array[2][3] = "+18";

        array[3][0] = "-15";
        array[3][1] = "-14";
        array[3][2] = "-17";
        array[3][3] = "-18";

        return array;
    }
}
