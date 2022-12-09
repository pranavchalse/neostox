package chalsePratik;          // package is predefined(language defined), chalsePranav is userdefined 
                              //keywords ---> assigining the memory location and also known as predefined/language defined
public class PranavC {           // class is collection of object  & blocks,methods, constructor, variable

	public static void main(String[] args)
	{
		//it is block of code;
		//without main method we can't write a program
		//main method is use for exicution 
		//main method 
		//regular method 
		//-----------------
//main method--->main method is use for to call others method 
		//main method is also called as function
		int rollno;      //variable decalaration
		rollno = 50;    //variable intilization
		System.out.println(rollno+" roll no is ");  // usage
		
		int age = 20;      //variable intilize + variable declaration
		System.out.println("age is "+age);     //usage
		PranavC.add();                   //classname.methodname syntax for static method 
		PranavC e = new PranavC();       //object create syntax classname objectname = new classname();
		e.sub();                         //calling syntax objecname.methodname();
	}
	//regular method 
	//a)static method 
	//b)non static method 
	//---------------------------------------------------
	//a)static regular method 
	public static void add()           //static keyword, method has name and as well as body
	{
		int a=5;                     //variable decalration + variable initailization
		int b=10;                     //variable decalration + variable initailization
		int c=a+b;
		System.out.println("add is "+c);        //usage
	}
	//non static regular method
	public void sub ()            //non static keyword is not present , method has name and as well as body
	{
		int a=5;                  //variable decalration + variable initailization
		int b=10;                  //variable decalration + variable initailization
		int c=a-b;
	
		System.out.println("sub is "+c);    //usage
	}
	
	//data types 
	//primitive data types 
	//non primitive data types 
	//--------------------
	//primitive data types (reserved keywords)
	//memory size is fix 
	//predefined/language defined 
	//byte(1)==8bits,short(2),int(4),long(8),float(4),double(8),char(2),boolean(1bit)
	//
	//boolean is conditional statement (true/false)
	//---------------------------------------
	//nonprimitive data types
	//memory size is not fix 
	//user defined 
	//variable 
	//string, array, class
	//string is a collection of alphabets numbers or special char
	
	
	
	

	
	
	
	
	
	
	
	/* variable
	 * keywords
	 * methods/function 
	 * main method
	 * regular method 
	 * static/nonstaic methods 
	 * data types 
	 * primitive data types char,int 
	 * non primitive data types string,class
	 * */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
