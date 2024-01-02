package com.javaprogram;

import java.util.Scanner;

public class Reverse {

	  Scanner scanner = new Scanner(System.in);
	  {

	  System.out.println("Enter the number: ");
      int number = scanner.nextInt();

      int reversedNumber = 0;
      int digit;
      while (number > 0) {
          digit = number % 10;
          reversedNumber = reversedNumber * 10 + digit;
          number = number / 10;
      }

      System.out.println("The reversed number is " + reversedNumber);
  }

}

