package gloANDvariable;
public class GlobalAndLocalV {
	int a=5;
	static int b=10;
	
	public static void main(String[] args) 
	{
		GlobalAndLocalV g1 = new GlobalAndLocalV(); g1.add();//creation of object
		System.out.println("the non-static global variable a is "+g1.a);
		int add = 55+g1.a;
		System.out.println("add is "+add+" (using global variable)");
		
		System.out.println("************************************************");
		
		sub();
		System.out.println("the static global variable is "+b);
		int sub = 20-b;
		System.out.println("susb is "+sub+" (using global variable)");
	}
	public void add()
	{
		a=5;
		b=5;
		
		int sum = a=55+a;//int a; a=5;
		//int b; b=10;
		//int c; c=a+b;
		//System.out.println("non static method add is " +c+"(using local variable)");
		System.out.println("hello"+sum);
	}
	public static void sub()
	{
		
		int sum = 50+b;//int a; a=10;   
		//int b; b=5;
		//int c; c=a-b;
		//System.out.println("static method sub is "+c+" (using local variable)");
		System.out.println( "hi"+sum );
	}
}
