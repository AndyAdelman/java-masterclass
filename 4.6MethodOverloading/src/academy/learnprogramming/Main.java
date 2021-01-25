package academy.learnprogramming;

public class Main {

    public static void main(String[] args){

        //Video
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        //calculateScore(100, 100, 23);
        //calculateScore("Bob", 500, 27);
        //THe data types determine whether the parameters are unique

        calculateScore();

        System.out.println();

        //Challenge
        System.out.println("centimeters: "
                + calcFeetAndInchesToCentimeters(38.00d));

    }

    //Challenge - FeetAndInchesToCentimetersCalculator

    //Takes feet and inches and converts to centimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        double centimeters = -1.00d;
        double feetToInches;

        boolean isFeet = feet >= 0.00d ? true : false;
        boolean isInches= inches >= 0.00d && inches <=12.00d ? true : false;

        if (isFeet && isInches){

            feetToInches = (int) feet * 12;

            centimeters = (feetToInches + inches) * 2.54d;

            System.out.println("feetToInches: " + feetToInches);
        }

        return centimeters;
    }

    //Takes inches, converts to feet and inches,
    //then calls the overloaded method to convert feet and inches to centimeters
    public static double calcFeetAndInchesToCentimeters(double inches){

        double centimeters = -1.00d;
        double feet, inchesRemaining;

        boolean isInches = inches >= 0.00d ? true : false;

        if (isInches){

            feet = (int) inches / 12;
            inchesRemaining = (int) inches % 12;

            centimeters =
                    calcFeetAndInchesToCentimeters(feet, inchesRemaining);

            System.out.println("feet: " + feet);
            System.out.println("inches remaining: " + inchesRemaining);
        }

        return centimeters;
    }

    //Video Example
    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName
                + " scored " + score + " points");
        return score * 1000;
    }

    //Overload the method by changing the number of parameters
    public static int calculateScore (int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore () {
        System.out.println("No player name, no score");
        return 0;
    }

    //Changing the return data type does not create a unique method
    //You actually need to change the parameters (number or data type)
    /*public static void calculateScore () {
        System.out.println("No player name, no score");
    }*/
}
