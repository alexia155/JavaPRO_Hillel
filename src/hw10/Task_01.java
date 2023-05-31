package hw10;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task_01 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("Dog");
        words.add("Cat");
        words.add("Crocodile");
        words.add("Monkey");
        words.add("Cow");
        words.add("Elephant");
        words.add("Horse");
        words.add("Dinosaur");
        words.add("Sheep");
        words.add("Hamster");

        int count = 20;
        List<String> newList = getList(words, count);
        System.out.println("Array of " + count + " elements: " + newList);

        String pattern = "Hamster";
        int result = countOccurance(newList, pattern);
        System.out.println("How many times the word '" + pattern + "' appears in array: " + result);
    }

    public static int countOccurance(List<String> list, String pattern){
        int counter = 0;
        for (String word : list) {
            if(Objects.equals(word, pattern)){
                counter += 1;
            }
        }
        return counter;
    }

    private static String getRandomWords(List<String> words){
        return words.get((int) (Math.random()*10));
    }

    private static List<String> getList(List<String> words, int count){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(getRandomWords(words));
        }
        return list;
    }
}
