package testngxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups = "funds")
  public void F()
  {
	  Reporter.log("F method is running", true);
  }
  @Test(groups = "homePage")
  public void G()
  {
	  Reporter.log("G method is running", true);
  }
  @Test(groups = "funds")
  public void H()
  {
	  Reporter.log("H method is running", true);
  }
  @Test(groups = "homePage")
  public void I()
  {
	  Reporter.log("I method is running", true);
  }
  @Test(groups = "homePage")
  public void J() 
  {
  Reporter.log("J TC running", true);
  }

}
