public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        int sumDigit;

        sumDigit = sumFirstAndLastDigit(252);
        System.out.println(sumDigit);

        sumDigit = sumFirstAndLastDigit(257);
        System.out.println(sumDigit);

        sumDigit = sumFirstAndLastDigit(0);
        System.out.println(sumDigit);

        sumDigit = sumFirstAndLastDigit(5);
        System.out.println(sumDigit);

        sumDigit = sumFirstAndLastDigit(-10);
        System.out.println(sumDigit);
    }

    public static int sumFirstAndLastDigit(int number){

        int sumDigit;
        boolean isValidNumber =
                number >= 0 ? true : false;

        int firstNumber = 0;
        int lastNumber = number % 10;
        //number /= 10;
        // ^ Counts single digit once versus twice

        while (number > 0) {

            firstNumber = number % 10;
            number /= 10;

        }

        if(isValidNumber) {
            sumDigit = firstNumber + lastNumber;
        } else {
            sumDigit = -1;
        }

        return sumDigit;

    }
}
