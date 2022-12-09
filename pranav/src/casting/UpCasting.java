package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f =new Father();
		f.home();
		f.money();
		System.out.println("+++++++++++++++++++++++++");
		
		Son s =new Son();
		s.home();
		s.money();
		s.bike();
		System.out.println("+++++++++++++++++++++++++");
		//creating object of subclass and giving reference of super class 
		
		Father f1 =new Son();
		f1.home();
		f1.money();
		//we can't call bike() using fathers references 
		
	}

}
