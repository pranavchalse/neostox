package chalsePratik;

public class Son1 extends Father1
{

	public static void main(String[] args) 
	{
		Father1 aa = new Son1();
		aa.home();
		aa.money();
		
	}
	public void money()
	{
		System.out.println("25000");
	}
	public void home()
	{
		System.out.println("1bhk");
	}
	public void bike()
	{
		System.out.println("bike");
	}

}
