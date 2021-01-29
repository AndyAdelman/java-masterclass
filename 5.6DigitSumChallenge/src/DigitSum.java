public class DigitSum {

    public static void main(String[] args) {

        System.out.println("The total is " + sumDigits(999));

    }

    //returns the sum of each digit in a number
    //e.g. sumDigits(125) returns 1 + 2 + 5 = 8
    public static int sumDigits(int number){

        int sumDigit = -1;
        boolean isValidNumber =
                number >=10 ? true : false;

        if (isValidNumber){

            sumDigit = 0;

            do {
                sumDigit = sumDigit + (number % 10); //extracts 5 from 125 because 5 is the remainder
                number = number / 10; //eliminates the 5 because .5 is truncated by int
                //number is now 12. 12 % 10 = 2. (int) 12 / 10 = 1. And so on.
                //You could use sumDigit += and number /= instead.

            } while (number > 0);
        }

        return sumDigit;
    }
}
