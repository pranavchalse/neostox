package chalsePratik;

public class WithPparameter {

	public static void main(String[] args) 
	{
		WithPparameter wt = new WithPparameter();
		wt.sum();
        wt.sub(30, 50, 100, "sub is");  //variable initialization 
        mul(50f,50f);
	}
//without parameter/zero parameter(arguments)
	public void sum()                 // non static regular method 
	{
		int a=20;                     // variable declaration +variable initialization
		int b=100;                   // variable declaration +variable initialization
		int c=a+b;              
		System.out.println(c);       //usage 
	}
//with paramter (arguments)
	public void sub(int a,int b, int c,String name)    // variable declaration
	{
		int d = a-b-c;
		System.out.println(d+name);
	}
	public static void mul(float a, float b)
	{
		float c=a*b;
		System.out.println(c);
	}
}
