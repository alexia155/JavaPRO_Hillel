package hw21.RockPaperScissors.src.main.java.service;

import hw21.RockPaperScissors.service.GameService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameServiceTest {

    @Test
    void calculateResult() {
        int playerResult = 0;
        int computerResult = 1;
        String expected = "Computer";
        String result = GameService.calculateResult(playerResult, computerResult);
        assertEquals(expected, result);
    }
}