public class Dog extends Animal{

    //"extends" is how one class inherits from another
    //Dog "extends" (inherits from) Animal

    //we can now add fields (state) which are specific to Dogs but
    //beyond those we defined for all animals
    //you're "extending" the Animal class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Dog needs a constructor which calls the Animal constructor
    //you also can add the fields specific to Dog so they have values
    //when you intitalize the variable
    public Dog(String name,
               int size,
               int weight,
               int eyes,
               int legs,
               int tail,
               int teeth,
               String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    //"super" calls the constructor from the inherited class (Animal)

    //overriden method
    //all animals eat, however, dogs eat in a particular way
    //you can generate overriden methods from Code > Override
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
        //"super" calls the method from the inherited class (Animal)
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    //you can use super.move()
    //however, it's better to use move() in case you override
    //the Animal.move() method later

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {


    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
