package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //While Loop is just a condition
        //while(condition) { statements }
        //If you want to increment a variable,
        //1) The variable needs to be declared outside the loop.
        //2) You'll need to increment the variable inside the loop.
        //Notice there is NO semi-colon at the end of the while loop.

        System.out.println();
        System.out.println("while loop");
        System.out.println();

        int count = 0;

        while(count != 5){
            System.out.println("Count value is " + count);
            count++;
        }

        //These two loops (while & for) are equivalent.
        System.out.println();
        System.out.println("for loop equivalent");
        System.out.println();

        for(int i=0; i<5; i++){
            System.out.println("i value is " + i);
        }

        //Alternative
        System.out.println();
        System.out.println("alternative while");
        System.out.println();

        count = 0;
        //Make sure your variable is set right.
        //If not, you may never enter the loop.

        while(true){ //start an endless loop

            if(count == 5){ //break the loop when a condition is met
                break;
            }

            System.out.println("Count value is " + count);
            count++;
        }

        //Do while loop will execute at least once.
        //The condition is checked after the code block.
        //do { statements } while(condition);
        //Notice the semi-colon is required!!!

        System.out.println();
        System.out.println("do while loop");
        System.out.println();

        count = 0;

        do{
            System.out.println("Count value is " + count);
            count++;
        }while(count !=5);

        //continue will skip the remaining code and restart the loop.
        //break exits the loop and continues after the loop's code block.

        //Challenge
        //Print the first 5 even numbers between 5 and 20 inclusive
        //Print the sum of those numbers
        //Use a while loop
        //use a separate method to check if a number is even

        System.out.println();

        int number = 4; //we start with 4 because we're about to increment the variable
        int finishNumber = 20;
        int counter = 0;
        int sum = 0;

        while (number <= finishNumber){

            number++; //Good practice to start with increment
                        //Very easy to enter endless loop otherwise

            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            counter++;
            sum = sum + number;

            if (counter == 5){
                break;
            }
        }

        System.out.println("Sum of even numbers: " + sum);

    }

    public static boolean isEvenNumber(int number){

        boolean isEven;

        isEven = (number % 2 == 0) ? true : false;

        return isEven;
    }

}
