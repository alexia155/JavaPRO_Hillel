package hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Collection collection = new Collection();

        collection.add(0, "1");
        collection.add(1, "2");
        collection.add(2, "3");
        collection.add(3, "4");
        collection.add(4, "5");
        collection.add(5, "6");
        collection.add(6, "7");
        collection.add(7, "8");
        collection.add(8, "9");
        collection.add("10");
        collection.remove(8);
        collection.remove("5");

        System.out.println(Arrays.toString(collection.getElements()));
        System.out.println(collection.get(7));
    }
}

