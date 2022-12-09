package chalsePratik;

public class IfElseEg1 
{
	public static void main(String[] args) 
	{
		String month= "jan";
		if (month == "jan")
		{
			System.out.println("this is 1st month");
		}
		else if (month == "jun")
		{
			System.out.println("this is 6th month");
		}
		else if (month == "dec")
		{
			System.out.println("this is 12th month");
		}
		else
		{
			System.out.println("plz enter correct month");
		}
	}

}
