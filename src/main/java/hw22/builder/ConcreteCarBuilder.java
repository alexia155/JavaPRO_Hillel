package hw22.builder;

public class ConcreteCarBuilder implements CarBuilder {
    private String producer;
    private String model;
    private int year;
    private String color;
    private String body;
    private String engine;
    private String transmission;

    @Override
    public CarBuilder setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    @Override
    public CarBuilder setBody(String body) {
        this.body = body;
        return this;
    }
    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    @Override
    public CarBuilder setTransmission(String transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Car build() {
        return new Car(producer, model, year, color, body, engine, transmission);
    }
}
