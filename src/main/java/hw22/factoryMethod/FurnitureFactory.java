package hw22.factoryMethod;

import hw22.factoryMethod.products.Armchair;
import hw22.factoryMethod.products.Closet;
import hw22.factoryMethod.products.Table;

public class FurnitureFactory {
    public Furniture createFurniture(String type){
        switch (type.toLowerCase()) {
            case "closet":
                return new Closet();
            case "table":
                return new Table();
            case "armchair":
                return new Armchair();
            default:
                throw new IllegalArgumentException("Factory didn't produce this product.");
        }
    }
}
