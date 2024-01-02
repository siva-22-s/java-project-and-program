package com.javaprogram;

import java.util.Scanner;

public class count {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int number = scanner.nextInt();

	        int count = 0;
	        while (number > 0) {
	            count++;
	            number = number / 10;
	        }

	        System.out.println("The number of digits in the number is " + count);
	    }
	}


