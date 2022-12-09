package neostoxPomClasses; 
 
import org.testng.ITestListener; 
import org.testng.ITestResult; 
import org.testng.Reporter; 
 
public class Listener implements ITestListener 
{ 
 	 
 	public void onTestFailure(ITestResult result) 
 	{ 
 	 	Reporter.log("Test is failed please have a look again", true); 
 	 	Reporter.log("Test is failed, taken screenshot",true); 
 	} 
 	 
 	public void onTestSuccess(ITestResult result) 
 	{ 
 	 	Reporter.log("Test is completed successfully", true); 
 	 	 
 	}  
 	 
 	public void onTestSkipped(ITestResult result)  
 	{ 
 	 	Reporter.log("Test is skipped please retry", true); 
 
 	} 
 	 
 
} 
