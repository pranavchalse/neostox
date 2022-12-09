package arraystudy;

public class MultiDiArryasEg2 {

	public static void main(String[] args) 
	{
		int num [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i =0; i<=num.length-1; i++)
		{
			for(int j =0; j<=num.length-1;j++)
			{
				System.out.print(num[i][j]+" ");
			}
		System.out.println();
		}
		
	}

}
