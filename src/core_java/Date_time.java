package core_java;

public class Date_time {

	public static void main(String[] args) 
	
	{
		int mat[][] = {{1,2,3},{5,0,6},{7,8,9}};
		
		int min = mat[0][0];
		
		for(int i = 0; i <=2 ; i ++)
		{
			for (int j = 0; j<=2 ; j++)
			{
				if (mat[i][j] < min)
				{
					min = mat[i][j];
				}
				
			}
			
		}
		System.out.println(min);
		

	}

}
