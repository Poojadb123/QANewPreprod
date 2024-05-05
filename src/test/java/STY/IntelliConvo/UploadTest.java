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
import Upload.Upload;

public class UploadTest extends BaseClass{
	//UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

	@Test (priority=1)
	public void UploadFileTest() throws InterruptedException, IOException {
		driver = initializeDriver();
		Upload cs = PageFactory.initElements(driver, Upload.class);
		//Upload cs = new Upload(driver);
		Login lg=new Login(driver);
		//Customers cs = new Customers(driver);
		Thread.sleep(20000);
		lg.signInHappyPath();
		
		cs.UploadMonoCalls();
		System.out.println("Uploaded Mono Calls");
		
		//select different files
		cs.SelectDiffDateUpload();
		System.out.println("Uploaded Calls on Different date");
		
    	String expRM = cs.sorg;
		String ActRM = cs.AddNewData();
		try {
			Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

		} catch (Exception e) {

		}
	}
	
	@Test (priority=2)
	public void EditView_Act_TC() throws InterruptedException, IOException {
		//driver = initializeDriver();
		//Login lg=new Login(driver);
		//lg.signInHappyPath();
		Upload cs = PageFactory.initElements(driver, Upload.class);
		cs.editViewAction();
	
		
	}
		@Test (priority=3)
		public void Edit_Act_TC() throws InterruptedException, IOException {
			
		Upload cs = PageFactory.initElements(driver, Upload.class);
			
		//String expUA = "Success : Input file updated successfully.";
		
		String expUA= cs.sorg;
		System.out.println(expUA);
		String ActUA = cs.editAction();
		
		
		try {
			Assert.assertTrue(expUA.equalsIgnoreCase(ActUA));

		} catch (Exception e) {

		}
		}
		
		
		//1)Login as CA-ninak@yopmail.com ,User123! 
		@Test(priority=4)
		public void AddFeedback() throws InterruptedException, IOException {
			//driver = initializeDriver();
			//Login lg=new Login(driver);
		   //lg.signInHappyPath();
	    	Upload cs = PageFactory.initElements(driver, Upload.class);
		
	        cs.AddFeedback();
		
		}
}
		
	/*@Test(priority=4)
	public void UploadMaxFile() throws InterruptedException, IOException {
	//	driver = initializeDriver();
	//	Login lg=new Login(driver);
		Thread.sleep(20000);
	//	lg.signInHappyPath();
		Upload cs = PageFactory.initElements(driver, Upload.class);
		Thread.sleep(8000);
		cs.UploadingMaximumFile();
		Thread.sleep(2000);
		cs.SelectDiffDateUpload();
	}


		
		}
		
/*		@Test (priority=4)	
		public void UploadSearchTC() throws InterruptedException {
		
			Upload om = PageFactory.initElements(driver, Upload.class);
		
			System.out.println("Search working");
			om.OrgSearch();
			Assert.assertTrue(true);
			System.out.println("Search working"); */
		
			
/*		String expDA = "Success : Upload record deleted successfully.";
		String ActDA = cs.DeleteAction();
		if(expDA.equalsIgnoreCase(ActDA))  
		  { 
			Thread.sleep(1000);
			MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(driver, "Upload record deletion passed.")).build();
			Thread.sleep(1000);
			test.pass("Upload record deletion passed.",mediaModel);
		  //System.out.println("Test passed");
		  
		   } 
		else 
		  { 
			Thread.sleep(1000);
			MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath(ScreenCap.captureScreenShot(driver, "Upload record deletion failed.")).build();
			Thread.sleep(1000);
			test.fail("Upload record deletion failed.",mediaModel);
			  //System.out.println("Test failed");
		  } */


