//Accessing the OPPs --> bank --> Bank.java
import OPPs.bank.*;
 class AccessingBank {
    public static void main(String[] args) {
        OPPs.bank.Bank acc1 =new Bank();
        acc1.name ="Suraj";
        System.out.println(acc1.name);

    }
}
