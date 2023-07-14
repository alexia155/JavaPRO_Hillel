package RockPaperScissors;

import RockPaperScissors.dto.AnswerVariations;
import RockPaperScissors.dto.Player;
import RockPaperScissors.exceptions.InvalidChoiceException;
import RockPaperScissors.service.ComputersGame;
import RockPaperScissors.service.GameService;
import RockPaperScissors.service.PlayersGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidChoiceException {
        //starting
        System.out.println("Welcome to the new 'ROCK PAPER SCISSORS' game!");
        Scanner mainScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = mainScanner.nextLine();
        System.out.println("Enter number of games [more then 0]: ");
        int gameCount = mainScanner.nextInt();

        //objects creations
        AnswerVariations answervariations = new AnswerVariations();
        Player player = new Player(name);
        ComputersGame computerGame = new ComputersGame();
        GameService gameService = new GameService();
        PlayersGame playersGame = new PlayersGame();

        //"start points"
        int gameNumber = 1;
        String stopContinue = "NEXT";

        //the main GAME
        do {
            System.out.println("---------------------->>>>>");
            System.out.println("Game " + gameNumber + " from " + gameCount);

            //Player's choice
            System.out.println("Enter your choice (0 - Rock, 1 - Paper, 2 - Scissors): ");
            int playerAnswer = mainScanner.nextInt();
            int playerChoice = playersGame.setPlayerChoice(playerAnswer);

            //Computer's choice
            Integer[] array = answervariations.generateArray();
            int computerChoice = computerGame.setComputerChoice(array);

            //to print choices
            System.out.println("===========");
            System.out.println(name + ", your choice is: " + choiceToString(playerChoice));
            System.out.println("And computer's choice is: " + choiceToString(computerChoice));

            //calculate result
            String result = gameService.calculateResult(playerChoice, computerChoice);
            System.out.println("The result of the game (who won): " + result);

            //calculate number of games won and lost
            player.incrementNumberOfGames();
            if (result.equals("Player")) {
                player.incrementNumberOfWinGames();
            } else if (!result.equals("Draw")) {
                player.incrementNumberOfLostGames();
            }

            //opportunity to stop the game
            if (gameNumber++ < gameCount) {
                System.out.println("To stop this game - enter 'STOP' and to continue - enter 'NEXT': ");
                stopContinue = mainScanner.nextLine();
                while (stopContinue.isEmpty()) {
                    stopContinue = mainScanner.nextLine();
                }
            } else {
                break;
            }
        } while (stopContinue.equals("NEXT"));

        //print the final result
        System.out.println(player.getPlayerResult());
    }

    public static String choiceToString(int choice) {
        //to print the player's choice in the String format
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
}