package Javaloopings;

public class Nestedloop {


	public static void main(String[] args) {
		//outer loop
		for(int i=1;i<=2;i++)
		{
			System.out.println(" outer: "+ i);// Executes 2 times
		}
		//inner loop
		for(int J=1;J<=3;J++)
		{
			System.out.println(" inner: "+ J);// Executes 6 times (2 * 3)
		}
		

	}

}
