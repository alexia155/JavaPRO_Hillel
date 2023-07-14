package RockPaperScissors.service;

import RockPaperScissors.exceptions.InvalidChoiceException;

public class PlayersGame {

    public static int setPlayerChoice(int playerAnswer) throws InvalidChoiceException {
        //calculate player's choice
        if (playerAnswer == 0 || playerAnswer == 1 || playerAnswer == 2) {
            return playerAnswer;
        } else {
            throw new InvalidChoiceException(playerAnswer + " is not a valid choice!");
        }
    }
}

