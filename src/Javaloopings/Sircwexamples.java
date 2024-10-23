package Javaloopings;

import java.util.Scanner;

public class Sircwexamples {

	public static void main(String[] args) {
		//verify given marks pass or fail
		Scanner s = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks1 = s.nextInt();
		for(int i=1;i<=10;i++)
		{
		System.out.println("Enter the marks");
		int marks =s.nextInt();
		if (marks>=35) {
			System.out.println("Pass    "+marks);
			
		}
		else
		{
			System.out.println("Fail    "+marks);
		}

		

	}
	}
}
