package multipleInheritanceInterfaceStudy;

public interface Interface2 
{
	void m3();
	void m4();
	
	default void test()
	{
		System.out.println("i am interface 2 test method ");
	}
	static void demo()
	{
		System.out.println("i am interface 2 demo method ");
	}

}
