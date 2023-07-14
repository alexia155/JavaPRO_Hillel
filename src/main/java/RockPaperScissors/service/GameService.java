package RockPaperScissors.service;

public class GameService {
    public static String calculateResult(int playerResult, int computerResult) {
        //to find the winner - 2D array
        String[][] arrayOfResults = new String[3][3];
        //Player - Computer
        //0- rock; 1- paper; 2- scissors;
        arrayOfResults[0][0] = "Draw";
        arrayOfResults[0][1] = "Computer";
        arrayOfResults[0][2] = "Player";
        arrayOfResults[1][0] = "Player";
        arrayOfResults[1][1] = "Draw";
        arrayOfResults[1][2] = "Computer";
        arrayOfResults[2][0] = "Computer";
        arrayOfResults[2][1] = "Player";
        arrayOfResults[2][2] = "Draw";

        String result = arrayOfResults[playerResult][computerResult];
        return result;
    }
}