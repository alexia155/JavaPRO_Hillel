package RockPaperScissors.dto;

import hw21.RockPaperScissors.dto.AnswerVariations;
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