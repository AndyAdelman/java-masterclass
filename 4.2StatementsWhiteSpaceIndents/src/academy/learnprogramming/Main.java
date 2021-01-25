package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //A statement is the complete line
        // The expression plus keywords, brackets, semi-colons, method calls.
        int myVariable = 50;
        myVariable--;
        System.out.println("This is a test");
        //Statements do not have to be on one line
        System.out.println("This is " +
                "another " +
                "still more.");

        //You can put two or more statements on the same line
        //The semi-colons differentiate statements
        //NOT RECOMMENDED
        int anotherVariable = 50; myVariable--;

        //White Space is the empty space between your code.
        //Good white space makes your code more readable.

        //Indentation

        int myVariable = 50;
        myVariable--;

        System.out.println("This is a test");
        //Statements do not have to be on one line
        System.out.println("This is " +
                "another " +
                "still more.");

        //vs

        //A statement is the complete line
        // The expression plus keywords, brackets, semi-colons, method calls.
        int myVariable = 50;
        myVariable--;
        System.out.println("This is a test");
        //Statements do not have to be on one line
        System.out.println("This is " +
        "another " +
        "still more.");

        if(myVariable == 50){
            System.out.println("Printed");
        }

        //When in doubt use Code dropdown > Reformat
    }
}
