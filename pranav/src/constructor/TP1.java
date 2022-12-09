package constructor;

public class TP1 {

	int a;
	int b;
	int c;
	
	public TP1()
	{
		a=10;
		b=20;
		c=30;
	}
	public TP1(int num1,int num2,int num3)
	{
		a=num1;
		b=num2;
		c=num3;
	}
	public static void main(String[] args) 
	{
		TP1 t = new TP1();
		t.addtion();
		
		TP1 t1 = new TP1(30, 10, 200);
		t1.addtion();
		
	}
	public void addtion()
	{
		int sum=a+b+c;
		System.out.println("add is "+sum);
		
	}

}
