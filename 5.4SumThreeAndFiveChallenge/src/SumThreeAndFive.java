public class SumThreeAndFive {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        //check numbers 1 to 1000 inclusive
        for(int i=1; i <= 1000; i++){

            //check numbers are divisible by both 3 and 5
            boolean isDivisible =
                    ((i % 3 == 0) && (i % 5 == 0));

            //find only the first 5 matches
            if (counter < 5) {

                if (isDivisible) {
                    sum = sum + i;
                    counter++;
                    System.out.println( //print the number
                            i + " is divisible by bother 3 and 5");
                }

            }else{

                System.out.println( //print the sum of the 5 matches
                        sum + " is the sum of the divisible numbers");

                break;
            }
        }
    }


}
