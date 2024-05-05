package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import AddCampaign.AddCampaign;
import Login.Login;


public class CampaignTest extends BaseClass {
	WebDriver driver;

	@Test (priority = 1)
	public void AddCampaign_TC() throws InterruptedException, IOException {
		driver = initializeDriver();
	
		//CustomerLogin rp = new CustomerLogin(driver);
		AddCampaign ct = PageFactory.initElements(driver, AddCampaign.class);
		Login lg=new Login(driver);
		Thread.sleep(12000);
		lg.signInHappyPath();
		
		String expRM = ct.corg;
		String ActRM =ct.AddCampaign();
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}
	}
		@Test(priority=2)
		public void Edit_Campaign_TC() throws InterruptedException, IOException {
			//driver = initializeDriver();
			AddCampaign ac = PageFactory.initElements(driver, AddCampaign.class);
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
			
			String expUser= ac.corg;;
			String actUser=ac.editCampaign();
			
			try {
				Assert.assertTrue(expUser.equalsIgnoreCase(actUser));

			} catch (Exception e) {

			}
			
		}
		

}

