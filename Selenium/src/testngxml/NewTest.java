package testngxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = {"homePage", "funds"})
  public void A()
  {
	  Reporter.log("A method is running", true);
  }
  @Test(groups = "funds")
  public void B()
  {
	  Reporter.log("B method is running", true);
  }
  @Test(groups = "homePage")
  public void C()
  {
	  Reporter.log("C method is running", true);
  }
  @Test(groups = "funds")
  public void D()
  {
	  Reporter.log("D method is running", true);
  }
  
  @Test(groups = "homePage")
  public void E() 
  {
  Reporter.log("E TC running", true);
  }

 
}
