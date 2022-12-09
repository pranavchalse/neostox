package IfTypesEg;

public class ElseIfAssign3 {

	public static void main(String[] args) 
	{
		//if month is jan---> this is 1st month;
				//else if month is jun---> this is 6th month;
				//else if month is dec---> this is 12th month;
				//else please enter correct month;
				String month= "jun";
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
