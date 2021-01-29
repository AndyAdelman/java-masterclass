package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString: " + numberAsString);

        //Integer is wrapper class for the primitive datatype int
        //you need to provide the parse method the desired data type
        // eg Integer.parseInt()

        //This is true even though you need to use the desired data type class
        //class to call the appropriate method
        //eg Integer.parseInt
        int number = Integer.parseInt(numberAsString);
        System.out.println("number: " + number);

        numberAsString += 1; //implicit conversion int into string and concat
        number += 1;

        System.out.println("numberAsString: " + numberAsString);
        System.out.println("number: " + number);

        //if you add a character to the numberAsString, java blows up
        //numberAsString = "2018a";

        String newNumberAsString = "2018.125";

        double newNumber = Double.parseDouble(newNumberAsString);
        System.out.println("double: " + newNumber);

    }
}
