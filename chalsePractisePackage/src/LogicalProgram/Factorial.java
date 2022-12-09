package LogicalProgram;

public class Factorial {

	public static void main(String[] args)
	{
		int i, j;   //outer loop for rows  
	for(i=0; i<6; i++)   
	{   //inner loop for columns  
		for(j=0; j<=i; j++)   
	{   //prints stars   
			System.out.print("* ");   
	}   //throws the cursor in a new line after printing each line  
			System.out.println();   
	}
	}
}
