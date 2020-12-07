package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final score was = " + finalScore);

        finalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was = " + finalScore);

        displayHighScorePosition("Vishwajeet Raj",calculateHighScorePosition(1500));
        displayHighScorePosition("Vimal Mahato",calculateHighScorePosition(   900));
        displayHighScorePosition("Wolf Whamsbang",calculateHighScorePosition(   400));
        displayHighScorePosition("Africal Savana",calculateHighScorePosition(   50));
        displayHighScorePosition("Africal Savana",calculateHighScorePosition(   1000));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return  -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the High Score Table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        return (playerScore >= 1000) ? 1 : (playerScore >= 500) ? 2 : (playerScore >= 100) ? 3 : 4;
    }

}
