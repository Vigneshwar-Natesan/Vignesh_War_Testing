package playground;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_Sample implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed within Sucess Percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test Failed iwithin TimeOut");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Launched");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}

}
