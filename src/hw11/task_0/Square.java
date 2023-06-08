package hw11.task_0;

public class Square implements GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double returnShapeArea() {
        return side * side;
    }

}
