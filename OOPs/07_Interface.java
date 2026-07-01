// Interface
interface Animal {

    // Constant (public static final by default)
    int EYES = 2;

    // Abstract Method (public abstract by default)
    void walk();
}

// Another Interface
interface Herbivorous {

    void eatGrass();
}

// Class implementing multiple interfaces
class Horse implements Animal, Herbivorous {

    @Override
    public void walk() {
        System.out.println("Horse walks on 4 legs.");
    }

    @Override
    public void eatGrass() {
        System.out.println("Horse eats grass.");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Horse horse = new Horse();

        horse.walk();
        horse.eatGrass();

        System.out.println("Number of Eyes: " + Animal.EYES);
    }
}
