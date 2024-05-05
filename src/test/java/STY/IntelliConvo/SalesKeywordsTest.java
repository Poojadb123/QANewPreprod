package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import Login.Login;
import SalesKeywords.SalesKeywords;

public class SalesKeywordsTest extends BaseClass{
	WebDriver driver;

	@Test(priority=1)
	public void AddNew_Keyword_TC() throws InterruptedException, IOException {
		driver = initializeDriver();

		SalesKeywords cs = PageFactory.initElements(driver, SalesKeywords.class);
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
		SalesKeywords cs = PageFactory.initElements(driver, SalesKeywords.class);
		
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
	
	/*@Test(priority = 3)
	public void AddMultipleKeywords_TC() throws InterruptedException, IOException {
		//driver = initializeDriver();
		SalesKeywords cs = PageFactory.initElements(driver, SalesKeywords.class);*/
		
		//Login lg=new Login(driver);
		
		//lg.signInHappyPath();
		//Thread.sleep(20000);
	//	cs.AddMulKeywords(); 
	/*	String expOrg = cs.sorg;
		String actOrg = cs.UpdateKeyword();

		try {
			Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));

		} catch (Exception e) {

		}*/
	//}
}


