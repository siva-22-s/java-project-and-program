package com.Inharited;


public class SavingAccount {
	
public void deposit(double amount) {
        
        System.out.println("Deposited: $" + amount);
   
}

public void withdraw(double amount) {
    
        System.out.println("Withdrawn: $" + amount);
    
}

class SavingsAccount extends Bankaccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

}
