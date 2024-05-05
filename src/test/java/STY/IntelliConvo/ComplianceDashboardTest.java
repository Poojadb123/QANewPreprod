package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import AddCampaign.AddCampaign;
import ComplianceDashboard.ComplianceDashboard;
import Login.Login;
import SalesDashboard.SalesDashboard;

public class ComplianceDashboardTest extends BaseClass{
	// UtilityClass ScreenCap = new UtilityClass();
		WebDriver driver;

		@Test(priority = 1)
		public void ComplianceDasboard_TC() throws InterruptedException, IOException {
			driver = initializeDriver();

			// CustomerLogin rp = new CustomerLogin(driver);
			ComplianceDashboard rp = PageFactory.initElements(driver, ComplianceDashboard.class);
			Login lg = new Login(driver);
			Thread.sleep(20000);
			lg.signInHappyPath();

			rp.ComplianceDashboardTC();
			Thread.sleep(20000);
			
			rp.AddFeedback_TC();

		}
		
		@Test(priority=2)
		public void Edit_Campaign_TC() throws InterruptedException, IOException {
			ComplianceDashboard ac = PageFactory.initElements(driver, ComplianceDashboard.class);
			
			String expUser= "Success: Opportunity Saved successfully.";
			String actUser=ac.AddGoal_TC();
			
			try {
				Assert.assertTrue(expUser.equalsIgnoreCase(actUser));

			} catch (Exception e) {

			}
			
		}
		
	/*	@Test(priority=3)
		public void ScoreCard_TC() throws InterruptedException, IOException {
			ComplianceDashboard ac = PageFactory.initElements(driver, ComplianceDashboard.class);
			
			ac.ScoreCard_TC();
			
		}*/
		
			

}
