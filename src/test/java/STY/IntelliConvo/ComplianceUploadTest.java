package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import ComplianceUpload.ComplianceUpload;
import Login.Login;


public class ComplianceUploadTest extends BaseClass{
	//UtilityClass ScreenCap = new UtilityClass();
			WebDriver driver;

			@Test (priority=1)
			public void UploadFileTest() throws InterruptedException, IOException {
				driver = initializeDriver();
				ComplianceUpload cs = PageFactory.initElements(driver, ComplianceUpload.class);
				//Upload cs = new Upload(driver);
				Login lg=new Login(driver);
				//Customers cs = new Customers(driver);
				Thread.sleep(20000);
				lg.signInHappyPath();
		    	String expRM = cs.sorg;
				String ActRM = cs.AddNewData();
				try {
					Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));

				} catch (Exception e) {

				}
			}
			

			@Test (priority=2)
			public void Edit_Act_TC() throws InterruptedException, IOException {
				
				ComplianceUpload cs = PageFactory.initElements(driver, ComplianceUpload.class);
				
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
				
				ComplianceUpload cs = PageFactory.initElements(driver, ComplianceUpload.class);
				
				cs.editViewAction();
			}
			
			
			
			@Test (priority=4)
			public void Agent_Call_Details() throws InterruptedException, IOException {
				
				ComplianceUpload cs = PageFactory.initElements(driver, ComplianceUpload.class);
				
				cs.Agent_Call_Details();
			}
	}




