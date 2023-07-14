package RockPaperScissors.service;

import java.util.Random;

public class ComputersGame {
    public static int setComputerChoice(Integer[] answerVariations) {
        //one random int choice by computer from the array in the ArrayVariations class
        int computerChoice = Integer.parseInt(String.valueOf(answerVariations[new Random().nextInt(answerVariations.length)]));
        return computerChoice;
    }
}