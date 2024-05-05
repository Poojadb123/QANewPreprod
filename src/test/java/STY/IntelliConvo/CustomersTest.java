package STY.IntelliConvo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import Customers.Customers;
import Login.Login;
import Organisation.Organisation;
import STY.IntelliConvo.BaseClass;


public class CustomersTest extends BaseClass{	
	//UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

		@Test (priority=1)
		public void Add_Customers_TC() throws InterruptedException, IOException {
			driver = initializeDriver();
		
			Customers cs = PageFactory.initElements(driver, Customers.class);
			Login lg=new Login(driver);
			//Customers cs = new Customers(driver);
			Thread.sleep(20000);
			lg.signInHappyPath();
	     	String expRM = cs.ct;
	     	System.out.println(expRM);
			String ActRM = cs.AddNewCustomer();
			try {
				Assert.assertTrue(expRM.equalsIgnoreCase(ActRM));
                                //Tatasteel              //Tatanano
			} catch (Exception e) {

			}

		}	

		
		@Test(priority = 2)
		public void Edit_Customer_TC() throws InterruptedException, IOException {
			//driver = initializeDriver();
			
			Customers cs = PageFactory.initElements(driver, Customers.class);
			Thread.sleep(20000);
			//Login lg=new Login(driver);
			//lg.signInHappyPath();
			String expOrg= cs.ct;
			String actOrg=cs.editCustomer();
			
			try {
				Assert.assertTrue(expOrg.equalsIgnoreCase(actOrg));
           //  Assert.assertTrue("TataSteel".equalsIgnoreCase("Tatanano"));
				
			} catch (Exception e) {

			}
		}
	/*	
		@Test (priority = 3)	
		public void CustomerSearchTC() throws InterruptedException, IOException {
		//	driver = initializeDriver();
			Customers om = PageFactory.initElements(driver, Customers.class);
		
			
			System.out.println("Search working");
		//	om.signIn();
			om.CustomerSearch();
			Assert.assertTrue(true);
			System.out.println("Search working");
		
					
		}
	*/
	}


