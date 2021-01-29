public class SumOdd {

    public static void main(String[] args) {

        int methodOutput;

        methodOutput = sumOdd(1,100);
        System.out.println(methodOutput);

        methodOutput = sumOdd(-1,100);
        System.out.println(methodOutput);

        methodOutput = sumOdd(100,100);
        System.out.println(methodOutput);

        methodOutput = sumOdd(13,13);
        System.out.println(methodOutput);

        methodOutput = sumOdd(100,-100);
        System.out.println(methodOutput);

        methodOutput = sumOdd(100,1000);
        System.out.println(methodOutput);
    }

    public static int sumOdd(int start, int end){

        int sumOdd = -1;
        boolean isValidRange =
                    end >= start && start > 0 && end > 0 ? true : false;

        //Checks the start is before the end & both numbers are positive
        if(isValidRange){

            sumOdd = 0;

            for(int i=start; i<=end; i++){

                if(isOdd(i)){
                    sumOdd += i; //if the number is odd,
                                // sum = sum + the number
                }
            }
        }

        return sumOdd;
    }

    public static boolean isOdd(int number){

        boolean isOdd = false;
        boolean isValidNumber =
                    number > 0 ? true : false;

        //checks the number is greater than 0
        if(isValidNumber){

            isOdd = number % 2 != 0 ? true : false;
            //number is odd when not divisible by 2
        }

        return isOdd;
    }
}
