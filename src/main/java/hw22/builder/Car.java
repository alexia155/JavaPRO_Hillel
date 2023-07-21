package hw22.builder;

public class Car {
    private String producer;
    private String model;
    private int year;
    private String color;
    private String body;
    private String engine;
    private String transmission;

    Car(String producer, String model, int year, String color, String body, String engine, String transmission) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car{" +
               "producer='" + producer + '\'' +
               ", model='" + model + '\'' +
               ", year=" + year +
               ", color='" + color + '\'' +
               ", body='" + body + '\'' +
               ", engine='" + engine + '\'' +
               ", transmission='" + transmission + '\'' +
               '}';
    }
}
