package com.BankingApplication;

import java.util.Scanner;

public class BankAccount {
	
	int balance;
	
	int previousTransaction;
	
	String CustomerName;
	
	String CustomerId;

	public BankAccount (String Cname,String cid) {
		
		 CustomerName=Cname;
		 
		 CustomerId=cid;
		
	}
	
	public void deposit(int amount) {
		
		if(amount!=0) {
			
			balance=balance+amount;
			
			previousTransaction=-amount;
			
			
		}
		
	}
	
	public void withdraw(int amount) {
		
		balance=balance-amount;
		
		previousTransaction=amount;
		
	}
	
	public void getpreviousTransaction() {
		
		if(previousTransaction>0) {
			
			System.out.println("Deposited :" + previousTransaction);
		}
		
		else if(previousTransaction>0){
			
			System.out.println("withdraw:" + Math.abs(previousTransaction));
		}
		else {
			System.out.println("No transaction Occured");
			
		}
	}


	
	public void ShowMenu() {
		
		char option='\0';
		
		Scanner sc = new Scanner(System.in); {
			
			System.out.println("Welcome"+ CustomerName) ;
			
			System.out.println("Your id is"+ CustomerId) ;
			
			System.out.println();
			
			System.out.println("1. Check Balance ");
			
			System.out.println("2. Deposite ");
			
			System.out.println("3. Withdraw ");
			
			System.out.println("4. previousTransaction ");
			
			System.out.println("5. Exit ");
			
			do {
				
				System.out.println("============================================");
				
				System.out.println("Enter an option :");
				
				System.out.println("--------------------------------------------");
				
				option= sc.next().charAt(0);
				
				switch (option) {
				
				case'1':
					
					System.out.println("--------------------------------------------");
					
					System.out.println("Balance = " + balance);
					
					System.out.println();
					
					break;
					
			   case'2':
					
					System.out.println("--------------------------------------------");
					
					System.out.println("Enter the amount to Deposite");
					
					System.out.println("---------------------------------------------");
					
					int amount =sc.nextInt();
					
					deposit(amount);
					
					System.out.println();
					
					break;
					
			   case'3':
					
					System.out.println("--------------------------------------------");
					
					System.out.println("Enter the amount to Withdraw");
					
					System.out.println("=============================================");
					
					int amount2 = sc.nextInt();
					
					withdraw(amount2);
					
					System.out.println();
					
					break;
					
			   case'4':
					
					System.out.println("--------------------------------------------");
					
					getpreviousTransaction();
					
					System.out.println("=============================================");
					
					System.out.println();
					
					break;
					
			   case'5':
					
						System.out.println("--------------------------------------------");
						
						break;
						
						default:
							
							System.out.println("Invaild option !! , please enter again");
							
				}
				
			
			} while (option!='5');

		
		System.out.println("Thank you for using services");
		
  }
	}
}


