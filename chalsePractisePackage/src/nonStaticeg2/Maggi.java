package nonStaticeg2;
public class Maggi
{
	public static void main(String[] args) 
	{
		Maggi MP = new Maggi();                 MP.maggi();                          //from same class
		MaggiName MN= new MaggiName();          MN.name();                           //from different class
		MaggiColour MC= new MaggiColour();      MC.colour();
		MaggiIncludes MI= new MaggiIncludes();  MI.include(); //ClasssName ObjectName = new Classname(); ObjectName.methodname
		MaggiWeight MW = new MaggiWeight();     MW.weight();
		MaggiPrice MP2 = new MaggiPrice();      MP2.price();
	    end();                                              // for static method                   classname.methodname
		MaggiQuality MQ =new MaggiQuality();    MQ.quality();
	}
	public void maggi()
	{
		System.out.println("this project is about maggi details");
	}
	public static void end()
	{
		System.out.println("**maggi is danegerious to health**");
	}
}
