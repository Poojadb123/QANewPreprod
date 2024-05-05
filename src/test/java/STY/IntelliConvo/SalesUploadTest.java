package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Login.Login;
import SalesUpload.SalesUpload;



public class SalesUploadTest extends BaseClass{

	//UtilityClass ScreenCap = new UtilityClass();
		WebDriver driver;

		@Test (priority=1)
		public void UploadFileTest() throws InterruptedException, IOException {
			driver = initializeDriver();
			SalesUpload cs = PageFactory.initElements(driver, SalesUpload.class);
			//Upload cs = new Upload(driver);
			Login lg=new Login(driver);
			//Customers cs = new Customers(driver);
			Thread.sleep(20000);
			lg.signInHappyPath();
			
			//select different files
		//	cs.SelectDiffDateUpload();
			
	    	String expRM = cs.sorg;
			String ActRM = cs.AddNewData();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

			} catch (Exception e) {

			}
		}
		

		@Test (priority=2)
		public void Edit_Act_TC() throws InterruptedException, IOException {
		
			SalesUpload cs = PageFactory.initElements(driver, SalesUpload.class);
			
		//String expUA = "Success : Input file updated successfully.";
		String expUA= cs.sorg;
		System.out.println(expUA);
		String ActUA = cs.editAction();
		
		
		try {
			Assert.assertTrue(expUA.equalsIgnoreCase(ActUA));

		} catch (Exception e) {

		}
		}
		
		@Test (priority=3)
		public void Edit_ViewAct_TC() throws InterruptedException, IOException {
			//driver = initializeDriver();
			SalesUpload cs = PageFactory.initElements(driver, SalesUpload.class);
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
			cs.editViewAction();
		}
}

