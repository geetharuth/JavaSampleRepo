package Javaoperators;

public class Logical_operators {

	public static void main(String[] args) {
		// Logical operators
		int x=300,y=400,z=300;
		System.out.println(x==z && y>x);
		System.out.println(x==z && y<x);
		System.out.println(x==z || y<x);
		System.out.println(x==y || y<z);
		System.out.println(!(x==y));
		System.out.println(!(x==z));

	}

}
