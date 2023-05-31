package hw10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_02 {

    public static void main(String[] args) {
        String[] friends = {"Emma", "Mia", "Jack", "John", "Sarah", "Lucy", "Michael", "Victoria", "Oliver", "Addison"};
        System.out.println("Array: " + Arrays.toString(friends));

        List<String> list = toList(friends);
        System.out.println("List: " + list);
    }

    private static List<String> toList(String[] array){
        List<String> list = new ArrayList<>();

        int i = 0;
        while(i < array.length){
            list.add(array[i]);
            i++; }

        return list;
    }

}
