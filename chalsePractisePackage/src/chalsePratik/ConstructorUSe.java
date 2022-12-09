package chalsePratik;

public class ConstructorUSe {
int a;
int b;
int c;

public ConstructorUSe()
	{
		a=10;
		b=20;
		c=30;
	}
public void sum()
{
	int sum = a+b+c;
	System.out.println(sum);
}

public ConstructorUSe(int a, int b, int c)
{
	System.out.println(a+b+c);
	
	}
public ConstructorUSe(int a, int b)
{
System.out.println(a+b);	
}
	public static void main(String[] args) 
	{
		ConstructorUSe CU = new ConstructorUSe();
		CU.sum();
		ConstructorUSe CU1 = new ConstructorUSe(10, 200, 30);
		CU1.sum();
		ConstructorUSe CU2 = new ConstructorUSe(20, 10);
		CU2.sum();
		
	}
	/* constructor is special method 
	 * use for to initialize variable and object
	 * name should be same as class name
	 * u can write n no. of constructors but there are different signature 
	 * outside method with in the class
	*/
	
	
}
