package listeners; 
 
import org.testng.Assert; 
import org.testng.Reporter; 
import org.testng.annotations.Listeners; 
import org.testng.annotations.Test; 
  
@Listeners(listeners.Listener.class)
public class Testing1 {   
	@Test   
	public void myTest1()  
  { 
 	  Reporter.log("Mytest1 is executing",true); 
  } 
  @Test  
  
  public void myTest2()  
  { 
 	  Reporter.log("Mytest2 is executing",true); 
 	  Assert.fail(); 
  } 
  @Test
  (dependsOnMethods = "myTest2") 
  public void myTest3()  
  { 
 	  Reporter.log("Mytest3 is executing",true); 
  } 
} 
