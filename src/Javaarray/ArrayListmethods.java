package Javaarray;

import java.util.ArrayList;

public class ArrayListmethods {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Nexon");
		cars.add("tata motors");
		cars.add("tiago");
		cars.add("indica");
		cars.add("safari");
		cars.add("xuv 300");
		cars.add("tata curv");
		//print array collection
		System.out.println("collection all cars:::"+cars.size());
		//print specific position value from collection
		System.out.println("poisition value from cars collection:::"+cars.get(2));
		//print from 0-5 values from collection
		for(int i=0;i<=5;i++)
		{
			System.out.println(cars.get(i));
		}
		System.out.println(".......................");
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
	}

}
