class Student {

    String name;
    static String school;

    public void displayDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("School       : " + school);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        // Static variable belongs to the class
        Student.school = "CMR University";

        Student s1 = new Student();
        s1.name = "Prathamesh";

        Student s2 = new Student();
        s2.name = "Alice";

        System.out.println("Student 1 Details");
        s1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.displayDetails();

        System.out.println();

        // Accessing static variable using class name
        System.out.println("School Name : " + Student.school);
    }
}
