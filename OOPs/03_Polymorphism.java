// Compile-Time Polymorphism (Method Overloading)
class Student {

    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Name : " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age : " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("===== Compile-Time Polymorphism =====");

        Student student = new Student();
        student.printInfo("Prathamesh");
        student.printInfo(21);
        student.printInfo("Prathamesh", 21);

        System.out.println();

        System.out.println("===== Runtime Polymorphism =====");

        Animal animal = new Dog();
        animal.sound();
    }
}
