package tp;
public class Tp5 {
	
static int num1 =200;       //static global variable 
static int num2 =100;         //static global variable
int num3=400;                 //nonstatic global variable 
public static void main(String[] args)        //main method
{
	Tp5 t = new Tp5();
	sub();
	t.add();
	t.add();
	t.mul();
}
	public void add() 
	{
		
	}//non static method 
	public static void sub()         //static method 
	{
		int e= num1-num2;
		System.out.println(e);    //print usage
	}
	public void mul()           //non static method
	{
		int a=10;
		int b=30;
		int c=a*b;
		System.out.println(c);
	}
}
