public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(65));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number){

        boolean isPerfectNumber;
        boolean isValidNumber =
                number > 0 ? true : false;
        int sumDivisors = 0;

        //check number greater than zero
        if(isValidNumber) {

            //count up from 1 until one less than number
            //a perfect number is the sum of all factors EXCEPT itself
            for (int i = 1; i < number; i++) {

                //check if number divides evenly into i
                //if yes, add i to sum
                if (number % i == 0) {
                    sumDivisors += i;
                }

            }

            //check if the sum of divisors equals original number
            isPerfectNumber =
                    number == sumDivisors ? true : false;

        } else {
            isPerfectNumber = false; //not a valid number
        }

        return isPerfectNumber;
    }
}
