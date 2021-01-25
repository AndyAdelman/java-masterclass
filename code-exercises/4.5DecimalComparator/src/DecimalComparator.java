public class DecimalComparator {

    public static void main(String[] args) {

        double inputLeft = -3.1756d;
        double inputRight = -3.175d;

        boolean isEqual =
                areEqualByThreeDecimalPlaces(inputLeft, inputRight);
        System.out.println(isEqual);

        inputLeft = 3.175d;
        inputRight = 3.176d;
        isEqual =
                areEqualByThreeDecimalPlaces(inputLeft, inputRight);
        System.out.println(isEqual);

        inputLeft = 3.0d;
        inputRight = 3.0d;
        isEqual =
                areEqualByThreeDecimalPlaces(inputLeft, inputRight);
        System.out.println(isEqual);

        inputLeft = -3.123d;
        inputRight = 3.123d;
        isEqual =
                areEqualByThreeDecimalPlaces(inputLeft, inputRight);
        System.out.println(isEqual);
    }

    public static boolean areEqualByThreeDecimalPlaces(double leftHand, double rightHand){

        boolean isEqual;

        //Move the decimal place so the desired precision is left of the decimal
        //3.1756 * 1000 = 3175.6
        leftHand = leftHand * 1000d;
        rightHand = rightHand * 1000d;

        //cast the double as int to truncate the unwanted decimals
        //3175.6 becomes 3175
        isEqual = (int) leftHand == (int) rightHand ? true : false;
        //The comparison is now accurate to 3 decimal places

        return isEqual;
    }
}
