package conditionalStatement;

public class NestedIfUse {

	public static void main(String[] args) 
	{
		//EnterUserID-->if userID is correct then-->Enter Password
		//if Password is correct then-->the Welcome to Home Page, else incorrect Password
		//else incorrect user ID
		
		//if the condition is depend upon the other condition then go for nested if 

		String UID ="pranav";
		String PWD ="chalse";
		String mn="money";
		if (UID == "pranav")
		{
			System.out.println("UID correct, go for PWD");
				if (PWD=="chalse")
				{
					System.out.println("PWD is correct");
					if(mn=="money")
					{
						System.out.println("sting is corrct");
						
					}
					else
					{
						System.out.println("string is not correct");
					}
				}
				
				else
				{
					System.out.println("plz enter correct PWD");
				}
		}
		else
		{
			System.out.println("plz enter valid UID");
		}
	}
}
