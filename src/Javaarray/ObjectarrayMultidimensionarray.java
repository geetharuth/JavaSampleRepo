package Javaarray;

public class ObjectarrayMultidimensionarray {

	public static void main(String[] args) {
		// store login data into two dimension
		Object login[][]= new Object [5][2];//four rows(user) and two cells(pass)
		login[0][0]="Admin1";
		login[0][1]="test1";
		login[1][0]="Admin2";
		login[1][1]="test2";
		login[2][0]="Admin3";
		login[2][1]="test3";
		login[3][0]="Admin4";
		login[3][1]="test4";
		login[4][0]="Admin5";
		login[4][1]="test5";
		//print  row size
		System.out.println(login.length);
		//print cell data
		System.out.println(login[0].length);
		//print specific row cell data
		System.out.println(login[3][1]);
		System.out.println("==============");
		

		//iterate all rows
		for(int i=0;i<login.length;i++)
		{
			//iterate all cells in each row
			for(int j=0;j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
