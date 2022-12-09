package listeners; 
 
import org.testng.ITestListener; 
import org.testng.ITestResult; 
import org.testng.Reporter; 
 
public class Listener implements ITestListener 
{ 
 	 
 	@Override 
 	public void onTestFailure(ITestResult result) 
 	{ 
 	 	Reporter.log("Test is failed please have a look again", true); 
 	 	Reporter.log("Test is failed, taken screenshot",true); 
 	} 
 	 
 	@Override 
 	public void onTestSuccess(ITestResult result) 
 	{ 
 	 	Reporter.log("Test is completed successfully", true); 
 	 	 
 	}  
 	 
 	@Override 
 	public void onTestSkipped(ITestResult result)  
 	{ 
 	 	Reporter.log("Test is skipped please retry", true); 
 
 	} 
 	 
 
} 
