package thisAndSuperKeyword;

public class SuperUse extends ThisUse {

	int a = 10;
	public static void main(String[] args)
	{
		SuperUse su = new SuperUse();
		su.mul();
		su.add();
		
	}
	public void mul()
	{
		int a = 20;
		System.out.println(""+a);
		System.out.println("this is global variable "+this.a);
		System.out.println("this is global variable "+super.a);
		
	}

}
