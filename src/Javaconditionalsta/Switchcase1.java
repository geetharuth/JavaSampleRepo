package Javaconditionalsta;

import java.util.Scanner;

public class Switchcase1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=1;i<=7;i++)
		{
			System.out.println("Enter the Course");
			String course=s.next();
			switch (course.toUpperCase()) {
			case "MANUAL":
				System.out.println("Course is avialable  "+course);
				break;
			case "SELENIUM":
				System.out.println("Course is avialable  "+course);
				break;
			case "JAVA":
				System.out.println("Course is avialable  "+course);
				break;
			case "PYTHON":
				System.out.println("Course is avialable  "+course);
				break;
			default:
				System.out.println("Course is Not avialable  "+course);
				break;
			}
		}

	}

}
