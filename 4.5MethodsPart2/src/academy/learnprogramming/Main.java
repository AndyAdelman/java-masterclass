package academy.learnprogramming;

public class Main {

    //Main
    public static void main(String[] args) {

        //Last Lesson:
        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = (gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);*/

        //Challenge:
        String playerName = "Bob";
        int playerScore;
        int highScorePosition;

        playerScore = 1500;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

        playerScore = 900;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

        playerScore = 400;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

        playerScore = 50;
        highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

    }

    //Challenge:

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){

        //One solution:
        /*if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }*/

        //Alternative:
        int position = 4;

        if (playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }

        return position;

        //By assuming the position begins as 4, we can then simply change the position based on conditions.
        //This eliminates multiple return statements as well as the last else code block.
    }

    //Last Lesson:
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}
