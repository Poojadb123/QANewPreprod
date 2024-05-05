package STY.IntelliConvo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;


import Login.Login;
import STY.IntelliConvo.BaseClass;

public class LoginTest extends BaseClass{

	 WebDriver driver;
	//UtilityClass ScreenCap = new UtilityClass();
	
	
	@Test(priority=1)
	public void loginTest() throws IOException, InterruptedException {
		driver=initializeDriver();
	
		Login l = PageFactory.initElements(driver, Login.class);
		//Login l=new Login(driver);
		Thread.sleep(8000);
		l.signInBlank();
		l.signInBlankEmailID();
		l.signInBlankPassword();
		l.signInInvalidCreds();
		l.signInInvalidEmailId();
		l.signInHappyPath();
	
		//String actualUrl="http://65.1.226.0:3007/dashboard/call";
		//String actualUrl="http://13.126.209.38/dashboard/call";
		String actualUrl=URL+"dashboard/app/call";
	
		
		
		Thread.sleep(8000);
		String expectedUrl= driver.getCurrentUrl(); 
		System.out.println("This is Expeced Url:" +expectedUrl);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println("This is Actual Url:" +actualUrl);
		
		try{
			Assert.assertTrue(expectedUrl.equalsIgnoreCase(actualUrl));
			
		}catch(Exception e) {
			
		}
		
		
	}


}



