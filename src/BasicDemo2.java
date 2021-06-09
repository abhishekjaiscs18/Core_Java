package com.abhishekJaisCs18.basics; 
import java.util.*;

class BasicDemo2 {
	static void stringExamples() {
		System.out.println("\nInside stringExamples ...");
		String s = "hello world!";
		System.out.println("s: " + s);
		
		System.out.println("\ns.length(): " + s.length());
		System.out.println("s.isEmpty(): " + s.isEmpty());
		
		// Comparison
		System.out.println("\ns.equals(\"HELLO WORLD!\"): " + s.equals("HELLO WORLD!"));
		System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): " + s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println("s.compareTo(\"HELLO WORLD!\"): " + s.compareTo("HELLO WORLD!"));
		
		// Searching
		System.out.println("\ns.contains(\"HELLO WORLD!\"): " + s.contains("HELLO WORLD!"));
		System.out.println("s.contains(\"world!\"): " + s.contains("world!"));
		System.out.println("s.startsWith(\"HELLO WORLD!\"): " + s.startsWith("HELLO WORLD!"));
		System.out.println("s.startsWith(\"hello world!\"): " + s.startsWith("hello world!"));
		System.out.println("s.endsWith(\"!\"): " + s.endsWith("!"));
		System.out.println("s.indexOf(\"lo\"): " + s.indexOf("lo"));
		System.out.println("s.indexOf(\"o\"): " + s.indexOf('o'));
		System.out.println("s.lastIndexOf(\"o\"): " + s.lastIndexOf('o'));
		
		// Examining individual characters
		System.out.println("\ns.charAt(4): " + s.charAt(4));
		
		// Extracting substrings
		System.out.println("\ns.substring(4): " + s.substring(4));
		System.out.println("s.substring(4, 9): " + s.substring(4, 9));
		
		// Case conversions (Note: String is immutable. So, only a copy is returned)
		System.out.println("\ns.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());
		
		System.out.println("\ns.trim(): " + s.trim()); // returns a copy of string after trimming any leading & trailing white spaces
		
		
		// Replace (e.g., replace comma's with white-space)
		System.out.println("\ns.replaceAll(\"o\", \"r\"): " + s.replaceAll("o", "r"));
		
		// Split (e.g., split a document into words or split a line of text by tab or comma or white space)
		System.out.println("\ns.split(\"o\"): ");
		String[] sa = s.split("o");
		for (String temp : sa) {
			System.out.println(temp);
		}
		
		// Static method (includes overloaded methods)
		System.out.println("\nString.valueOf(1.3): " + String.valueOf(1.3));
	}
	static void stringPool() {
		  	System.out.println("\nInside stringPool ...");
		  String s1 = "hello!";
		  String s2 = "hello!";
		  String s3 = "hello!".intern();
		  String s4 = new String("hello!");	 
		  String s5 = "lo!";

    		  System.out.println("s1 == s2: " + (s1 == s2)); \\ s1 and s2 are reffering to the same object
  		  System.out.println("s1 == s3: " + (s1 == s3)); \\ s1 and s3 are reffering to different objects 
   		  System.out.println("s1 == s4: " + (s1 == s4)); \\ s1 and s4 are reffering to different objects
  		  System.out.println("s1 == s4.intern(): " + (s1 == s4.intern())); \\ s1 and s4 are reffering to same object
  		  System.out.println("s1 == \"hel\" + \"lo!\": " + (s1 == "hel" + "lo!")); \\ s1 and "hel" + "lo!" are reffering to the same object
   		  System.out.println("s1 == \"hel\" + s5: " + (s1 == "hel" + s5)); \\ s1 and "hel" + s5 are reffering to different objects
    }
	static void stringConcatination(){

	System.out.println("\nInside stringConcatination ...");
	String s = "Hello" + " World!" ;
	System.out.println("s: " + s + "\n\n");
	
	StringBuffer sb = new StringBuffer(s);
	sb.append(" Good ").append("Morning...");
	System.out.println("sb : " + sb.toString());
	System.out.println("sb.length : " + sb.length());
	sb.delete(1,5);
	System.out.println("sb : " + sb.toString());
	System.out.println("sb.length : " + sb.length());
	sb.insert(1, "ey");
	System.out.println("sb : " + sb.toString());
	System.out.println("sb.length : " + sb.length()+"\n\n"); 

	StringBuilder sb1 = new StringBuilder(s);
	sb1.append(" Good ").append("Morning...");
	System.out.println("sb1 : " + sb1.toString());
	System.out.println("sb1.length : " + sb1.length());
	sb1.delete(1,5);
	System.out.println("sb1 : " + sb1.toString());
	System.out.println("sb1.length : " + sb1.length());
	sb1.insert(1, "ey");
	System.out.println("sb1 : " + sb1.toString());
	System.out.println("sb1.length : " + sb1.length());
}
	
static void escapeSequence(){

	System.out.println("\nInside Escape Sequence ...");
	String s1="Hello \"Mr. Happy\", \n\tHow are you? ";
	System.out.println(s1);
	
	char[] s2 = { '\'' , '"' , 'l' , 'l' , 'o' };
	
	
}
	
	public static void main(String[] args) {
		System.out.println("\n Inside BasicDemo2... ");
		Date date;
		ArrayList List;
		java.sql.Date date1;
		stringExamples();
		stringPool();
		stringConcatination();
		escapeSequence();

	}
}
