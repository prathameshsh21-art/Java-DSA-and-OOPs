package Bank;

class Account {

    private String name;
    private String email;
    private String password;

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Email
    public String getEmail() {
        return email;
    }

    // Setter for Email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for Password
    public String getPassword() {
        return password;
    }

    // Setter for Password
    public void setPassword(String password) {
        this.password = password;
    }

    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("Account Holder : " + name);
        System.out.println("Email          : " + email);
        System.out.println("Password       : " + password);
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Account account = new Account();

        account.setName("Prathamesh");
        account.setEmail("prathamesh.sh21@gmail.com");
        account.setPassword("abcd1234");

        account.displayAccountDetails();
    }
}
