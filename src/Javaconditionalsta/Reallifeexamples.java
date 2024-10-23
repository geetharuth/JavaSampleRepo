package Javaconditionalsta;

public class Reallifeexamples {

	public static void main(String[] args) {
// if..else to "open a door" if the user enters the correct code:
		int door = 1337;
		if(door==1337)
		{
			System.out.println("correct code.the door remains open");
		}
		else
		{
			System.out.println("wrong code.the door remains code");
		}

//use if..else to find out if a number is positive or negative:
		int x=10;
		if(x<20)
		{
			System.out.println("the value is positive number");
		}
		else if(x==11)
		{
			System.out.println("the value is negative number");
		}
		else
		{
			System.out.println("the value is zero");
		}

//Find out if a person is old enough to vote:
		int myage1 = 28;
		if(myage1>=18) 
		{
			System.out.println("old enough to vote");
		}
		else
		{
			System.out.println("not old enough to vote");
		}
	}

}
