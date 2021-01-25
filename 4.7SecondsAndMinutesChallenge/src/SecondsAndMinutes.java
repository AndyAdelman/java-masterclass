public class SecondsAndMinutes {

    //Using constant variable
    //variable is declared in the class outside any method.
    //keyword final will generate an error if you attempt to assign
    //the variable a new value.
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds){

        String durationString = INVALID_VALUE_MESSAGE;
        boolean isMinutes = minutes >= 0 ? true : false;
        boolean isSeconds = seconds >= 0 && seconds <= 59 ? true : false;
        int hours, remainingMinutes;

        if (isMinutes && isSeconds){

            hours = minutes / 60;
            remainingMinutes = hours % 60;

            durationString =
                    hours + "h "
                    + remainingMinutes + "m "
                    + seconds + "s";
        }

        return durationString;
    }

    public static String getDurationString(int seconds){

        String durationString = INVALID_VALUE_MESSAGE;
        boolean isSeconds = seconds >= 0 ? true : false;
        int minutes, remainingSeconds;

        if (isSeconds) {

            minutes = seconds / 60;
            remainingSeconds = seconds % 60;

            System.out.println(minutes + "m " + remainingSeconds + "s");
            durationString = getDurationString(minutes, remainingSeconds);
        }

        return durationString;
    }
}
