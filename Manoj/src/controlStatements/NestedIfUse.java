package controlStatements;

public class NestedIfUse {

	public static void main(String[] args) 
	{
		String cardno="4019";
		String uname= "Pranav";
		String pwrd="1234";
		
		if(cardno=="4019")
		{
			System.out.println("card is accepted, go to login ");
		
		if(uname=="Pranav")
		{
			System.out.println("uname is correct enter a pwrd");
		
			if(pwrd=="1234")
			{
				System.out.println("pwrd is correct collect your cash");
			}
			else
			{
				System.out.println("pwrd is wrong, check your pwrd");
			}
		}
		else
		{
			System.out.println("uname is incorrect,check your uname");
		}
		}
		else
		{
			System.out.println("cardno is incorrect,plz enter valid cardno");
		}
		
	}
		
}


