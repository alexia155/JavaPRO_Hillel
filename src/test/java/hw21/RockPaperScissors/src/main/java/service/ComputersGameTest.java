package hw21.RockPaperScissors.src.main.java.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputersGameTest {

    @Test
    void setComputerChoice() {
        Integer[] incoming = {1};
        int expected = 1;
        int result = ComputersGame.setComputerChoice(incoming);
        assertEquals(expected, result);
    }
}