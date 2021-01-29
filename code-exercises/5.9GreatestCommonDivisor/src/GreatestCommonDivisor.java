public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){

        int commonDivisor = 0;
        boolean isValidNumber =
                first > 9 && second > 9;
        int greater, lesser;

        //make sure the second number is bigger than the first
        //If not, reverse
        if(second >= first){
            greater = second;
            lesser = first;
        } else {
            greater = first;
            lesser = second;
        }

        //count backwards from the biggest number
        for(int divisor = greater; divisor >= 0; divisor--) {

            //check if both numbers are divisible by 0
            if ((greater % divisor == 0)
                    && (lesser % divisor == 0)) {

                //the first common denominator is automatically the largest
                //We're counting backwards
                commonDivisor = divisor;
                break;
            }
        }

        //make sure the inputs are greater than 9
        if(!isValidNumber){
            commonDivisor = -1;
        }

        return commonDivisor;
    }
}
