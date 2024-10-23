package Javaconditionalsta;

public class Allconditions {

	public static void main(String[] args) {
//if 20 is greater than 18. If the condition is true 
		if(20>18)
		{
			System.out.println("20 is greater than 18");
		}
		//test variables
		int x=20;
		int y=18;
		if(x>y)
		{
			System.out.println("20 is greater than 18");
		}
//else 
		int time=20;
		if(time<18)
		{
			System.out.println("good day");
		}
		else
		{
			System.out.println("good evening");
		}
//else if 
		int time1=20;
		if(time1<18)
		{
			System.out.println("good morning");
		}
		else if(time1<10)
		{
			System.out.println("good day");
		}
		else if(time1>10)
		{
			System.out.println("good day");
		}
		else
		{
			System.out.println("good evening");
		}
//short hand if else
		int time2=20;
		String result =(time2<18) ? "good  day." : "good evening.";
		System.out.println(result);
		
	}

}
