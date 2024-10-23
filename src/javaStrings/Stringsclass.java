package javaStrings;

public class Stringsclass {

	public static void main(String[] args) {
// collection of charcaters
		String greetings = "Hello";
		System.out.println(greetings);
		System.out.println(".............");
//String length
		String str1 = "Hello  World";
		System.out.println(str1.length());
		System.out.println(".............");
//String equals
		String Str1 = "Google";
		String Str2 = "google";
		String Str3 = "Google";
		System.out.println(Str1.equals(Str3));
		System.out.println( Str2.equals(Str3));
		System.out.println(".............");
//String Equal ignorecase
		String Strs1 = "Google";
		String Strs2 = "google";
		System.out.println(Strs1.equalsIgnoreCase(Strs2));
		System.out.println(".............");
//toUpperCase() and toLowerCase():
		String txt00 = "Hello World";
		System.out.println(txt00.toUpperCase());   
		System.out.println(txt00.toLowerCase());
		System.out.println(".............");
//String contains
		String Strs11 = "Google get job";
		System.out.println(Strs11.contains("get"));
		System.out.println(".............");
//String Starts with
		String Strs111 = "Google get job";
		System.out.println(Strs111.startsWith("Goo"));
		System.out.println(".............");
//String ends with
		String Strs1111 = "Google get job";
		System.out.println(Strs1111.endsWith("ob"));
		System.out.println(".............");
//String concat 
		String text="apj Abdul";
		String text1="kalam";
		System.out.println(text.concat(text1));
		System.out.println(".............");
//String replace
		String text01="apj Abdul";
		System.out.println(text01.replace("apj", "APJ"));
		System.out.println(".............");
//The sequence \"  inserts a double quote in a string:
		String txt = "We are the so-called \"Vikings\" from the north.";
	    System.out.println(txt);	
	    System.out.println(".............");
//The sequence \'  inserts a single quote in a string:
	    String txt1 = "It\'s alright.";
	    System.out.println(txt1);	
	    System.out.println(".............");
//The sequence \\  inserts a single backslash in a string:	    
	    String txt01 = "The character \\ is called backslash.";
	    System.out.println(txt01);
		
		
	}

}
