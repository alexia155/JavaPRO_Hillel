package hw8;

import java.util.Objects;

public class Collection {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public Collection() {
        this.elements = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public String[] getElements() {
        return elements;
    }

//1. add new value to the selected index - relocate other values to the right
    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[index] = value;
        size++;
        return true;
    }

//2. add new value to the end of array
    public boolean add(String value) {
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
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

//3. remove value from the selected index
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return true;
    }

//4. remove unnecessary value in array
    public boolean remove(String value) {
        String[] newElements = new String[elements.length];

        for (int i = 0, k = 0; i < elements.length; i++) {
            if (!Objects.equals(elements[i], value)) {
                newElements[k] = elements[i];
                k++;
            }
        }
        elements = newElements;
        return true;
    }

//5. get element of the index
    public String get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("String index out of bounds.");
        }
        return elements[index];
    }

}
