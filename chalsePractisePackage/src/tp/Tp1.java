package tp;

public class Tp1 {

	public static void main(String[] args)
	{
		long mobile_no= 9011973964l;
		int lan = 1;
		if (mobile_no == 9011973964l )
		{
			System.out.println("valid no,choose language");
			System.out.println("------------------------");
		if (lan == 1)
		{
			System.out.println("selected marathi(means 1)");
		}
		if (lan == 2 || lan>=2)
		{
			System.out.println("hindi");
		}
		else
		{
			System.out.println("enter valid input for language");
		}
	}
	else 
	{
		System.out.println("enter valid no");
	}
}
}
