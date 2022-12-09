package variableTypes;

public class GlobalAndLocalVariable 
{
int a=90;// non static global variable
static int b=180;// static global variable

public static void main(String[] args) 
{
	//to call static method from same class
	//methodname();
	test1();                  // calling static method from same class

	//to call nonstatic method from same class--> need to create object
	GlobalAndLocalVariable glo= new GlobalAndLocalVariable();//created object o a class
	//to call non static method--> objectname.methodname();
	glo.test2();//calling non static method from same class
	System.out.println("printing non static global variable form same class "+glo.a);//calling non static global variable from same class
	
	int sum=10+glo.a;// using non static global variable of same class
	System.out.println("Sum is "+sum);
	
	System.out.println("printing static global variable form same class "+b);////calling static global variable from same class
	int sub=200-b;// using static global variable of same class
	System.out.println("Sub is "+sub);

	int addition=b+glo.a;
	System.out.println(addition);
}
public static void test1()   // static method
{
	System.out.println("hi i am static test1 method");
}
public void test2()         //non static method
{
	 //local variable
	System.out.println("hi am non-static test2 method");
}
}
