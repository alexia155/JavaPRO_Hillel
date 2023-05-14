package hw4;
public class Main {
    static final double INITIAL_TANK_BALANCE = 4.6;
    static final double TANK_VOLUME = 60;
    static final double FUEL_CONSUMPTION = 9.3;
    static final int FROM_ODESA_TO_KRYVE_OZERO = 179;
    static final int FROM_KRYVE_OZERO_TO_ZHASHKIV = 157;
    static final int FROM_ZHASHKIV_TO_KYIV = 149;
    static final double GASOLINE_COST = 47.39;

    public static void main(String[] args) {
        Car carOdesaKyiv = new Car(INITIAL_TANK_BALANCE, TANK_VOLUME, FUEL_CONSUMPTION);
        double filledGasoline = 0;
        double finalCost;
        String number;

        number = "First fuel filled in Odesa";
        double firstStopFilledFuel = carOdesaKyiv.fillTankFull();
        filledGasoline += firstStopFilledFuel;
        carOdesaKyiv.determineNewTankBalance(FROM_ODESA_TO_KRYVE_OZERO);
        showRideIntermediateState(number, firstStopFilledFuel);

        number = "Second fuel filled in Kryve Ozero";
        double secondStopFilledFuel = carOdesaKyiv.fillTankFull();
        filledGasoline += secondStopFilledFuel;
        carOdesaKyiv.determineNewTankBalance(FROM_KRYVE_OZERO_TO_ZHASHKIV);
        showRideIntermediateState(number, secondStopFilledFuel);

        number = "Third fuel filled in Zhashkiv";
        double thirdStopFilledFuel = carOdesaKyiv.fillTankFull();
        filledGasoline += thirdStopFilledFuel;
        carOdesaKyiv.determineNewTankBalance(FROM_ZHASHKIV_TO_KYIV);
        showRideIntermediateState(number, thirdStopFilledFuel);

        System.out.println("The current tank balance (in Kyiv) is " + carOdesaKyiv.getTankBalance() + " (liters).");

        finalCost = calculateCost(filledGasoline);
        showFinalCost(finalCost);
        showUsedGasoline(filledGasoline);
    }

    public static void showRideIntermediateState(String number, double filledGasoline){
        double cost = calculateCost(filledGasoline);
        System.out.println("- " + number + " = " + String.format("%.02f", filledGasoline) + " (liters of gasoline). Its cost = " + String.format("%.02f", cost) + " (UA).");
    }


    public static void showUsedGasoline(double filledGasoline){
        System.out.println("You have used " + String.format("%.02f", filledGasoline) + " liters of gasoline during the whole travel.");
    }

    public static double calculateCost(double filledGasoline){
        return filledGasoline * GASOLINE_COST;
    }

    public static void showFinalCost(double finalCost){
        System.out.println("The final cost = " + String.format("%.02f", finalCost) + " (UA).");
    }
}
