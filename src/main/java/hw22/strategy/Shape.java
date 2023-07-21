package hw22.strategy;

public class Shape {
    private ShapeAreaStrategy areaStrategy;

    public void setAreaStrategy(ShapeAreaStrategy areaStrategy) {
        this.areaStrategy = areaStrategy;
    }

    public double calculateArea() {
        if (areaStrategy == null) {
            throw new IllegalStateException("It's not possible to calculate the area. No strategy!");
        }

        return areaStrategy.calculateArea();
    }
}
