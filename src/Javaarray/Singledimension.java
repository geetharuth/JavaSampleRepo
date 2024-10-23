package Javaarray;

public class Singledimension {

	public static void main(String[] args) {
		// Strore String type data into array variable
		String str[]= {"monday","tue","wed","thur","fri","sat","sun"};
		//print index number 2
		System.out.println(str[2]);
		System.out.println("..................");
		//Change an Array Element
		str[0]="mon";
		System.out.println(str[0]);
		System.out.println("..................");
		//print array length 
		System.out.println(str.length);
		System.out.println("..................");
		//print each position value from collection
		for(String each : str)
		{
			System.out.println(each);
			System.out.println("..................");
		}
		//store integer values into single dimension
		int x []=new int [5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		//print array length
		System.out.println(x.length);
		System.out.println("..................");
		//print each position value from collection
		for(int each : x)
		{
			System.out.println(each);
			
		}
	}

}
