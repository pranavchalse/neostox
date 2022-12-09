package interfaceStudy;

public class IC_FOR_I_TO_I implements Interface12
{
	public static void main(String[] args) 
	{
		IC_FOR_I_TO_I IC1 = new IC_FOR_I_TO_I();
		IC1.sample1();
		IC1.sample2();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		IC1.sample3();
		IC1.sample4();
	}
	@Override
	public void sample1() 
	{
		System.out.println("hi,i'm sample1 form interface11");
	}
	@Override
	public void sample2() 
	{
		System.out.println("hi,i'm sample2 form interface11");	
	}
	@Override
	public void sample3() 
	{
		System.out.println("hi,i'm sample3 form interface12");
	}
	@Override
	public void sample4() 
	{
		System.out.println("hi,i'm sample4 form interface12");
	}
}
