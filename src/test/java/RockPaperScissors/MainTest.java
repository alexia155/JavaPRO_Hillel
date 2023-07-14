package RockPaperScissors;

import hw21.RockPaperScissors.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void choiceToStringCase() {
        int incoming = 2;
        String expected = "Scissors";
        String result = hw21.RockPaperScissors.Main.choiceToString(incoming);
        assertEquals(expected, result);
    }

    @Test
    void choiceToStringDefault() {
        int incoming = 3;
        String expected = "Invalid choice";
        String result = Main.choiceToString(incoming);
        assertEquals(expected, result);
    }
}