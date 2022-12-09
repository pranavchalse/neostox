package assignment;

public class Pra 
{	//main main ctrl+space 
	//variable dec
	//variable inti
	//variable usage 
	public static void main(String[] args) 
	{
		int a;           // primitive data type + noprimitive data type //variable dec
		int b;
		int c;
		a=10;        //variable initilization
		b=5;
		c=a+b;
		System.out.println("add is "+c);            //usage    syso+ctrl+space  printing
		name();//MyMethod();
		//Classname al = new Classname();<--- for object        new is keyword 
		//objectname.methodname<-----for call non static method 
		Pra A = new Pra(); A.sub();
		// for another class---------non static----------> Classname objectname = new classname(); objectname.methodname();
		PraSub ts = new PraSub(); 
		ts.div();
		ts.chapter();
		//for another class ---------static method----->Classname.MethodName();
		PraSub.add();
		
	}
	//class
	// primitive types(language ) - 8types - byte 1,short 2,int 4,long 8,float 4f(accuracy),double 8d(precision),char 2,boolean 1bit;
	// non primitive types(user ) - String "S", class;
	//
	// 2 methods //outside the main method but inside the class
	// static method:-
	public static void name()               //static = whose value can not change
	{
		String name;//dec
		name="pranav";//ini
		System.out.println("my name is "+name );//            syso+ctrl+sapace
	}
	//non static method
	public void sub ()                   //public= acess specifier, void - return type 
	{
		float a; a=5f;
		float b; b=10f;
		float c; c=a-b;
		System.out.println(+c);
	}
	
}
