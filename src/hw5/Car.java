package hw5;

public class Car {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static void startElectricity() {
        System.out.println("Start Electricity");
    }

    private static void startCommand() {
        System.out.println("Start Command");
    }

    private static void startFuelSystem() {
        System.out.println("Start Fuel System");
    }


}
