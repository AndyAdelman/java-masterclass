public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(1.5d);
        printConversion(10.25d);
        printConversion(-5.6d);
        printConversion(25.42d);
        printConversion(75.114d);

    }

    public static long toMilesPerHour(double kilometersPerHour){

        long milesPerHour;

        if (kilometersPerHour < 0.00d ) {
            milesPerHour = -1L;
        } else {
            milesPerHour = Math.round(kilometersPerHour / 1.609d);
        }

        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0.00d){
            System.out.println("Invalid Value");
        } else{
            System.out.println(kilometersPerHour + " km/h = " +
                    toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
