package Javaconditionalsta;

public class Switchcase {

	public static void main(String[] args) {
		//The example below uses the weekday number to calculate the weekday name:
		int day=4;
		switch (day)
		{
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		//The default keyword specifies some code to run if there is no case match:
		int day1 = 4;
		switch (day1) 
		{
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
	}
	}
}
