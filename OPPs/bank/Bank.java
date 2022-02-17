//Accessed by OPPs --> Accessingbank.java ..

package OPPs.bank;
class Account {
    public String name;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public String name; //for AccessignBank.java

    public static void main(String[] args) {
        Account acc= new Account();
        acc.name= "Suraj";
        acc.setPassword("abcd");

        System.out.println(acc.name);
        System.out.println(acc.getPassword());
    }

}
