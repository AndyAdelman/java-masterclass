package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bouns = 100;

        //If-Then
        if (score ==5000){
            System.out.println("Your score was 5000");
        }

        //same as
        if (score == 5000)
            System.out.println("This was executed");
        //but you can only add one statement without bracket

        //If-Then-Else
        if (score < 5000){
            System.out.println("Your score is less than 5000");
        } else {
            System.out.println("Got here");
        }

        //else-if
        if (score < 5000 && score > 1000){
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        //Hint: Comment with Code dropdown > Line Comment

        //You can create a variable inside the code block
        //The code block can access variables outside the code block
        //HOWEVER you cannot access variable within the code block outside
        //The variable is out of scope
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bouns);
            System.out.println("Your final score was " + finalScore);
        }

        //Hint: abbreviate gameOver == true to just gameOver

        System.out.println();

        /*print second score with:
        score set to 1000
        level completed set to 8
        bonus set to 200
        Make sure the first score still displays
         */

        //Works but you're using memory creating new variables you don't really need
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score is now " + finalScore);
        }

        //You could reuse your previous variables
        //However, now you're duplicating code
        //You may forget to reset the variables somewhere
        //With duplication,
        //you need to remember to change the code everywhere the code is duplicated
        //You're asking for errors
        //Also, you lose the record of the previous score
    }
}
