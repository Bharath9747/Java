package Online_Banking_System;

public class CheckingAccount extends Account implements TransactionHistory,OverdraftProtection{
    private boolean f=false;
    @Override
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public boolean isF() {
        return f;
    }
    CheckingAccount(int acccountId, String accountHolderName) {
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
    boolean clearCheck(double checkAmount)
    {
        if(checkAmount < this.balance || isF() == true)
        {
            withdraw(checkAmount);
            this.log.add("Remaining Balance "+this.balance);
            return true;
        }
        else{
            this.log.add("Transaction Declined");
             return false;
        }

    }

    @Override
    public void applyOverdraftProtection() {
        this.f=true;
        this.log.add("OverDraft Protection Enabled");
    }
}
