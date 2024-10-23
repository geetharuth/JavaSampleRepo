package Javaarray;

public class LoopThrougharray {

	public static void main(String[] args) 
	{
// Loop Through an Array for loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++)
		{
		  System.out.println(cars[i]);
		 }
		System.out.println("..............");
		
		
		
//loop through an array for each loop
		String[] text = {"Volvo", "BMW", "Ford", "Mazda"};
		for(String each : text)
		{
			System.out.println(each);
		}
	}
}
