package com.Inharited;

public class Bankaccount {
	    

		    public Bankaccount(String accountNumber, double balance) {
		       
		    }

		    public void deposit(double amount) {
		        
		            System.out.println("Deposited: $" + amount);
		       
		    }

		    public void withdraw(double amount) {
		        
		            System.out.println("Withdrawn: $" + amount);
		        
		    }

		   
		    

		    public static void main(String[] args) {
		        
		    	Bankaccount account = new Bankaccount("123456789", 1000.0);
		        
		        account.deposit(500.0);
		        
		        account.withdraw(200.0);
		        
		        account.withdraw(2000.0); 
		        
		    }
		}

		
