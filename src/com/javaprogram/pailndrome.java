package com.javaprogram;

import java.util.Scanner;

public class pailndrome {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int number = scanner.nextInt();

	        int originalNumber = number;
	        int reversedNumber = 0;
	        int digit;
	        while (number > 0) {
	            digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number = number / 10;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println("The number is a palindrome");
	        } else {
	            System.out.println("The number is not a palindrome");
	        }
	    }
	}



