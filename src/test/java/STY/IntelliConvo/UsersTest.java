package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import Login.Login;
import Organisation.Organisation;
import STY.IntelliConvo.BaseClass;
import Users.Users;

public class UsersTest extends BaseClass{
	//UtilityClass ScreenCap = new UtilityClass();
		WebDriver driver;

	@Test (priority=1)
		public void Add_Users_TC() throws InterruptedException, IOException {
			
			driver = initializeDriver();
			Users rp = PageFactory.initElements(driver, Users.class);
			Login lg=new Login(driver);
			//Customers cs = new Customers(driver);
			//Success : User created successfully.
			Thread.sleep(20000);
			lg.signInHappyPath();
			rp.AddNewUser();       
	     /*	String expRM = rp.sorg;
			String ActRM = rp.AddNewUser();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

			} catch (Exception e) {

			}*/
			
			
		
		}
		
		
		@Test (priority=2)
		public void Add_AgentRole() throws InterruptedException, IOException {
			
			//driver = initializeDriver();
			Users rp = PageFactory.initElements(driver, Users.class);
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
			//rp.AddUser_AgentRole();
	     	String expRM = rp.sorg;
			String ActRM = rp.AddUser_AgentRole();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

			} catch (Exception e) {

			}

			}
		
		
		//@Test (priority=3)
		public void Add_MonoCalls() throws InterruptedException, IOException {
			
			//driver = initializeDriver();
			Users rp = PageFactory.initElements(driver, Users.class);
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
		
	     	String expRM = rp.sorg;
			String ActRM = rp.MonoCalls();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

			} catch (Exception e) {

			}

			}
		
		
		//@Test(priority=4)
		public void Edit_User_TC() throws InterruptedException, IOException {
			
			//driver = initializeDriver();
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
			Users rp = PageFactory.initElements(driver, Users.class);
			String expUser= rp.sorg;;
			String actUser=rp.editUser();
			
			try {
				Assert.assertTrue(expUser.equalsIgnoreCase(actUser));

			} catch (Exception e) {

			}
			
		}
		

		
	/*	@Test (priority=3)	
		public void UsersSearchTC() throws InterruptedException, IOException {
			driver = initializeDriver();
			Users rp = PageFactory.initElements(driver, Users.class);
		
			rp.signIn();
			rp.UsersSearch();
			//System.out.println("Search working");
			//Assert.assertTrue(true);
			//System.out.println("Search working");
		
		
	}*/
	}
		/*	String expDUser= "Success : User Deleted Successfully.";
			String actDUser=rp.DeleteUser();
			if (expDUser.equalsIgnoreCase(actDUser)) {
				Thread.sleep(1000);
				MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(driver, "User deletion passed.")).build();
				Thread.sleep(1000);
				test.pass("User deletion passed.",mediaModel);

			}
			else {
				Thread.sleep(1000);
				MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(driver, "User deletion failed.")).build();
				Thread.sleep(1000);
				test.fail("User deletion failed.",mediaModel);

			}*/
		