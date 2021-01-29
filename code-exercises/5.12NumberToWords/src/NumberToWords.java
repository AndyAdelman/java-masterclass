public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(reverse(123));
        System.out.println(getDigitCount(100));
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(123);
        numberToWords(0);

    }

    public static void numberToWords(int number){

        int lastDigit, reverseNumber;
        int numberCountDigit, reverseCountDigit;
        String printString = "";

        //check for negative value
        if(number < 0){
            printString += "Invalid Value";
        }

        //we set the counts here because the first while loop
        //will set reverseNumber to zero
        reverseNumber = reverse(number);
        numberCountDigit = getDigitCount(number);
        reverseCountDigit = getDigitCount(reverseNumber);

        //loop through reverseNumber
        while(reverseNumber > 0){

            //grab lastDigit and truncate
            lastDigit = reverseNumber % 10;
            reverseNumber /= 10;

            //add a space if the string already has a value
            if(printString != ""){
                printString += " ";
            }

            //pass lastDigit to switch and add text to string
            switch(lastDigit){

                case 0:
                    printString += "Zero";
                    break;
                case 1:
                    printString += "One";
                    break;
                case 2:
                    printString += "Two";
                    break;
                case 3:
                    printString += "Three";
                    break;
                case 4:
                    printString += "Four";
                    break;
                case 5:
                    printString += "Five";
                    break;
                case 6:
                    printString += "Six";
                    break;
                case 7:
                    printString += "Seven";
                    break;
                case 8:
                    printString += "Eight";
                    break;
                case 9:
                    printString += "Nine";
                    break;
                default:
                    printString += "Invalid Value";
                    break;

            } //repeat until reverseNumber is zero

        }

        //now we loop through the counts and add back any zeros
        //eg 1000 reversed is 0001 or 1 >> output "One"
        //we need to add "Zero Zero Zero" onto the end of the string
        while(numberCountDigit != reverseCountDigit){

            //add a space if the string has a value
            if(printString != ""){
                printString += " ";
            }

            //add zero and deprecate the count
            printString += "Zero";
            numberCountDigit--;

        }//continue until the count is zero

        //we need to check for zero because reverseNumber will
        //never pass a zero to the switch
        if(number == 0){
            System.out.println("Zero");
        } else {
            System.out.println(printString); //print the string
        }
    }

    public static int reverse(int number){

        int lastDigit = 0;
        int reverseNumber = 0;

        //check if number is zero
        //if(number < 0){
        //    return -1;
        //}

        //^^we don't actually need this code
        //the reverse method can accept negative numbers
        //it's the other methods that can't accept a negative

        //reverse sign for positive OR negative
        while(number > 0 || number < 0){

            lastDigit = number % 10; //grab last digit
            reverseNumber *= 10; //add zero to existing int value
            reverseNumber += lastDigit; //add last digit to the empty space you just created
            number /= 10; //truncate last digit
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number){

        int digitCount = 0;

        //check for negative value
        if(number < 0){
            return -1;
        }

        //we need to count zero as one because zero is a digit
        //however, counting zero in the while condition will
        //over count digits for non-zero numbers
        if(number == 0){
            return 1;
        }

        //we've now handled all real numbers
        while(number > 0){

            digitCount += 1; //increment count for last digit
            number /= 10; //truncate last digit

        } //repeat until number equals zero

        return digitCount;
    }
}
