package controlStatements;

public class SwitchCaseUse {

	public static void main(String[] args) 
	{
		String month="jan";
		switch(month)
		{
		case "jan":
		
			System.out.println("1st month");
		break;
		case "jun":
			System.out.println("6th month");
		break;
		case "dec":
			System.out.println("12th month");
		break;
		default:
			System.out.println("enter a valid month");
		break;
		}
		
		

	}

}
