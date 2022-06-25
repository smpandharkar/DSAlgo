package TestDSAlgo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseClass2 implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
		try {
			TakeFailedScreenshot(result.getName());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

