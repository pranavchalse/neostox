package nonstaticeg1;

public class Car 
{

	public static void main(String[] args) 
	{
		
		
		Car cr = new Car();                 cr.carproject();              //from same class 
		CarColour cl = new CarColour();		cl.colour();                  //from different class
		CarBrand bd = new CarBrand();       bd.brand();                   //--------//----------
		CarTyre ty = new CarTyre();         ty.tyrename();                //--------//----------
	}
	
	public void carproject()
	{
		System.out.println("the project is about car details");
	}
	
}
