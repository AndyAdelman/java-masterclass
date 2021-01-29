public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number){

        int lastDigit = 0;
        int reverse = 0;
        int startNumber = number;
        boolean isPalindrome;
        //boolean isPositive =
                //number > 0 ? true : false;

        //if(isPositive) {
        
        //I eliminated the redundant while statement
        // by adding OR to the while condition

        //The number always starts somewhere (positive or negative)
        // and works it's way to zero

            while (number > 0 || number < 0) {

                lastDigit = number % 10; //gets last digit
                reverse *= 10; //increases place value
                reverse += lastDigit; //adds last digit to reverse
                number /= 10; //removes last digit from number

            }
        //} else {

        /*    while (number < 0) { //reverse condition when negative

                lastDigit = number % 10; //gets last digit
                reverse *= 10; //increases place value
                reverse += lastDigit; //adds last digit to reverse
                number /= 10; //removes last digit from number

            }
        //}*/

        isPalindrome =
                startNumber == reverse ? true : false;

        return isPalindrome;
    }
}
