package generlizationUSe;

public class Redmi6pro implements Xiomi {

	@Override
	public void subname()
	{
		System.out.println("Redmi 6 Pro ");
	}

	@Override
	public void battery()
	{	
		System.out.println("7,000 Mah battery");
	}

	@Override
	public void ram() 
	{
		System.out.println("6gb ram");
	}

	@Override
	public void memorySize() 
	{
		System.out.println("128gb internal memory");
	}
	public void externalMemory()
	{
		System.out.println("1TB External Memory ");
	}

}
