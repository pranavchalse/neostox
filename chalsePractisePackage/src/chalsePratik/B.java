package chalsePratik;

public class B {

	public static void main(String[] args) 
	{
		A pr = new A();
		pr.sub();
		A.add();
		
		pr.div(02d, 20d);
		A.mul(100, 100);
	}
	//to call static method from same class and the syntax is "mythodname"
    //to call static method from another class and syntax is "classname.methodname" 
	
	//to call non static method from same class and the syntax is -- frist we need to create object
	//"classname objectname = new classname" after creating object, use that object
	//objectname.methodname
	//follow the same rule 
	
}
