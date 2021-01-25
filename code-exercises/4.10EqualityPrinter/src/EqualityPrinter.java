public class EqualityPrinter {

    public static void main(String[] args) {

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }

    public static void printEqual (int value1, int value2, int value3){

        String printEqualString = "Invalid Value";
        @SuppressWarnings("SimplifiableConditionalExpression")
        boolean isValue = value1 >= 0
                        && value2 >= 0
                        && value3 >=0 ? true : false;
        @SuppressWarnings("SimplifiableConditionalExpression")
        boolean isEqual = value1 == value2
                        && value2 == value3 ? true : false;
        @SuppressWarnings("SimplifiableConditionalExpression")
        boolean isNotEqual = value1 != value2
                        && value1 != value3
                        && value2 != value3 ? true : false;
        if(isValue){

            if (isEqual){
                printEqualString = "All numbers are equal";
            } else if (isNotEqual){
                printEqualString = "All numbers are different";
            } else {
                printEqualString = "Neither all are equal or different";
            }

        }

        System.out.println(printEqualString);
    }
}
