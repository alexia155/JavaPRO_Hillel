package hw9;

import hw9.Collection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Collection collection = new CollectionImpl();
        Collection collectionTwo = new CollectionImpl();

        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add(1, "mama");
        collection.delete("3");

        collectionTwo.add("1");
        collectionTwo.add("2");
        collectionTwo.add(1, "mama");
        boolean isEqual = collection.equals(collectionTwo);
        System.out.println("Arrays is equal? " + isEqual);

        collection.arrayToString();
        System.out.println("The current size of array: " + collection.size());
        int indexToGetValue = 1;
        System.out.println("Value of the index " + indexToGetValue + ": " + collection.get(indexToGetValue));
        String valueIsInArray = "mama";
        System.out.println("If the array contains the " + valueIsInArray + " value: " + collection.contain(valueIsInArray));

        collection.clear();
    }
}
