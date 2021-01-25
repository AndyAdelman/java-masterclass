package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double firstDouble;
        double secondDouble;
        double myResult;
        boolean isRemainderZero;

        //step 1
        firstDouble = 20.00d;
        //step 2
        secondDouble = 80.00d;
        //step 3
        myResult = (firstDouble + secondDouble) * 100.00d;
        //step 4
        myResult = myResult % 40.00d;
        //step 5
        isRemainderZero = (myResult == 0.00d) ? true : false;
        //step 6
        System.out.println("Remainder equals zero? " + isRemainderZero);
        //step 7
        if(!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
