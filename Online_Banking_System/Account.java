package Online_Banking_System;

import java.util.ArrayList;

public class Account {
    private int acccountId;
    String accountHolderName;
    ArrayList<String> log;
    double balance=0;
    Account(int acccountId,String accountHolderName)
    {
        this.acccountId = acccountId;
        this.accountHolderName=accountHolderName;
        this.log = new ArrayList<>();
    }
    public void deposit(double amount){
        this.balance+=amount;
        this.log.add("Amount Deposited  "+amount);
    }
    public void deposit(double amount,String msg){
        this.balance+=amount;
        this.log.add("Amount Deposited  "+amount+"\n"+msg);

    }
    public void withdraw(double amount){
        if(this.balance>amount)
        this.balance-=amount;
        else{
            this.log.add("Transaction Declined");
            return;
        }
        this.log.add("Remaining Balance "+this.balance);
    }
    
}
