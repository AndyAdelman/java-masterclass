public class AllFactors {

    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){

        boolean isValid =
                number > 0;

        //check number is greater than 0
        if(isValid) {

            //count upward from 1 to the number
            for (int i = 1; i <= number; i++) {

                //numbers that divide wholly are factors
                if (number % i == 0) {

                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Invalid Value");
        }
    }
}
