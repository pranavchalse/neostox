package IfTypesEg;

public class SwitchCaseAssign4sub {

	public static void main(String[] args) 
	{
		// A-->Marks range is 90-100
		// B--> 
		// C-->
		// D-->
		
		char grade ='A';
		switch (grade)
		{
		case 'A':
			System.out.println("marks range is 90-100");
		break;
		case 'b':
			System.out.println("marks range is 80-89");
		break;
		case 'C':
			System.out.println("marks range is 70-79");
		break;
		case 'D':
			System.out.println("marks range is 60-69");
		break;
		default:
		System.out.println("fail");
		break;
		}
		
	}

}
