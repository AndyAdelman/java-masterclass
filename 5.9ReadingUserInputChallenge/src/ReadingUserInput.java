import java.util.Scanner; //note the import

public class ReadingUserInput {

    public static void main(String[] args) {

        boolean hasNextInt = false;
        int counter = 0;
        int order = 0;
        int number = 0;
        int sumNumbers = 0;

        Scanner myScanner = new Scanner(System.in);

        while(true) { //endless loop - we'll break the loop in the code block

            order = counter + 1; //because counter begins at zero??
            System.out.println("Enter number #" + order +":");
            hasNextInt = myScanner.hasNextInt();

            if (hasNextInt){

                number = myScanner.nextInt();
                sumNumbers += number;
                counter++;
                if(counter == 10){
                    break;
                }//you should get in the habit of always
                // adding a break to your loops

            } else {
                System.out.println("Invalid Number");
            }

            myScanner.nextLine(); //the nextLine needs to go here
                                //in order to close both the if and the else lines
        }
        System.out.println(sumNumbers + " is the sum of all numbers");
        myScanner.close();
    }
}
