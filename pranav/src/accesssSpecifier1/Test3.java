package accesssSpecifier1;

import accesssSpecifier.Test1;

public class Test3 extends Test1
{

	public static void main(String[] args) 
	{
		Test1 t1  = new Test1();
		t1.div();
		System.out.println("this is public global variable d "+t1.d);
		
		Test3 T3 = new Test3();
		T3.mul();
		System.out.println("global variable from "+T3.c);
		System.out.println("those o/p of another package");
	}

}
