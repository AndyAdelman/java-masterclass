public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){

        String yearsAndDaysString = "Invalid Value";
        boolean isMinutes = minutes >= 0L ? true : false;
        long years, days, hours, daysRemaining;

        if(isMinutes){

            hours = minutes / 60;
            days = hours / 24;
            years = days / 365;
            daysRemaining = days % 365;

            yearsAndDaysString =
                    (minutes + " min = " + years + " y and " + daysRemaining + " d");
        }

        System.out.println(yearsAndDaysString);
    }
}
