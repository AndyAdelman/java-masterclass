package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner is a built-in class that reads user input
        Scanner myScanner = new Scanner(System.in);
        //^Class ^name      ^ new instance of object Scanner
        //                                  ^input parameter

        System.out.println("What year were you born?");

        boolean myHasNextInt = myScanner.hasNextInt();
        //checks if the next input qualifies as an int

        if(myHasNextInt) {

            int yearOfBirth = myScanner.nextInt();
            //notice the next method uses the input data type
            //eg myScanner.nextInt
            //scanner is parsing the input string for you

            myScanner.nextLine();
            //hitting enter after an int closes the line and therefore
            //skips the next input
            //Your name? reads [enter] as the input
            //you need to add a new nextLine w/o assigning it to a variable

            System.out.println("Enter your name: ");
            String name = myScanner.nextLine();

            int age = 2018 - yearOfBirth;

            //Error handling is super important
            if (age >= 0 && age <= 100) {

                System.out.println("Your name is " + name
                        + ", and you are " + age + " years old");
            } else {

                System.out.println("Invalid year of birth");
            }
        } else {

            System.out.println("Unable to parse year of birth");
        }

        //good practice to close myScanner when you're done using it
        //more later
        myScanner.close();
    }
}
