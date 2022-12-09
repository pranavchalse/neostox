 package accesssSpecifier;

public class Test1
{
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		System.out.println("this is private int a value" +t1.a);
		System.out.println("this is default int b value" +t1.b);
		System.out.println("this is protected int c value" +t1.c);
		System.out.println("this is public int d value" +t1.d);
		
	
		
		
		t1.add();
		t1.sub();
		t1.mul();
		t1.div();
	}
	
	private void add()
	{
		System.out.println("this is private method ");
	}
	
	void sub ()
	{
		System.out.println("this is default method ");
	}
	
	protected void mul () 
	{
		System.out.println("this is protectedd method ");
	}
	
	public void div()
	{
		System.out.println("this is public method ");
	}

}
