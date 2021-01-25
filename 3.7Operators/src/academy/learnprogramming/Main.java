package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + 20);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; //3 * 10 = 20
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        result -= 3; //10 - 3 = 7
        System.out.println("10 - 3 = " + result);

        System.out.println();

        boolean isAlien = false; // = assignment operator
        if (isAlien == false) // == Is the object false? false = false evaluates to true.
            System.out.println("It is not an alien!");
        //DO NOT PUT A SEMI-COLON AFTER THE IF STATEMENT!!
        //THE LINE BECOMES AN INDEPENDENT LINE OF CODE
        //SEPARATED FROM THE REST OF THE LINE

        System.out.println();

        //non-code block vs. code block
        if (isAlien == false)
            System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens"); //always runs

        System.out.println();

        //always use a code block
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // ! not equal
        int topScore = 100;
        if (topScore != 100){
            System.out.println("You got the top score!");
        }

        // > greater than
        if (topScore > 100){
            System.out.println("You got the top score!");
        }

        //greater than or equal
        if (topScore >= 100){
            System.out.println("You got the top score!");
        }

        //less than
        if (topScore < 100){
            System.out.println("You got the top score!");
        }

        //less than or equal
        if (topScore <= 100){
            System.out.println("You got the top score!");
        }

        // && operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 110)){
            System.out.println("Greater than 2nd top score and less than 110");
        }

        System.out.println();

        //Logical || Operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true.");
        }

        System.out.println();

        //Common Error - assignment operator (=) in if expression
        int newValue = 50;
        if (newValue /* = */ == 50 ){ //incompatible type
            System.out.println("We fixed the error");
        }

        System.out.println();

        //Another common error
        boolean isCar = false;
        if (isCar /* = */ == true){ //returns the right type but wrong value
            System.out.println("This is an error");
        }
        //You could also use isCar alone or !isCar or isCar != or == false

        System.out.println();

        //ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        // first condition ? assign if true : assign if false
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }
}
