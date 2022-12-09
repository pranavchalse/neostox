package tsetngAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
public class Annotations1 {
 @Test
 public void validateUserID() 
 {
 Reporter.log("User ID validated ", true);
 }
 @BeforeMethod
 public void loginToUpstox()
 {
 Reporter.log("Upstox login done--> before method",true);
 }
 @AfterMethod
 public void logOutFromUpstox() 
 {
 Reporter.log("Upstox logout done--> after method",true);
 }
 @BeforeClass
 public void launchBrowser()
 {
 Reporter.log(" Browser Launched ",true);
 }
 @AfterClass
 public void closeBrowser() 
 {
 Reporter.log(" Browser closed ",true);
 }
}