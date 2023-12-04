package Online_Banking_System;

public class SavingsAccount extends Account implements TransactionHistory{
    SavingsAccount(int acccountId, String accountHolderName) {
        super(acccountId, accountHolderName);
    }

    @Override
    public void viewTransactionHistory() {
        System.out.println("------------------------------------------");
        System.out.println("   Account Holder Name   :            "+this.accountHolderName);
        System.out.println("   Balance               :            "+this.balance);
        System.out.println("------------------------------------------");
        for(String s:this.log)
        {
            System.out.println("------------------------------------------");
            System.out.println(s);
            System.out.println("------------------------------------------");

        }
    }
}
