import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        boolean isValidInt;
        int inputSum = 0;
        long inputAvg = 0;
        int inputCount = 0;
        Scanner myScanner = new Scanner(System.in);
        //new object instance at the beginning

        while(true){

            //The instructions don't call for a text prompt
            //System.out.println("Enter a number");
            isValidInt = myScanner.hasNextInt();

            if(isValidInt){

                inputSum += myScanner.nextInt();
                inputCount++;
                inputAvg = Math.round((double) inputSum / (double) inputCount);

            } else {

                System.out.println("SUM = " + inputSum
                        + " AVG = " + inputAvg);
                break;
            }

            myScanner.nextLine(); //close line at the end of the loop
        }

        myScanner.close(); //close instance at the end of the method
    }

}
