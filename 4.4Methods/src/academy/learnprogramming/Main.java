package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Methods prevent duplication and make code easier to maintain

        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        calculateScore(true, 800, 5, 100);

        /*if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }*/

        System.out.println();

        calculateScore(true, 10000, 8, 200);

       /* score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }*/

        System.out.println();

        //We end up with only two lines of code

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        //Everything else is contained in the method

        System.out.println();

        //Alternatively using variables passed to the method
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    //Methods must be created outside other methods.
    //In this case, we're creating the method in the Main class
    //as opposed to the Main method.

    //void returns nothing
    // specifying a data type returns a value of that type instead
    //BUT!!! You must return a value
    //Hence the return statements below; one for gameOver true, one for gameOver false
    //-1 is used to represent an error. Value incorrect or value not found.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        /*boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else{
            return -1;
        }

        //or just return -1;
    }
}
