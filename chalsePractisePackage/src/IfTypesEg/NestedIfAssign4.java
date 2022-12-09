package IfTypesEg;

public class NestedIfAssign4 {

	public static void main(String[] args) 
	{
		//Please insert Card---Please enter PIN
		//if pin correct-->transaction success-->else Transaction failed Pin is incorrect
		//else -->please check your card 
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
