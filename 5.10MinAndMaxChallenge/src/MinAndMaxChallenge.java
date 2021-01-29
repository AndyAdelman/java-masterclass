import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args) {

        int number;
        int minNumber = 0;
        int maxNumber = 0;
        boolean isFirstLoop = true;
        boolean isValidInt;
        Scanner myScanner = new Scanner(System.in);

        while(true){

            System.out.println("Enter number");
            isValidInt = myScanner.hasNextInt();

            //check valid input
            if(isValidInt){

                number = myScanner.nextInt();

                if(isFirstLoop){
                    minNumber = number;
                    maxNumber = number;
                    isFirstLoop = false;
                }//this is a flag that sets the numbers on the first iteration
                //you could also use a counter == 0 condition instead of a boolean

                //you could also also set the min and max to the min/max values
                //the data type will hold
                //eg +/- 2,000,000,000 and change for int
                //you would use Integer.MAX_VALUE

                if(number > maxNumber){

                    maxNumber = number;
                }

                if(number < minNumber){
                    minNumber = number;
                }
            } else {

                break;
            }

            myScanner.nextLine();
        }

        System.out.println("Min: " + minNumber + " Max: " + maxNumber);
        myScanner.close();
    }
}
