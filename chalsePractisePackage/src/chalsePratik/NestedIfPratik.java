package chalsePratik;

public class NestedIfPratik 
{

	public static void main(String[] args) 
	{
	String ATM = "card";
	int pin =1234;
	
	if (ATM=="card")
	{
		System.out.println("card accepted go for pin");
	if (pin == 1234)
	{
		System.out.println("pin is correct, transaction sucess");
	}
	else 
	{
		System.out.println("enter valid pin");
	}
	}
	else
	{
		System.out.println("plz insert card");
	}
}

}
