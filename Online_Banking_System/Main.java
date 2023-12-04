package Online_Banking_System;

public class Main {
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1,"Bharath");
        a1.viewTransactionHistory();
        a1.deposit(10000);
        a1.deposit(10000,"Good Day");
        a1.clearCheck(1000000);
        a1.applyOverdraftProtection();
        a1.clearCheck(30000);
        a1.deposit(10000);
        a1.viewTransactionHistory();

    }
}
