package hw11.task_0;

public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[3];
        shapes[0] = new Triangle(11.4, 12);
        shapes[1] = new Square(4.1);
        shapes[2] = new Circle(14.5);

        double result = calculateTotalShapesArea(shapes);
        System.out.printf("The sum of the areas of all shapes: %.2f", result);
    }

    public static double calculateTotalShapesArea(GeometricShape[] shapes) {
        double totalShapesArea = 0;

        for (GeometricShape elements : shapes) {
            totalShapesArea += elements.returnShapeArea();
        }
        return totalShapesArea;
    }
}
