package chalsePratik;

public class DataType {
 static int x =155;
 static int y=60;
public static void main(String[] args) 
	{
		add();
		DataType DT = new DataType();
		DT.sub();
		int a=10;
		System.out.println(a);
		System.out.println(x+y);
	}
	public static void add()
	{
		int  a = 10;
		int b =10;
		int c =a+b;
		System.out.println(c);
		System.out.println(x+y);
	}
	public void sub()
	{
		int  a = 10;
		int b =10;
		int c =a-b;
		System.out.println(c);
		System.out.println(x+y);
	}
	
	//local variable 
	//limited for single method 
	//declare inside method body
	//------------------------------
	//global variable 
	//declare inside the class but outside the method 
	//---------------------------------------------------------
	//static variable is use in static method and as well as nonstatic method 
	//non static variable is not use in static method 
	
	
	
	
	
	
	
	
	
}
