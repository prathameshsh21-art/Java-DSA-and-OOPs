// Abstract Class
abstract class Animal {

    // Constructor
    Animal() {
        System.out.println("Animal object is being created.");
    }

    // Abstract Method
    abstract void walk();

    // Concrete Method
    public void eat() {
        System.out.println("Animals eat food.");
    }
}

// Child Class - Horse
class Horse extends Animal {

    Horse() {
        System.out.println("Horse object created.");
    }

    @Override
    public void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
}

// Child Class - Chicken
class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken object created.");
    }

    @Override
    public void walk() {
        System.out.println("Chicken walks on 2 legs.");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Horse horse = new Horse();

        System.out.println();

        horse.walk();
        horse.eat();

        System.out.println();

        Chicken chicken = new Chicken();

        System.out.println();

        chicken.walk();
        chicken.eat();
    }
}
