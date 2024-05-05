package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import KeyWords.KeyWords;
import Login.Login;
import STY.IntelliConvo.BaseClass;


public class KeyWordsTest extends BaseClass {
	// UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

	@Test(priority=1)
	public void AddNew_Keyword_TC() throws InterruptedException, IOException {
		driver = initializeDriver();

		KeyWords cs = PageFactory.initElements(driver, KeyWords.class);
		// KeyWords cs = new KeyWords(driver);
		Login lg=new Login(driver);
		Thread.sleep(20000);
		lg.signInHappyPath();
		String expRM = cs.sorg;
		System.out.println(expRM);
		String ActRM = cs.AddKeywords();
		System.out.println(ActRM);
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}
	}

	@Test(priority = 2)
	public void UpdateKeywords_TC() throws InterruptedException, IOException {
		//driver = initializeDriver();
		KeyWords cs = PageFactory.initElements(driver, KeyWords.class);
		
		//Login lg=new Login(driver);
		//Thread.sleep(20000);
		//lg.signInHappyPath();
		String expOrg = cs.sorg;
		System.out.println(expOrg);
		String actOrg = cs.UpdateKeyword();
		System.out.println(actOrg);
		try {
			Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));

		} catch (Exception e) {

		}
	
	}
}

/*	@Test(priority = 3)
	public void AddMultipleKeywords_TC() throws InterruptedException, IOException {
	//	driver = initializeDriver();
		KeyWords cs = PageFactory.initElements(driver, KeyWords.class);

		cs.AddMulKeywords(); 
		
	}
	}
		
		
		
	/*	String expOrg = cs.sorg;
		String actOrg = cs.UpdateKeyword();

		try {
			Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));

		} catch (Exception e) {

		}*/
	//}
//}

	/*
	@Test(priority = 3)
	public void DeleteCustomer_TC() throws InterruptedException {

		KeyWords cs = PageFactory.initElements(driver, KeyWords.class);

		String expOrg = " Keywords deleted successfully.";
		String actOrg = cs.DeleteKeyword();

		try {
			Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));

		} catch (Exception e) {

		}
	}
}

/*
 * String expdOrg= "Keywords deleted successfully."; String
 * actdOrg=cs.DeleteKeyword(); if (expOrg.equalsIgnoreCase(actOrg)) {
 * Thread.sleep(1000); MediaEntityModelProvider mediaModel =
 * MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(
 * driver, "Keywords deletion passed")).build(); Thread.sleep(1000);
 * test.pass("Keywords deletion passed",mediaModel);
 * 
 * } else { Thread.sleep(1000); MediaEntityModelProvider mediaModel =
 * MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(
 * driver, "Keywords deletion failed!")).build(); Thread.sleep(1000);
 * test.fail("Keywords deletion failed!",mediaModel);
 * 
 * }
 */
