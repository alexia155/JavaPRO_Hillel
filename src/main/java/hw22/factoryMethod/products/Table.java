package hw22.factoryMethod.products;

import hw22.factoryMethod.Furniture;

public class Table implements Furniture {
    @Override
    public void create() {
        System.out.println("Factory produced table.");
    }
}
