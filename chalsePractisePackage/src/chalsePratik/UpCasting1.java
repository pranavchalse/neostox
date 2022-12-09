package chalsePratik;

public class UpCasting1 {

	public static void main(String[] args) 
	{
		Father1 abc = new Father1();
		abc.home();
		abc.money();
		System.out.println("++++++++++++++++++++++++++++++++");
		Son1 def = new Son1();
		def.home();
		def.money();
		def.bike();
        System.out.println("++++++++++++++++");
		Father1 xyz = new Son1();
		xyz.home();
		xyz.money();
		
	}

}
