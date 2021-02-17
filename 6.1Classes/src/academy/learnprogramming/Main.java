package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //define the object
        Car porsche = new Car();
                        //initialize the object
        Car holden = new Car();
        //you ALWAYS need to initialize the object

        //porsche.model = "Carrera";
        //no longer works because the field is private

        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("Carrera");
        //we call the object's method instead

        System.out.println("Model is " + porsche.getModel());
    }
}