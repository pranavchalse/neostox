package tsetngKeyWords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class DependsOn {
 @Test
 public void A() 
 {
	 Assert.fail();
	 Reporter.log("TC A is done",true);
 }
 @Test
 public void C() 
 {
	 Reporter.log("TC C is done",true);
 }
 @Test(dependsOnMethods = {"A"})
 public void B() 
 {
	 Reporter.log("TC B is done",true);
 }
 @Test
 public void D() 
 {
	 Reporter.log("TC D is done",true);
 }

}