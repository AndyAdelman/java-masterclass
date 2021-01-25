package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        //float myFloatBad = 5.25;
        float myFloatGood = 5.25f;
        float myFloatCast = (float) 5.25;

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        System.out.println("MyInt = " + myInt);
        System.out.println("My Float = " + myFloat);
        System.out.println("My Double = " + myDouble);

        double numberOfPounds = 1.5d;
        double convertedKilos = 0.45359237d;
        double myResult = numberOfPounds / convertedKilos;
        System.out.println();
        System.out.println("Converted Kilograms = " + myResult);

        double usingUnderscores = 3_000_000.4_000_999d;
        System.out.println();
        System.out.println("Using Underscores = " + usingUnderscores);
    }
}
