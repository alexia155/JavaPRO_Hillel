package hw11.task_0;

public class Triangle implements GeometricShape {
    private static final double CONSTANT = 0.5;
    private double constant;
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.constant = CONSTANT;
        this.side = side;
        this.height = height;
    }

    @Override
    public double returnShapeArea() {
        return constant * side * height;
    }

}
