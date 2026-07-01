// Parent Class
class Shape {

    String color;

    public void displayColor() {
        System.out.println("Color : " + color);
    }

    public void area() {
        System.out.println("Displays Area");
    }
}

// Single Inheritance
class Triangle extends Shape {

    public void area(int base, int height) {
        System.out.println("Area of Triangle : " + (0.5 * base * height));
    }
}

// Multi-Level Inheritance
class EquilateralTriangle extends Triangle {

    public void displayType() {
        System.out.println("This is an Equilateral Triangle");
    }
}

// Hierarchical Inheritance
class Circle extends Shape {

    public void area(int radius) {
        System.out.println("Area of Circle : " + (3.14 * radius * radius));
    }
}

public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("===== Single Inheritance =====");
        Triangle triangle = new Triangle();
        triangle.color = "Red";
        triangle.displayColor();
        triangle.area(10, 20);

        System.out.println();

        // Multi-Level Inheritance
        System.out.println("===== Multi-Level Inheritance =====");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.color = "Blue";
        equilateralTriangle.displayColor();
        equilateralTriangle.displayType();
        equilateralTriangle.area(15, 20);

        System.out.println();

        // Hierarchical Inheritance
        System.out.println("===== Hierarchical Inheritance =====");
        Circle circle = new Circle();
        circle.color = "Green";
        circle.displayColor();
        circle.area(7);
    }
}
