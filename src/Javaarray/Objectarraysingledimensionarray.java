package Javaarray;

import java.util.ArrayList;

public class Objectarraysingledimensionarray {

	public static void main(String[] args) {
		//store differnt datatypes
				Object x[]= new Object[6];
				x[0]=100;
				x[1]="Hello";
				x[2]=234.456;
				x[3]='r';
				x[4]=true;
				x[5]=false;
				for (Object each : x) 
				{
					System.out.println(each);
				}
			
	}

}
