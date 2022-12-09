package generlizationUSe;

public class GenerlizationStudy {

	public static void main(String[] args) 
	{
		Redmi5pro R5 = new Redmi5pro();
		R5.subname();
		R5.battery();
		R5.ram();
		R5.memorySize();
		System.out.println("nettwork is "+Xiomi.network);
		System.out.println("++++++++++++++++++++++++++++");
		
		Redmi6pro R6 = new Redmi6pro();
		R6.subname();
		R6.battery();
		R6.ram();
		R6.memorySize();
		R6.externalMemory();
		System.out.println("network is "+Xiomi.network);
		System.out.println("++++++++++++++++++++++++++++");
	}

}
