package hw21.RockPaperScissors.src.main.java.service;

import org.junit.jupiter.api.Test;
import hw21.RockPaperScissors.src.main.java.exceptions.InvalidChoiceException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class PlayersGameTest {

    @Test
    void setPlayerChoiceValid() throws InvalidChoiceException {
        int incoming = 0;
        int expected = 0;
        int result = PlayersGame.setPlayerChoice(incoming);
        assertEquals(expected, result);
    }

    @Test
    void setPlayerChoiceInvalid() throws InvalidChoiceException {
        int incoming = 5;

        Throwable exception = assertThrows(InvalidChoiceException.class, () -> PlayersGame.setPlayerChoice(incoming));
        Assertions.assertEquals(incoming + " is not a valid choice!", exception.getMessage());
    }
}