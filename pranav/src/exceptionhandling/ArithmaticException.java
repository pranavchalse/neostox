package exceptionhandling;

public class ArithmaticException {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=0;
		int c=0;
	
		try 
		{
			 c=a/b;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("we cannot divide by zero,plz check value of b");
			System.out.println(e);
		}
		System.out.println("ans is "+c);

	}

}
