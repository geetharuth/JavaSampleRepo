package Javaarray;

public class Multidimentionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String login[][]= {{"admin1","test1"},{"admin2","test2"},{"admin3","test3"},{"admin4","test4"}};
		
		//print row size
				System.out.println(login.length);
				//print any row cell size
				System.out.println(login[0].length);
				//print specific row cell data
				System.out.println(login[3][1]);
				System.out.println("============================");
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
