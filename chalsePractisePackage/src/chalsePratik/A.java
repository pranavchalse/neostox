package chalsePratik;
// 1 static method 
// 1 non static method 
// both method are zero arguments
// both method are with arguments
public class A 
{
	public static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("add is "+c);
	}
	public void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("sub is "+c);
	}
	public static void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("mul "+c);
	}
	public void div(double a,double b)
	{
		double e=a/b;
		System.out.println("div is "+e);
	}
	
	
}
