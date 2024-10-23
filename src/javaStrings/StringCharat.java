package javaStrings;

public class StringCharat {

	public static void main(String[] args) {
		//returns character for the given index number
		String str="i want to get job in top MNC with 20L package";
		System.out.println(str.charAt(2));
		System.out.println("-----------------------------");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			}
		System.out.println("-----------------------------");
//returns index for the given character
		String str1="i want to get job in top MNC with 20L package";
		System.out.println(str.indexOf("a"));
	}

}
