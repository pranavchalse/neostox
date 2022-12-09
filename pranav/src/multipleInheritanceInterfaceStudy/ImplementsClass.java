package multipleInheritanceInterfaceStudy;
public class ImplementsClass implements Interface1,Interface2 {
	public static void main(String[] args) 
	{	ImplementsClass icc = new ImplementsClass();
		icc.m1();
		icc.m2();
		icc.m3();
		icc.m4();
		Interface1.demo();
		Interface2.demo();
		icc.test();
	}
	@Override
	public void m3() 
	{ System.out.println("m3 from interface 2");	}
	@Override
	public void m4() 
	{ System.out.println("m4 from interface 2");	}
	@Override
	public void m1() 
	{ System.out.println("m1 from interface 1");	}
	@Override
	public void m2() 
	{ System.out.println("m2 from interface 1");	}
	@Override
	public void test() 
	{	Interface1.super.test();
		Interface2.super.test();
	}
}
