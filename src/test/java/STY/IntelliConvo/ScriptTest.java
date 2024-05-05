package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import Login.Login;
import Script.ScriptUpdate;

public class ScriptTest extends BaseClass{
	WebDriver driver;

	@Test (priority = 1)
	public void AddScript_TC() throws InterruptedException, IOException {
		driver = initializeDriver();
	
		//CustomerLogin rp = new CustomerLogin(driver);
		ScriptUpdate ct = PageFactory.initElements(driver, ScriptUpdate.class);
		Login lg=new Login(driver);
		Thread.sleep(2000);
		lg.signInHappyPath();
	
		String expRM = ct.corg;
		String ActRM =ct.AddScript();
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}
		
	}

		@Test(priority=2)
		public void Edit_Script_TC() throws InterruptedException, IOException {
			//driver = initializeDriver();
			ScriptUpdate ac = PageFactory.initElements(driver, ScriptUpdate.class);
			
			//Login lg=new Login(driver);
			//Thread.sleep(2000);
			//lg.signInHappyPath();
			
			String expUser= ac.corg;;
			String actUser=ac.editScript();
			
			try {
				Assert.assertTrue(expUser.equalsIgnoreCase(actUser));

			} catch (Exception e) {

			}
			
		}
		
		
	}




