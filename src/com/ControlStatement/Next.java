package com.ControlStatement;

public class Next {

	public static void main(String[] args) {
		
		 int mark = 95;
	        String grade = "";

	        if (mark < 0 || mark > 100) {
	            grade = "Invalid mark";
	        } else {
	            if (mark >= 90) {
	                grade = "A";
	            } else if (mark >= 80) {
	                grade = "B";
	            } else if (mark >= 70) {
	                grade = "C";
	            } else if (mark >= 60) {
	                grade = "D";
	            } else {
	                grade = "E";
	            }
	        }

	        System.out.println("The grade for mark " + mark + " is " + grade);
	    }
	


	}


