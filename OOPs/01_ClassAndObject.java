class Customer {
    String name;
    int customerId;
    double balance;

    public void printDetails() {
        System.out.println("Customer Name : " + this.name);
        System.out.println("Customer ID   : " + this.customerId);
        System.out.println("Balance       : ₹" + this.balance);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.name = "Prathamesh";
        c1.customerId = 666;
        c1.balance = 83000.0;

        Customer c2 = new Customer();
        c2.name = "Alice";
        c2.customerId = 200;
        c2.balance = 50000.0;

        System.out.println("Customer 1 Details");
        c1.printDetails();

        System.out.println();

        System.out.println("Customer 2 Details");
        c2.printDetails();
    }
}
