package tsetngKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;
public class TimeOut {
 @Test
 public void A() 
 {
	 Reporter.log("TC A is done",true);
 }
 @Test
 public void C() 
 {
	 Reporter.log("TC C is done",true);
 }
 @Test(timeOut = 1000)
 public void B() throws InterruptedException 
 {
	 Thread.sleep(5000);
	 Reporter.log("TC B is done",true);
 }
 @Test
 public void D() 
 {
	 Reporter.log("TC D is done",true);
 }
}
