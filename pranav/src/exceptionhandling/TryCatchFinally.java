package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		String a="abc";
		try
		{
			System.out.println(a.charAt(10));
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("check index" +e);
			
		}
		finally 
		{
			System.out.println("finally block is running");
		}
		

	}

}
