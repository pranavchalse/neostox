package inheritanceUse;

public class Child extends Mother
{

	public static void main(String[] args) 
	{
		Mother m = new Mother();
		m.money();
		Child c = new Child();
		c.son();
		c.money();
		m.experience();
		m.ajoba();
		c.experience();
		c.ajoba();	
	}
	public void son ()
	{
		System.out.println("sons shooes");
	}

}
