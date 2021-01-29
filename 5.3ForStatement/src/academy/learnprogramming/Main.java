package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = "
                + calculateInterest(10000.0d, 2.0d));
        System.out.println("10,000 at 3% interest = "
                + calculateInterest(10000.0d, 3.0d));
        System.out.println("10,000 at 4% interest = "
                + calculateInterest(10000.0d, 4.0d));
        System.out.println("10,000 at 5% interest = "
                + calculateInterest(10000.0d, 5.0d));

        System.out.println();

        //for(init; terminator, increment){}
        //The loop stops when the terminator condition is false
        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        //Step1: Initialize variable
        //Step2: Check condition
        //Step3: Execute code block
        //Step4: Execute iteration step
        //Goto: Step 2 until Step 2 is false

        System.out.println();

        //Challenge
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f",
                    + calculateInterest(10000.0d, (double) i)));
        }

        System.out.println();

        //Challenge 2
        for (int i=8; i>1; i--){
            System.out.println("10,000 at " + i + "% interest = "
                    + String.format("%.2f",
                    + calculateInterest(10000.0d, (double) i)));
        }

        System.out.println();

        //Challenge 3
        int counter = 0;

        for(int i = 99; i > 0; i--){

            if(counter == 10){
                System.out.println("Exiting loop");
                break; //break exits the loop even if the terminator condition is still true
            } else if(isPrime(i)){
                System.out.println(i + " is a prime number");
                counter++;
            }
        }

    }

    //Provided method
    public static boolean isPrime(int n){

        boolean prime = true;

        if(n==1){
            prime = false;
        }

        for(int i=2; i <= n/2; i++){ //Math.sqrt(n) is a better alternative to n/2
            if(n % i == 0){
                prime = false;
            }
        }
        return prime;
    }
    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100.00d));
    }
}
