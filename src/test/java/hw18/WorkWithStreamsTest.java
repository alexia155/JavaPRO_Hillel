package hw18;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkWithStreamsTest {

    @Test
    void countNumsAverageValue() {
        List<Integer> incoming = Arrays.asList(80, 6, 14, 1);
        double result = WorkWithStreams.countNumsAverageValue(incoming);
        double expected = 25.25;
        assertEquals(expected, result);
    }

    @Test
    void bringToUpperCase() {
        List<String> incoming = Arrays.asList("mother", "father", "brother");
        List<Pair> result = WorkWithStreams.bringToUpperCase(incoming);
        List<Pair> expected = Arrays.asList(
                new Pair("mother", "MOTHER"),
                new Pair("father", "FATHER"),
                new Pair("brother", "BROTHER")
        );
        assertEquals(expected, result);
    }

    @Test
    void filterValues() {
        List<String> incoming = Arrays.asList("apple", "FRUIT", "plum", "pome", "banana");
        WorkWithStreams.filterValues(incoming);

    }
}