package Javaloopings;

public class Reallifeexamples1 {

	public static void main(String[] args) {
		// Print "Yatzy!" If the dice number is 6:
		int dice = 1;

		while (dice <= 6) {
		  if (dice < 6) {
		    System.out.println("No Yatzy.");
		  } else {
		    System.out.println("Yatzy!");
		  }
		  dice = dice + 1;
	}
	}
}
