package hw22.builder;

public interface CarBuilder {
    CarBuilder setProducer(String producer);

    CarBuilder setModel(String model);

    CarBuilder setYear(int year);

    CarBuilder setColor(String color);

    CarBuilder setBody(String body);

    CarBuilder setEngine(String engine);

    CarBuilder setTransmission(String transmission);

    Car build();
}

