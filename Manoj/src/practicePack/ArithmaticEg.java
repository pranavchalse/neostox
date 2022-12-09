package practicePack;



public class ArithmaticEg {

	public static void main(String[] args) 
	{
		Add();
		Sub();
		
		ArithmaticEg A=new ArithmaticEg();
		A.Mul();
		A.div();

	}
	
	public static void Add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("the addtion is "+c);
	}
	public static void Sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("the substraction is "+c);
	}
	
	public void Mul()
	{
		int a=50;
		int b=50;
		int c=a*b;
		System.out.println("the mul is "+c);
	}
	public void div()
	{
		int a=50;
		int b=50;
		int c=a/b;
		System.out.println("the mul is "+c);
	}
	

}
