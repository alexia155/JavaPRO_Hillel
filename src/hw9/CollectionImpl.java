package hw9;

import java.util.Arrays;
import java.util.Objects;

public class CollectionImpl implements Collection {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public CollectionImpl() {
        this.elements = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean add(String value) {             //1 impl - add new value to the end of array
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    private void expandCapacity() {
        int newCapacity = elements.length * 2;
        String[] newElements = new String[newCapacity];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    @Override
    public boolean add(int index, String value) {      //2 impl - add new value to the selected index of array
        if (index < 0 || index > size) {
            return false;
        }
        if (size == elements.length) {
            expandCapacity();
        }
        for (int i = size; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean delete(String value) {             //3 impl - delete selected value from array
        boolean removed = false;
        for (int i = 0; i < size; i++) {
            if (!removed && Objects.equals(elements[i], value)) {
                removed = true;
            }
            if (removed && i == size - 1) {
                elements[i] = null;
            } else if (removed) {
                elements[i] = elements[i + 1];
            }
        }
        if (removed) size--;
        return removed;
    }

    @Override
    public String get(int index) {         //4 impl - get value of the selected index
        if (index < 0 || index >= size) {
            System.out.println("String index out of bounds.");
        }
        return elements[index];
    }

    @Override
    public boolean contain(String value) {        //5 impl - check if the selected value is in the array
        for (int i = 0; i < elements.length; i++) {
            if (Objects.equals(elements[i], value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection collectionTwo) {      //6 impl - method compares the elements of the StringArrayList with the elements of the provided Collection of strings
        if (collectionTwo.size() != size) {
            return false;
        }
        for (int i = 0; i < collectionTwo.size(); i++) {
            if (!contain(collectionTwo.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear() {    //7 impl - method to clear the array

        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void arrayToString() {
        System.out.println("The current array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf(elements[i] + ", ");
        }
        System.out.println();
    }
}




