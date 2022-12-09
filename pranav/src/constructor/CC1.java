package constructor;

public class CC1 
{
	int a;
	int b;
	int c;
	String d;
	float x;
	float y;
	float z;
	int w;
	
	public  CC1()
	{
		 a =10;
		 b =20;
		 c =30;
	}
	public CC1(int num1,int num2)
	{
		a=num1;
		b=num2;
	}
	public CC1(int num1,int num2,int num3, float num10, float num20, float num30)
	{
		a=num1; x=num10;
		b=num2; y=num20;
		c=num3; z=num30;
	}
	public CC1 (String num4, int num50)
	{
		d=num4;
		w=num50;
	}
	public static void main(String[] args) 
	{
		CC1 c1 = new CC1(); 
		c1.add();
		CC1 c2 =new CC1(15,20);
		c2.sub();
		CC1 c3 = new CC1(2, 2, 2, 5f, 5f, 5f);
		c3.mul();
		CC1 c4 = new CC1("pranav", 55);
		c4.name();
		CC2Sub c5 = new CC2Sub(6,3);                // form another class
		c5.div();
		CC2Sub c6 = new CC2Sub(15,5); //from another class of cc2 but using different int value
		c6.div();
	}
	public void add()               // without parameter 
	{
		int sum = a+b+c;
		System.out.println("sum is "+sum);
	}
	public void sub()               // with parameter 
	{
		int sub = b-a;
		System.out.println("sub is "+sub);
	}
	public void mul()               // with parameter 
	{
		int mul = a*b*c;
		float multi =x*y*z;
		System.out.println("float is "+multi);
		System.out.println("multiplication is "+mul);
	}
	public void name ()               // with parameter
	{
		int name1 = w;
		String name = d;
		System.out.println("name is  "+name);
		System.out.println("w is "+name1);
	}
	
}
