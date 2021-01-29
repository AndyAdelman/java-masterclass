package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int value = 2;

        if(value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        } else{
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;

        switch(switchValue){

            case 1: //if value == 1
                System.out.println("Value was 1");
                break; // exit switch

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5: // you can group case conditions together
                System.out.println("was a 3 or 4 or 5");
                System.out.println("actually was " + switchValue);
                break;

            default: //else
                System.out.println("Was not 1 or 2");
                break;
        }

        //Use with byte, short, char, int, string (as of Java 7)
        //Cannot use long, float or double

        //unlike an if statement, switch statements can only test a single value
        //You can't use &&, ||, or other logical operators. You also can't change data types.

        //You need a break statement after each case evaluation.
        //Otherwise, the code can fall through to the next statement block.

        //Challenge

        char charValue = 'A';

        switch(charValue){

            case 'A':
                System.out.println("char is A");
                break;
            case'B':
                System.out.println("char is B");
                break;
            case'C':
                System.out.println("char is C");
                break;
            case'D':
                System.out.println("char is D");
                break;
            case'E':
                System.out.println("char is E");
                break;
            default:
                System.out.println("char is not A,B,C,D or E");
                break;
        }

        String monthValue = "JAnUaRy";

        switch(monthValue.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
        //Requires exact match for String type.
        //You can ease this requirement by using String.toLowerCase.
        //Make sure your case string is lowercase though!!!



    }
}
