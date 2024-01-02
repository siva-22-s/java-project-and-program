package com.String;

public class Sting_function {

	private static boolean s2;

	public static void main(String[] args) {
		String s1 = "Welcome To Java";
		int le = s1.length();
		System.out.print(le);
		
		
		//2.equal
		
		//String s2 = "Welcome To Java";
		//boolean eq = s1.equals(s2);
		//System.out.print(eq);
		
		//equalIgnorecase
		//boolean eqc = s1.equalsIgnoreCase(s2);
		//System.out.print(eqc);
		
		//4.upeercase
		//String uc =s1.toUpperCase();
		//System.out.print(uc);
		
		//lowercase
		
		String lc = s1.toLowerCase();
		System.out.print(lc);
		
		//startswith
		
		boolean sw = s1.startsWith("Welcome");
		System.out.print(sw);
		
		//endswith

		String s2 = "Welcome To Java";
		String s21 = "Java";
		String ew = s21;
		System.out.print(ew);
		
		//contains
		
		boolean con = s1.contains(s2);
		System.out.print(con);
		
		//index of
		 int io = s1.indexOf("l");
		 System.out.print(io);
		 
		 // lastindex
		 
		 int lio = s1.indexOf("e");
		 System.out.print(lio);
		 
		 //charat
	
		 char ca = s1.charAt(12);
		 System.out.print(ca);
		 
		 //replace
		 
		 String rep = s1.replace("To", "2");
		 System.out.print(rep);
		 
		 //substring
		 
		 String ss = s1.toString();
		 System.out.print(ss);
		 
		 //isempty
		 
		 boolean em = s1.isEmpty();
		 System.out.print(em);
		 
		 //trim
		  
		 String em1 = s1.trim();
		 System.out.print(em1);
		 
		 //split()
		 String s3 = "Welcome- To -Java";
		 String[] sp = s3.split("-");
		 System.out.print(sp);
		 
				 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		}

	private static void Substring() {
		// TODO Auto-generated method stub
		
	}

	

}
