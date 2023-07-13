package hw21.RockPaperScissors.src.main.java.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerVariationsTest {

    @Test
    void generateArray() {
        Integer[] expected = {0, 1, 2};
        Integer[] result = AnswerVariations.generateArray();
        assertArrayEquals(expected, result);
    }
}