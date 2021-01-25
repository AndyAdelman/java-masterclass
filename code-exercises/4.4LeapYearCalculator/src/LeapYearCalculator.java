public class LeapYearCalculator {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

    public static boolean isLeapYear(int year) {

        boolean isLeapYear;
        boolean isStepOne, isStepTwo, isStepThree, isValidRange;

        isStepOne = year % 4 == 0 ? true : false;
        isStepTwo = year % 100 == 0 ? true : false;
        isStepThree = year % 400 == 0 ? true : false;
        isValidRange = year >= 1 && year <= 9999 ? true : false;

        if (
                (isValidRange
                        && isStepOne
                        && !isStepTwo) //Divisible by 4 but not 100

                        ||      //OR

                (isValidRange
                        && isStepOne
                        && isStepTwo
                        && isStepThree) //Divisible by 4, 100, and 400
        ) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        return isLeapYear;

        //Alternative

        /*isLeapYear = true;

        if(!isValidRange){
            isLeapYear = false;
        } //Not a valid Range

        if(!isStepOne){
            isLeapYear = false;
        } //Not divisible by 4

        if(isStepOne && isStepTwo && !isStepThree){
            isLeapYear = false;
        } //Divisible by 4 and 100 but not 400

        return isLeapYear;*/
    }
}
