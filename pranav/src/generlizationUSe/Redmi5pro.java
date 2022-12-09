package generlizationUSe;

public class Redmi5pro implements Xiomi
{
	
	@Override
	public void subname() 
	{	
		System.out.println("Redmi 5 Pro ");
	}

	@Override
	public void battery() 
	{	
		System.out.println("5,000 Mah battery");
	}

	@Override
	public void ram() 
	{	
		System.out.println("4gb ram");
	}

	@Override
	public void memorySize() 
	{	
		System.out.println("64gb internal memory");
	}

}
