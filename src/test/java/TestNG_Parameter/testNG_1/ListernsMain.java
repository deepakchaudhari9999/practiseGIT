package TestNG_Parameter.testNG_1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernsMain implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("Test Excution started");

	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Test execution success");

	}
	
	public void onFinish(ITestResult result) {

		System.out.println("Test execution finish");
	}
		
		public void onTestFailure(ITestResult result) {
			
			System.out.println("Test execution failure");
			
		}
		
		public void onTestSkipped(ITestResult result) {
			
			System.out.println("Skipped");
			
		}
		

	}



