package hw22.strategy.shapes_strategies;

import hw22.strategy.ShapeAreaStrategy;

public class TriangleAreaStrategy implements ShapeAreaStrategy {
    static final double ONE_HALF = 0.5;
    private double base;
    private double height;

    public TriangleAreaStrategy(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ONE_HALF * base * height;
    }
}
