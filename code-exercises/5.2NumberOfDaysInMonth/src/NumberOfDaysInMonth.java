public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        String daysInMonth;

        daysInMonth = "There are " +
                getDaysInMonth(1,2020)
                + " days in the month";
        System.out.println(daysInMonth);

        daysInMonth = "There are " +
                getDaysInMonth(2,2020)
                + " days in the month";
        System.out.println(daysInMonth);

        daysInMonth = "There are " +
                getDaysInMonth(2,2018)
                + " days in the month";
        System.out.println(daysInMonth);

        daysInMonth = "There are " +
                getDaysInMonth(9,2020)
                + " days in the month";
        System.out.println(daysInMonth);

        daysInMonth = "There are " +
                getDaysInMonth(-1,2020)
                + " days in the month";
        System.out.println(daysInMonth);
    }

    public static int getDaysInMonth(int month, int year){

        int daysInMonth = -1;
        boolean isValidMonth, isValidYear;

        isValidMonth = month >= 1 && month <=12 ? true : false;
        isValidYear = year >= 1 && year <= 9999 ? true : false;

        //Checks for valid month and year
        if(isValidMonth && isValidYear){

            switch (month){

                //February
                case 2:
                    if(isLeapYear(year)){
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;

                //30 days has September...
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;

                //All the rest have 31...
                default:
                    daysInMonth = 31;
                    break;
            }
        }

        return daysInMonth;
    }

    public static boolean isLeapYear(int year){

        boolean isLeapYear = false;
        boolean isValid =
                year >= 1 && year <= 9999 ? true : false;

        //Checks if the year is a leap year
        if (isValid) {

            isLeapYear =
                    ((year % 4 == 0) && (year % 100 != 0))
                            || (year % 400 == 0) ? true : false;
            // divisible by 4 but NOT 100, OR divisible by 400

        }
        return isLeapYear;
    }
}
