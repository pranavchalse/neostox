package phone;
public class Mobile 
{public static void main(String[] args) 
	{
		mobile1("samsung"); // same class,with parameter, static method 
		MobileColours MCO = new MobileColours(); MCO.colours2("white");  //same class,with parameter, non-static method
		MobileBrand.Brand();   //another class, without parameter, static method
		MobilePrice MP = new MobilePrice(); MP.price2(13000);    //another class, with parameter, non-static method 
				System.out.println("<----------//---------->");
		Mobile MN = new Mobile(); MN.mobile2(); //same class,without parameter,static method
		MobileColours.colour();//another class, without parameter, static method  
		MobileBrand MB = new MobileBrand(); MB.Brand2("INDIAN"); //another class, with parameter, non-static method
		MobilePrice.price1();  //another class, without parameter, static method
	}
	public static void mobile1 (String Name )
	{
		System.out.println("mobile name "+Name);
	}
	public void mobile2 ()
	{
		String name2; name2 = "motorola";  System.out.println("mobile name "+name2);
	}
}
