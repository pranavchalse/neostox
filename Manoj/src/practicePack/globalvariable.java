package practicePack;

public class globalvariable{

int a=10;

	public static void main(String[] args){
	
		globalvariable man=new globalvariable();
	man.sub();
	man.mul();
	System.out.println(man.a);
	
}
	public void sub()
	{
		int y=a;
		int x=15+a+y;
		System.out.println("sdsdds"+x);	
	}
	public void mul()
	{
		a=10;
		System.out.println(a+this.a);
	}
	
}
