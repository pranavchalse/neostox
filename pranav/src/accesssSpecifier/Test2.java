package accesssSpecifier;

public class Test2 {

	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.sub();
		t1.mul();
		t1.div();
	
	
		System.out.println("this is golbal variable b "+t1.b);
		System.out.println("this is golbal variable c "+t1.c);
		System.out.println("this is golbal variable d "+t1.d);
	}

}
