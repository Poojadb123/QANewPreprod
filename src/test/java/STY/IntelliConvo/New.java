package STY.IntelliConvo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class New {

		public WebDriver driver;
		static ExtentTest test;
		static ExtentReports extent;

		public New(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(xpath = "//input[@id='mui-1']")
		// input[@type='email']")
		WebElement email;

		@FindBy(xpath = "//input[@id='mui-2']")
		WebElement password;

		@FindBy(xpath = "//button[@id='mui-3']")
		WebElement logIn;

		@FindBy(xpath = "//div[@id='select-organisation']")
		WebElement selectOrg;

		@FindBy(xpath = "//div[@id='select-customer']")
		WebElement selectCustomer;

		@FindBy(xpath = "(//div[@id='select-process'])[1]")
		WebElement selectProcess;

		@FindBy(xpath = "(//div[@id='select-process'])[2]")
		WebElement selectAgent;

		@FindBy(xpath = "//body[1]/div[2]/div[3]/ul[1]/li")
		List<WebElement> orgs;

		@FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li")
		List<WebElement> customers;

		@FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li")
		List<WebElement> processes;

		@FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li")
		List<WebElement> agents;

		public void login() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			JavascriptExecutor js = (JavascriptExecutor) driver;

			Actions action = new Actions(driver);

			email.sendKeys("intelliconvo@mailinator.com");

			Thread.sleep(2000);

			password.sendKeys("User123!");

			Thread.sleep(2000);	
			logIn.click();

			Thread.sleep(1000);

			selectOrg.click();
			orgs.get(1).click();
			selectCustomer.click();
			customers.get(0).click();
			selectProcess.click();
			processes.get(0).click();
			selectAgent.click();
			agents.get(1).click();
			Thread.sleep(1000);
			action.moveToElement(selectAgent).click().perform();

		}
	}


