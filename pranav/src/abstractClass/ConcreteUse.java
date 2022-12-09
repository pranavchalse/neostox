package abstractClass;

public class ConcreteUse extends Sample 
{

	public static void main(String[] args)
	{
		ConcreteUse cu = new ConcreteUse();
		cu.sub();
		cu.add();
	}
	public void sub() 
	{
		System.out.println("this is conccrete method ");
		
	}
}
