package hw22.builder;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        CarBuilder builder = new ConcreteCarBuilder();
        Car car = director.buildCarBMW(builder);
        System.out.println(car);
    }
}
