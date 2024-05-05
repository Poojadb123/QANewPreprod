package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends UtilityClass implements ITestListener{
	ExtentTest test;
	ExtentReports extent = ExtentReportNG.extentReportGenerator();
	//private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>(); //for the parallel exceution
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName(),"Automation tests");
		//extentTest.set(test);			//for the parallel exceution
		//ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
			WebDriver driver = null;
		//extentTest.get().log(Status.PASS, "Successful"); 	//for the parallel exceution
		test.log(Status.PASS, "Successful");
		Object testObj=result.getInstance();
		 Class clazz =result.getTestClass().getRealClass();
		 try {
			driver = (WebDriver)clazz.getDeclaredField("driver").get(testObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		test.addScreenCaptureFromPath(captureScreenShot(driver, result.getMethod().getMethodName()), result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
			 WebDriver driver = null;
		//extentTest.get().fail(result.getThrowable());			//for the parallel exceution
		test.fail(result.getThrowable());
		Object testObj=result.getInstance();
		 Class clazz =result.getTestClass().getRealClass();
		
			
				try {
					driver = (WebDriver)clazz.getDeclaredField("driver").get(testObj);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
     
		test.addScreenCaptureFromPath(captureScreenShot(driver, result.getMethod().getMethodName()), result.getMethod().getMethodName());
	
	}

	
	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		//ITestListener.super.onFinish(context);
	}
	

}
