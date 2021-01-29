public class EvenDigitSum {

    public static void main(String[] args) {

        int outputSum;

        outputSum = getEvenDigitSum(123456789);
        System.out.println(outputSum);

        outputSum = getEvenDigitSum(252);
        System.out.println(outputSum);

        outputSum = getEvenDigitSum(-22);
        System.out.println(outputSum);
    }

    public static int getEvenDigitSum(int number){

        int evenDigitSum = -1;
        int lastDigit;
        boolean isValidNumber =
                number >= 0 ? true : false;

        //check if number is greater than or equal to zero
        if(isValidNumber){
            evenDigitSum = 0;
        }

        while(number > 0){

            lastDigit = number % 10; //grabs last digit
            number /= 10; //truncates last digit

            if(lastDigit % 2 == 0){ //checks if lastDigit is even
                evenDigitSum += lastDigit; //if yes, add the number to evenDigitSum
            }
        }

        return evenDigitSum;
    }
}
