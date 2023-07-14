package RockPaperScissors.dto;

public class Player {
    //to create an object
    private String name;
    private Integer numberOfGames = 0;
    private Integer numberOfWinGames = 0;
    private Integer numberOfLostGames = 0;

    public Player(String name) {
        this.name = name;
    }

    public void incrementNumberOfGames() {
        numberOfGames++;
    }

    public void incrementNumberOfWinGames() {
        numberOfWinGames++;
    }

    public void incrementNumberOfLostGames() {
        numberOfLostGames++;
    }

    public String getPlayerResult() {
        return "Player " + name + " won " + numberOfWinGames + " and lose " + numberOfLostGames + " games from " + numberOfGames + ".";
    }
}
