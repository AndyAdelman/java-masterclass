public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(5);
    }

    public static void printSquareStar(int number){

        boolean isFirst, isSecond, isThird, isFourth;

        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {

            for (int col = 0; col < number; col++) {

                isFirst = (row == 0 || row == number - 1);
                isSecond = (col == 0 || col == number - 1);
                isThird = (row == col);
                isFourth = (col == (number)-(row+1));

                if(isFirst){
                    System.out.print("*"); //first and last row
                } else if(!isFirst && isSecond){
                    System.out.print("*"); //first and last column
                } else if(!isFirst && !isSecond && isThird){
                    System.out.print("*"); //diagonal - left to right
                } else if(!isFirst && !isSecond && isFourth){
                    System.out.print("*"); //diagonal - right to left
                } else {
                    System.out.print(" "); //spaces
                }
            }

            System.out.println();
        }

    }
}
