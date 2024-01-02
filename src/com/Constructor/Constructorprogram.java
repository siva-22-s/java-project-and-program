package com.Constructor;

public class Constructorprogram {
	
	 String name;
	    int age;

	    public Constructorprogram() {
	        name = "John Doe";
	        age = 30;
	    }

	    public Constructorprogram(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public void printPerson() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	



	    public static void main(String[] args) {
	    	Constructorprogram person1 = new Constructorprogram();
	        person1.printPerson();

	        Constructorprogram person2 = new Constructorprogram("Jane Doe", 25);
	        person2.printPerson();

}
	}
