public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20,"silky");
        dog.eat();
        //notice dog can call eat() even though eat() is part of the
        //Animal class. the dog inherits the eat behavior from Animal
        //UNLESS!!! you override the eat() method in the Dog class
        //the eat method in the dog class is now calling both Dog.chew()
        //and Animal.eat()

        dog.walk();
        dog.run();
    }
}
