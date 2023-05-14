package hw4;

public class Car {
    static final double A_HUNDRED_KILOMETERS = 100;
    private double tankBalance;  //залишок у баку (літри)
    private final double tankVolume;  //об'єм бака (літри)
    private final double fuelConsumption;  //витрата палива на 100 км (літри)

    public Car(double tankBalance, double tankVolume, double fuelConsumption) {
        this.tankBalance = tankBalance;
        this.tankVolume = tankVolume;
        this.fuelConsumption = fuelConsumption;
    }

    //1 метод - залити повний бак з урахуванням обсягу залишку
    public double fillTankFull() {
        double pouredGasoline = this.tankVolume - this.tankBalance;
        this.tankBalance = this.tankVolume;
        return pouredGasoline;
    }

    //2 метод - визначити залишок палива з подолання N км
    public void determineNewTankBalance(double distance) {
        this.tankBalance = this.tankVolume - this.determineFuelNeeds(distance);
    }

    //3 метод - визначити скільки треба до заправити палива для подолання N км
    public double determineFuelNeeds(double distance) {
        double distanceConverted = distance / A_HUNDRED_KILOMETERS;
        return distanceConverted * this.fuelConsumption;
    }

    public double getTankBalance() {
        return this.tankBalance;
    }

}
