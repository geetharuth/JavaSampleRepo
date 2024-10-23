package javaStrings;

public class SplitString {

	public static void main(String[] args) {
		// Split characters into array collection dob
		String Dob = "18-jan-2024";
		String [] str= Dob.split("-");
		System.out.println(str[1]);
		//split  text
		String text= "iam so happy today";
		String [] str1=text.split("so");
		System.out.println(str1[1]);
		//split @
		String companies="HCL@TCS@GOOGLE@TECHM";
		String x []=companies.split("@");
		System.out.println(x[2]);
		
		

	}

}
