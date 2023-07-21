package hw22.strategy;

import hw22.strategy.shapes_strategies.RectangleAreaStrategy;
import hw22.strategy.shapes_strategies.TriangleAreaStrategy;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.setAreaStrategy(new RectangleAreaStrategy(8, 5));
        System.out.println("The area of rectangle: " + shape.calculateArea());

        shape.setAreaStrategy(new TriangleAreaStrategy(10, 14));
        System.out.println("The area of triangle: " + shape.calculateArea());
    }
}
