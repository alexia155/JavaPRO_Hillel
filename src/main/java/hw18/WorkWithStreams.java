package hw18;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Pair {
    private String lCase;
    private String uCase;

    public Pair(String lCase, String uCase) {
        this.lCase = lCase;
        this.uCase = uCase;
    }

    public String getLowerCase() {
        return lCase;
    }

    public void setLowerCase(String lCase) {
        this.lCase = lCase;
    }

    public String getUpperCase() {
        return uCase;
    }

    public void setUpperCase(String uCase) {
        this.uCase = uCase;
    }

    @Override
    public String toString() {
        return "{" + lCase + ":" + uCase + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(lCase, pair.lCase) &&
               Objects.equals(uCase, pair.uCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lCase, uCase);
    }
}

public class WorkWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 16, 3, 8);
        double numsAverageValue = countNumsAverageValue(numbers);
        System.out.println("The average value = " + numsAverageValue);

        List<String> words = Arrays.asList("one", "two", "three");
        List<Pair> newList = bringToUpperCase(words);
        System.out.println("The new list: " + newList);

        List<String> wordsUpperCaseAndLowerCase = Arrays.asList("ONE", "TWO", "three", "four", "five");
        System.out.print("The new filtered list: ");
        filterValues(wordsUpperCaseAndLowerCase);
    }

    public static double countNumsAverageValue(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    public static List<Pair> bringToUpperCase(List<String> words) {
        return words.stream()
                .map(s -> new Pair(s, s.toUpperCase()))
                .collect(Collectors.toList());
    }

    public static void filterValues(List<String> wordsUpperCaseAndLowerCase) {
        wordsUpperCaseAndLowerCase.stream()
                .filter(s -> s.equals(s.toLowerCase()) && s.length() == 4)
                .forEach(s -> System.out.printf(s + " "));
    }

}
