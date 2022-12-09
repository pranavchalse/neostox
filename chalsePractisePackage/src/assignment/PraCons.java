package assignment;

public class PraCons 
{
	static int a;
	static int b;
	static int c;
	
	public PraCons()
	{
	    a=20;
		b=20;
		System.out.println("user defined method without para");
	}
	public PraCons (int num1)
	{
		a = num1;
		System.out.println("user defined method with one para");
	}
	public PraCons (int num1,int num2)
	{
		a = num1;
		b  = num2;
		System.out.println("user defined method with two para");
	}
	public PraCons (int num1,int num2,int num3)
	{
		a = num1;
		b = num2;
		c = num3;
		System.out.println("user defined method with three para");
	}
	
	public static void main(String[] args) 
	{
		PraCons PC = new PraCons();
		PC.add();
		PraCons PC1 = new PraCons(20);
		PC1.add();
		PraCons PC2 = new PraCons(20,20);
		PC2.add();
		PraCons PC3 = new PraCons(20,20,60);
		PC3.add();
		PraCons.par();
	}
	public void add()
	{
		int add=a+b+c;
		System.out.println("add is "+add);
	}
	public static void par()
	{
		int par=a+b+c;
		System.out.println("add is "+par);
	}
}