package RockPaperScissors.service;

import hw21.RockPaperScissors.exceptions.InvalidChoiceException;
import hw21.RockPaperScissors.service.PlayersGame;
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
        int result = hw21.RockPaperScissors.service.PlayersGame.setPlayerChoice(incoming);
        assertEquals(expected, result);
    }

    @Test
    void setPlayerChoiceInvalid() throws InvalidChoiceException {
        int incoming = 5;

        Throwable exception = assertThrows(InvalidChoiceException.class, () -> PlayersGame.setPlayerChoice(incoming));
        Assertions.assertEquals(incoming + " is not a valid choice!", exception.getMessage());
    }
}