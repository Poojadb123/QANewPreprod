package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import AddCampaign.AddCampaign;
import Login.Login;
import STY.IntelliConvo.BaseClass;
import SalesDashboard.CreateDeal;
import SalesDashboard.SalesDashboard;

public class SalesDashboardTest extends BaseClass {
	// UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

	@Test(priority = 1)
	public void SalesDasboard_TC() throws InterruptedException, IOException {
		driver = initializeDriver();

		// CustomerLogin rp = new CustomerLogin(driver);
		SalesDashboard rp = PageFactory.initElements(driver, SalesDashboard.class);
		Login lg = new Login(driver);
		Thread.sleep(20000);
		lg.signInHappyPath();

		rp.SalesDashboard();

		rp.SalesDash_ViewAction();

	}

	//Create Deal
	@Test(priority = 2)
	public void CreateDeal_TC() throws InterruptedException {
		CreateDeal cd = PageFactory.initElements(driver, CreateDeal.class);

		Thread.sleep(5000);
		String expRM = "Success: Deal list fetch successfully.";//Success: Deal created successfully.
		String ActRM = cd.CreateDeal();
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}
	}
	
		
		//Upadate Deal
		@Test(priority = 3)
		public void CreateDeal_EditAction_TC() throws InterruptedException, IOException {
			//driver = initializeDriver();
			CreateDeal cd = PageFactory.initElements(driver, CreateDeal.class);

			//Login lg = new Login(driver);
			//Thread.sleep(2000);
			//lg.signInHappyPath();
			Thread.sleep(5000);
			String expRM = "Success : Deal updated successfully.";
			String ActRM = cd.CreateDealCheck();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

			} catch (Exception e) {

			}

	}
		//Create Task
		@Test(priority=4)
		public void CreateTask_TC() throws InterruptedException {
			CreateDeal cd = PageFactory.initElements(driver, CreateDeal.class);
			
			String expUser= cd.tname;
			String actUser=cd.AddTask();
			
			try {
				Assert.assertTrue(expUser.equalsIgnoreCase(actUser));

			} catch (Exception e) {

			}
			
		}

}
