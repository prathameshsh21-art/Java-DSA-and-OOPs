class Customer {
    String name;
    int customerId;
    double balance;

    // Default Constructor
    Customer() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Customer(String name, int customerId, double balance) {
        this.name = name;
        this.customerId = customerId;
        this.balance = balance;
    }

    // Copy Constructor
    Customer(Customer other) {
        this.name = other.name;
        this.customerId = other.customerId;
        this.balance = other.balance;
    }

    public void printDetails() {
        System.out.println("Customer Name : " + name);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Balance       : ₹" + balance);
        System.out.println();
    }
}

public class Constructors {
    public static void main(String[] args) {

        // Default Constructor
        Customer c1 = new Customer();
        c1.name = "Prathamesh";
        c1.customerId = 666;
        c1.balance = 83000.0;

        // Parameterized Constructor
        Customer c2 = new Customer("Alice", 200, 50000.0);

        // Copy Constructor
        Customer c3 = new Customer(c1);

        System.out.println("\nDefault Constructor Object");
        c1.printDetails();

        System.out.println("Parameterized Constructor Object");
        c2.printDetails();

        System.out.println("Copy Constructor Object");
        c3.printDetails();
    }
}
