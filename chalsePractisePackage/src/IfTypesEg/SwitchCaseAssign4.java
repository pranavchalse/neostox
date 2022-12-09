package IfTypesEg;

public class SwitchCaseAssign4 {

	public static void main(String[] args) 
	{
		//if month is Jan--> This is 1st month of year
		// Dec-->This is 12th month of year
		//please enter correct month value between Jan to Dec
		String month = "jun";
		switch (month)
		{
		case "jan":
			System.out.println("This is 1st month of year");
		break;
		case "feb":
			System.out.println("This is 2nd month of year");
		break;
		case "mar":
			System.out.println("This is 3rd month of year");
		break;
		case "april":
			System.out.println("This is 4th month of year");
		break;
		case "may":
			System.out.println("This is 5th month of year");
		break;
		case "jun":
			System.out.println("This is 6th month of year");
		break;
		case "jul":
			System.out.println("This is 7th month of year");
		break;
		case "aug":
			System.out.println("This is 8th month of year");
		break;
		case "sep":
			System.out.println("This is 9th month of year");
		break;
		case "oct":
			System.out.println("This is 10th month of year");
		break;
		case "nov":
			System.out.println("This is 11th month of year");
		break;
		case "dec":
			System.out.println("This is 12 month of year");
		break;
		default:
			System.out.println("plz enter valid month");
		break;
		}
	}

}
