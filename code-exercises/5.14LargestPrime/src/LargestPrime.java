public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime2(893));
    }

    //a naive solution is to iterate through all numbers
    //from 2 to n-1 and check every number if it divides n
    //if we find any number that divides, we know the number isn't prime
    //however, the divisor is a factor
    //since we're counting up, we're dividing by the smallest factor
    //the result is going to be the largest factor
    //this becomes our new number
    //we set the divisor to 2 and check if the new number is prime
    //by default, the new number will eventually become prime

    //This is because any non-prime number can be expressed as a
    //product of prime numbers, so if a number is exactly divisible
    //by a non-prime it is also exactly divisible by that number's
    //prime factors. if you can't break the number down into component
    //parts, it means the number is already prime



    //Second attempt
    public static int getLargestPrime2(int number) {

        boolean isValid = number >= 2;
        int div = 2;

        //one, zero and negatives are not a prime numbers
        if (!isValid) {
            return -1;
        } else {

            //iterate through every number 2 to n-1
            while(div < number){

                // not divisible? the number may be prime already; next divisor
                if (number % div != 0) {
                    div++;
                } else {                    //if the number is divisible,
                    number /= div;          //your new number is the division
                    div = 2;                //reset the divisor
                                            //check if new number is prime
                }

            }
        }

        return number;
    }


    //This works but good grief it's ugly!!!
    public static int getLargestPrime(int number) {

        boolean isValid = number > 2; // one and zero are not considered prime
        boolean isFactor = false;
        boolean isFlag = false;
        int checkNumber = 0;
        int greatestPrime = -1;

        //check number is greater than 0
        if (isValid) {

            //count upward from 1 to the number
            for (int i = 1; i <= number; i++) {

                //numbers that divide wholly are factors
                isFactor =
                        (number % i == 0) ? true : false;

                //if factor, check if prime
                if (isFactor) {

                    checkNumber = i;

                    for (int n = 2; n <= checkNumber / 2; n++) {

                        //condition if number is NOT!! a prime number
                        if (checkNumber % n == 0) {
                            isFlag = true;
                            break;
                        }
                        //a prime number will not be divisible by any number
                        //between 2 and itself

                    }

                    if (!isFlag) { //if it wasn't flagged, it's prime

                        //get the biggest prime number
                        if (checkNumber > greatestPrime) {
                            greatestPrime = checkNumber;
                        }

                    }

                }

            }

        }

        return greatestPrime;

    }
}