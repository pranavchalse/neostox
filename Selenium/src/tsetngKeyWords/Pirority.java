package tsetngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pirority {
	 @Test
	 public void A() 
	 {
	 Reporter.log("TC A is done",true);
	 }
	 @Test(priority = -10)
	 public void C() 
	 {
	 Reporter.log("TC C is done",true);
	 }
	 @Test
	 public void B() 
	 {
	 Reporter.log("TC B is done",true);
	 }
	 @Test(priority = -1)
	 public void D() 
	 {
	 Reporter.log("TC D is done",true);
	 }
}
