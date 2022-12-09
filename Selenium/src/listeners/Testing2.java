package listeners; 
 
import org.testng.Assert; import org.testng.Reporter; import org.testng.annotations.Listeners; import org.testng.annotations.Test; 
  
@Listeners(listeners.Listener.class) 
 
public class Testing2 {  
	@Test  
	public void myTest4()  
  { 
 	  Reporter.log("Mytest4 is executing",true); 
  } 
  @Test  
  public void myTest5()  
  { 
 	  
 	  Reporter.log("Mytest5 is executing",true); 
 	  Assert.fail(); 
  } 
  @Test
  (dependsOnMethods = "myTest5")   
  public void myTest6()  
  { 
 	  Reporter.log("Mytest6 is executing",true); 
  } 
} 
