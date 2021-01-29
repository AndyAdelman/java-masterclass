public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

    }

    public static boolean hasSameLastDigit(int v1, int v2, int v3){

        boolean isSameLastDigit = false;
        boolean isValidRange =
                isValid(v1) && isValid(v2) && isValid(v3);
        int v1Last = v1 % 10;
        int v2Last = v2 % 10;
        int v3Last = v3 % 10;

        //You're checking to see if the last digit of any two inputs are equal
        //eg. 41, 22, 71 >> 41 and 71 both have a last digit 1
        //numbers are inclusive 10 to 1000

        if(isValidRange){

            isSameLastDigit =
                    (v1Last == v2Last)
                    || (v1Last == v3Last)
                    || (v2Last == v3Last)
                    ? true : false;
        }

        return isSameLastDigit;

    }

    public static boolean isValid(int number){

        boolean isValidRange =
                number >= 10 && number <= 1000 ? true : false;

        return  isValidRange;
    }
}
