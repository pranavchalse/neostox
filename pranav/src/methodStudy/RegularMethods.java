package methodStudy;

public class RegularMethods {

	public static void main(String[] args)
{
	
		
}
	// static regular method
	public static void add()// method name
	{
	// method has name as well as body--> complete method
	int a=10;
	int b=20; //method body
	int sum=a+b;
	System.out.println("Sum is "+sum);
	}
	
	// non static regular method
	public void sub()// method name
	{
	int c=20;
	int d=10; // method body
	int subs=c-d;
	System.out.println("Substraction is "+subs);
	//complete non static regular method
	}
	
	//public static void test();// method has name but not body--> incomplete method
	public void test1()// method name
	{
	// method body
	// non static complete regular method
	}


}
