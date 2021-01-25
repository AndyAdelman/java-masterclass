public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean isTeen(int valueOne){

        return valueOne >= 13 && valueOne <= 19;

    }

    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree){

        boolean hasTeen;
        boolean isOne, isTwo, isThree;

        isOne = valueOne >= 13 && valueOne <=19 ? true : false;
        isTwo = valueTwo >= 13 && valueTwo <=19 ? true : false;
        isThree = valueThree >= 13 && valueThree <=19 ? true : false;

        if( isOne || isTwo || isThree){
            hasTeen = true;
        } else {
            hasTeen = false;
        }

        return hasTeen;
    }
}