package Javatypecasting;

public class widening_and_narrowing {

	public static void main(String[] args) {
		// Widening Casting (automatically) - converting a smaller type to a larger type size
int mynums=10;
double mynum1 = mynums;
System.out.println(mynum1);
//Narrowing Casting (manually) - converting a larger type to a smaller size type
double mydouble=10.0;
int mynum2 = (int)mydouble;
System.out.println(mynum2);
	}
	
}
