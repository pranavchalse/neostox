package methodStudy;

public class MethodscallingForNonStatic {

	public static void main(String[] args) 
	{
		RegularMethods minus = new RegularMethods();  minus.sub();                               // from different class
	    MethodscallingForNonStatic nm =new MethodscallingForNonStatic(); nm.name1();             // from same class
		
	}
	public void name1()
	{
		System.out.println("in this class we call non static method same class as well as another class ");
		
	}
}
