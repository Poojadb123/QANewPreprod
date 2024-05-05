package STY.IntelliConvo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.Login;
import Organisation.Organisation;
import STY.IntelliConvo.BaseClass;


public class OrganisationTest extends BaseClass {
	// UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

	@Test(priority = 1)
	public void Add_Organisation_TC() throws InterruptedException, IOException {

		driver = initializeDriver();

		Organisation rp = PageFactory.initElements(driver, Organisation.class);
		// Organisation rp = new Organisation(driver);
		Thread.sleep(12000);
		Login lg=new Login(driver);
		lg.signInHappyPath();
		String expRM = rp.name;
		String ActRM = rp.AddNewOrganisation();
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}

	}

	
	@Test(priority = 2)
	public void OrgUpdate_TC() throws InterruptedException, IOException {
		//driver = initializeDriver();
		Organisation om = PageFactory.initElements(driver, Organisation.class);
		
		//Login lg=new Login(driver);
		//lg.signInHappyPath();
		String expOrg = om.name;
		String actOrg = om.editOrganisation();
		try {
			Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));

		} catch (Exception e) {

		}
	}
	
/*	@Test (priority=3)	
	public void OrgSearchTC() throws InterruptedException, IOException {
	//	driver = initializeDriver();
		Organisation om = PageFactory.initElements(driver, Organisation.class);
	
		System.out.println("Search working");
	//	om.signIn();
		om.OrgSearch();
		Assert.assertTrue(true);
		System.out.println("Search working");
	
	}*/
	
}


