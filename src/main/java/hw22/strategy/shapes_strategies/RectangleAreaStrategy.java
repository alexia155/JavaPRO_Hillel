package hw22.strategy.shapes_strategies;

import hw22.strategy.ShapeAreaStrategy;

public class RectangleAreaStrategy implements ShapeAreaStrategy {
    private double width;
    private double height;

    public RectangleAreaStrategy(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
