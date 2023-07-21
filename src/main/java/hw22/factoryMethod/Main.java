package hw22.factoryMethod;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture closet = factory.createFurniture("closet");
        closet.create();

        Furniture table = factory.createFurniture("table");
        table.create();

        Furniture armchair = factory.createFurniture("armchair");
        armchair.create();
    }
}
