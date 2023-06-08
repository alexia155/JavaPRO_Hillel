package hw11.task_0;

public class Circle implements GeometricShape {
    private static final double PI = 3.14;
    private double pi;
    private double radius;

    public Circle(double radius) {
        this.pi = PI;
        this.radius = radius;
    }

    @Override
    public double returnShapeArea() {
        return pi * radius * radius;
    }

}
