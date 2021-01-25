package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte myByteValue = 125;
        short myShortValue = 32000;
        int myIntValue = 1000000;
        long myLongValue =
                50000L + (10L * (myByteValue + myShortValue + myIntValue));
        System.out.println(myByteValue);
        System.out.println(myShortValue);
        System.out.println(myIntValue);
        System.out.println(myLongValue);
    }
}
