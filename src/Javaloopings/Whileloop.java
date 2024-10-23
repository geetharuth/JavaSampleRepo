package Javaloopings;

public class Whileloop {

	public static void main(String[] args) {
		// Loop will run, over and over again, as long as a variable (i) is less than 5:
int i=0;
while(i<5)
{
	System.out.println(i);
	i++;
}
//print even number  0-20
		int i1=0;
		while(i1<=20)
		{
			System.out.println(i1);
			i1+=2;
		}
//setting the infinite while loop by passing true to the condition 
		while(true)
		{
			System.out.println("infinite while loop");
		}
}

}
