package conditionalStatement;

public class ElseIfUse {

	public static void main(String[] args) 
	{
		//if you have the multiple condtions and you have to exicute atleast one condtion
		int marks = 65;
		//n-75
		if (marks >=75)
		{
			System.out.println("distincation");
		}
		//74-65
		else if (marks >= 65)
		{
			System.out.println("first class");
		}
		//64-50
		else if (marks >=50)
		{
			System.out.println("second class");
		}
		//49-30
		else if (marks >=30)
		{
			System.out.println("pass");
		}
		//
		else
		{
			System.out.println("enter the valid number, fail");
		}

	}

}
