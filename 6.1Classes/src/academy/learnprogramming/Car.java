package academy.learnprogramming;

import java.util.Locale;

public class Car {

//Class:
//A class is essentially a super data type where we define the state
//and behavior

//Access Modifiers:
//public - unrestricted access to the class
//private - no other class can access the class
//protected - allows classes in your package to access the class

//Variables:
//local variables - variables accessible only within the class
//fields - variables accessible outside the class
    //fields will have an access modifier, usually private
    //this is part of encapsulation
    //the internal representation of an object is hidden from view
    //outside the object's definition

    //these are fields which describe the state of the object
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){

        //problem: you now have two variables named model, a field and a parameter
        //you use the "this" key word to refer to the field (the class variable)
        //the other model is the parameter given to the method
        //this.model = model;
        //^field    ^parameter

        //setters are useful b/c you can add validation
        //when you create a class, you setup all the rules related
        //to that class (what is valid, what is not valid)
        //the main method therefore can't create an invalid object
        //your validation is encapsulated within the class
        //your rules are inherited when you create the object

        //eg. you can't assign a value to porsche.model we
        //haven't already determined is valid

        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    //this method allows you to access the private field outside the class
    public String getModel() {
        return this.model;
    }

}
