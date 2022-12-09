package tp;

public class Tp6 {
int a;
int b;
int c;
public Tp6()
{
	a=10;
	b=20;
	c=30;
	}
public Tp6(int num1, int num2, int num3)
{
	a=num1;
	b=num2;
	c=num3;
	}
	public static void main(String[] args) 
	{
		Tp6 t = new Tp6(); 
		t.sum();
		Tp6 t6 = new Tp6(50, 30, 10);
		t6.sub();
	}
	public void sum ()
	{
		int sum =a+b+c;
		System.out.println(sum);
	}
	public void sub()
	{
		int sub = a-b-c;
		System.out.println(sub);
	}

}
