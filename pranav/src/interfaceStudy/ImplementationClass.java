package interfaceStudy;
public class ImplementationClass implements TestInterface {
	public static void main(String[] args)
	{
		int c =a+b;
		System.out.println("sum of interface variable is "+c);          //in interface a=90 & b=100
	System.out.println("---------------------------------------------------");
		ImplementationClass IC = new ImplementationClass();
		IC.test();
		IC.test1();
		div();
	}
	@Override
	public void test() {
		System.out.println("test incomplete method from interface class BUT complete in implementation class");
	}
	@Override
	public void test1() {
		System.out.println("test1 incomplete method from interface class BUT complete in implementation class");
	}
	public static void div ()
	{
		int c=a/b;
		System.out.println("meathod from implementation class but variable are in iterface class, so the div is "+c);
	}

}
