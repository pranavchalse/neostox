package tp;

public class Tp4 {
	int a;
	int b;
	int c;
	int p;
	public  Tp4(int num1,int num2,int num3)
	{
		a=num1;
		b=num2; 	
		c=num3;
	}
	public Tp4()
	{
		a=10;
		b=10;
		c=10;
	}
	public static void main(String[] args) 
	{
		Tp4 t =new Tp4(10, 20, 10); t.sum();
		Tp4 p =new Tp4(); p.sum();

	}
	public void sum()
	{
		p=a+b+c;
		System.out.println("sum is "+p);
	}

}
