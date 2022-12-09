package methodStudy;

public class MethodscallingForStatic {

	public static void main(String[] args) 
	{
										  // only for static regular methods. 
		subs();                           // this is method for class in same class
		RegularMethods.add();             // this line is come from RegularMethods class,
		                                  // so this method is known as method calling from same class or different class
	}
	public static void subs ()
	{
		int a=6;
		int b=3;
		int c=a-b;
		System.out.println("sub is "+c);
	}
}
/*here,
 * in this class we call methods from the RegularMethods.
 * but we r able to call only one method i.e. add.
 * because in RegularMethods class others methods are non-static methods.*/
 