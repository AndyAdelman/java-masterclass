public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));

        System.out.println(hasSharedDigit(9,99));

        System.out.println(hasSharedDigit(15,55));

    }

    public static boolean hasSharedDigit(int firstValue, int secondValue){

        boolean sharedDigit = false;
        boolean isValidRange =
                firstValue >= 10 && firstValue <= 99
                && secondValue >= 10 && secondValue <= 99
                ? true : false;

        //I couldn't think of a way to solve this w/o four comparisons
        //You're dealing with two, two-digit numbers. There are therefore
        //four digits total. Assign each digit to it's own variable then
        //compare them all.

        int leftDigitOne, rightDigitOne;
        int leftDigitTwo, rightDigitTwo;

        rightDigitOne = firstValue % 10;
        leftDigitOne = firstValue / 10;

        rightDigitTwo = secondValue % 10;
        leftDigitTwo = secondValue / 10;

        if(isValidRange) {

            sharedDigit =
                            (rightDigitOne == rightDigitTwo)
                            || (rightDigitOne == leftDigitTwo)
                            || (leftDigitOne == rightDigitTwo)
                            || (leftDigitOne == leftDigitTwo)
                            ? true : false;

        }
        return sharedDigit;
    }
}
