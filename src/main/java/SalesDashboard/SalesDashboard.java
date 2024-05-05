package SalesDashboard;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class SalesDashboard extends BaseClass {
	//public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "SalesDashboard";// Read the data from excel sheet1
	Map<String, Object> customer = ref.exceldata(sheetName);

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public SalesDashboard(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Email_A;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Pass_A;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Btn_A;

	@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[2]/ul/div[1]")
	WebElement DashboardTab;
	
	@FindBy(xpath = "//div[text()='Revenue Intelligence']")
	WebElement SalesDashboardTab;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath = "//div[text()='Users']")
	WebElement UsersTab;
	
	@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[3]/ul/div[3]")
	WebElement AdministrationTab;
	
	@FindBy(xpath = "//a[text()='New User']")
	WebElement NewUserBtn;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement UserFirstName;

	@FindBy(xpath = "//form/div[1]/div[5]/div/p")
	WebElement FNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement UserLastName;

	@FindBy(xpath = "//form/div[1]/div[6]/div/p")
	WebElement LNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='email']")
	WebElement UserEmail;

	@FindBy(xpath = "//form/div[1]/div[7]/div/p")
	WebElement EmailReqFieldMsg;

	@FindBy(xpath = "//input[@name='contactNumber']")
	WebElement UserContactNo;

	@FindBy(xpath = "//form/div[1]/div[8]/div/p")
	WebElement ContactReqFieldMsg;

	@FindBy(xpath = "//input[@name='employeeId']")
	WebElement UserEmployeeId;

	@FindBy(xpath = "//form/div[1]/div[9]/div/p")
	WebElement EmpidReqFieldMsg;
	
	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement CancelBtn;

	@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	WebElement UserAlertMessage;
	
	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[9]/button")
	WebElement UserAction;
	
	@FindBy(xpath = "//ul/li[2]")
	WebElement UserActionEdit;
	
	@FindBy(xpath = "//ul/li[1]")
	WebElement UserActionDisable;
	
	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;
	
	@FindBy(xpath = "//div[1]/div[5]/div/div/input")
	WebElement EditFistNameTxt;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[4]")
	WebElement UsersRecordOrg;

	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement UsersRecord;
	
	@FindBy(xpath = "(//div[@id='select-customer'])[1]")
	WebElement selectCustomer;
	
	@FindBy(xpath = "//body/div[@id='menu-customer']/div[3]/ul[1]/li")
	List<WebElement> customers;
	
	@FindBy(xpath = "//form/div/div[3]/div/div/div")
	WebElement selectCampains;
	
	@FindBy(xpath = "//*[@id='menu-campaign']/div[3]/ul/li")
	List<WebElement> campains;
	
	@FindBy(xpath = "(//div[@id='select-format'])[1]")
	WebElement selectDate;

	@FindBy(xpath = "//*[@id='menu-format']/div[3]/ul/li")
	List<WebElement> Dates;
	
	@FindBy(xpath = "(//div[@id='select-agent'])[1]")
	WebElement selectagent;
	
	@FindBy(xpath = "//body/div[@id='menu-agent']/div[3]/ul/li")
	List<WebElement> sagents;
	
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/button")
	WebElement Action;
	
	@FindBy(xpath = "//body/div[2]/div[3]/ul/li[3]")
	WebElement ViewAction;
	
	@FindBy(xpath = "//div/div[1]/h4")
	WebElement ViewActionLabel;
	
	@FindBy(xpath = "//button[text()='Approve']")
	WebElement ApproveBtn;
	
	@FindBy(xpath = "//button[text()='Reject']")
	WebElement RejectBtn;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Transcript')]")
	WebElement Transcript;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
	WebElement CrossIcon;
	
	//deal
	@FindBy(xpath = "//div/div/div[2]/div/div[1]/button[text()='Create deal']")
	WebElement CreateDeal;
	
	@FindBy(xpath = "//h2/div/p")
	WebElement AddDealLabel;
	
	@FindBy(xpath = "//div[4]/div[3]/div/div[2]/div/button")
	WebElement ProductAndPricing;
	
	@FindBy(xpath = "//div/div[4]/div[3]/div/div[3]/div/button")
	WebElement OrganisationPersonMention;
	
	@FindBy(xpath = "//div/div[4]/div[3]/div/div[4]/div/button")
	WebElement FollwUps;
	
	@FindBy(xpath = "//div/div[4]/div[3]/div/div[5]/div/button")
	WebElement BuyingIntent;
	
	@FindBy(xpath = "//div/div[2]/div/div[4]/div[3]/div/div[2]/span")
	WebElement LeadInsights;
	//div/div[1]/h4
	
	@FindBy(xpath="//div/div[2]/form/div/div[1]/div/div/div[1]")
	WebElement OrgTextBox;
	
	@FindBy(xpath="//form/div/div[1]/div/div/div[1]/div[2]/input")
	WebElement OrgTextField;
	
	@FindBy(xpath="//div/div[2]/form/div/div[2]/div/div/div[1]")
	WebElement CusTextBox;
	
	@FindBy(xpath="//form/div/div[2]/div/div/div[1]/div[2]/input")
	WebElement CusTextField;
	
	@FindBy(xpath="//div/div[2]/form/div/div[3]/div/div/div[1]")
	WebElement CampTextBox;
	
	@FindBy(xpath="//form/div/div[3]/div/div/div[1]/div[2]/input")
	WebElement CampTextField;
	
	@FindBy(xpath="//div/div[2]/form/div/div[4]/div/div/div[1]")
	WebElement DateTextBox;
	
	@FindBy(xpath="//form/div/div[4]/div/div/div[1]/div[2]/input")
	WebElement DateTextField;
	
	@FindBy(css = "div.MuiBox-root.css-0 > div.MuiBox-root.css-0 > div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(2)")
	WebElement PlayBtn;

	@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(1)")
	WebElement ReloadTab;
	
	@FindBy(xpath = "//button[contains(text(),'Revenue')]")
	WebElement RevenueTab;
	
	@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(3)")
	WebElement BackwordReloadTab;
	
	
	public void SalesDashboard() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String scamp = (String) customer.get("SelectCampaign");
		String sdate = (String) customer.get("SelectDate");
		
	
		Thread.sleep(5000);
		DashboardTab.click();
		SalesDashboardTab.click();
		Thread.sleep(5000);
		
		if (OrgTextBox.isDisplayed()) {
            Thread.sleep(15000);
            OrgTextField.sendKeys(sorg);
            //Thread.sleep(10000);
            //OrgTextBox.click();
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

            Thread.sleep(10000);

            }
		
		// Customer
		if (CusTextBox.isDisplayed()) {
            Thread.sleep(15000);
            //CusTextBox.click();
            Thread.sleep(1000);
            CusTextField.sendKeys(scus);
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            //operators lists
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

        }

		// Campaign
		
     /*   if (CampTextBox.isDisplayed()) {
            Thread.sleep(15000);
            //ProcessTextBox.click();
            CampTextField.sendKeys(scamp);
            Thread.sleep(3000);
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            //operators lists
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

        }*/

		// date
        if (DateTextBox.isDisplayed()) {
            Thread.sleep(15000);
            //AgentTextBox.click();
            DateTextField.sendKeys(sdate);
            Thread.sleep(3000);
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            //operators lists
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

        }
		
		SubmitBtn.click();
	}
		//Thread.sleep(1000);
		
		// Select Organisation
		/*Thread.sleep(3000);
		WebElement SOrganisation = driver.findElement(By.cssSelector("#select-organisation"));
		SOrganisation.click();
		List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-organisation']/div[3]/ul/li"));
		if (SOrganisation.isDisplayed()) {
			// State.click();
			int NoOfOrg = OrgList.size();
			int i = 0;
			while (i < NoOfOrg) {
				String OList = OrgList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (OList.contains(sorg)) {
					OrgList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}
		Thread.sleep(9000);
	
		// Select Customer
		Thread.sleep(3000);
		selectCustomer.click();
		customers.get(2).click();
		
		//Select Campaign
		Thread.sleep(3000);
		selectCampains.click();
		campains.get(2).click();
		
		// selectDate
		selectDate.click();
		Dates.get(2).click();
        Thread.sleep(9000);
        SubmitBtn.click();
        
       
	}*/



	public void SalesDash_ViewAction() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		if(Action.isDisplayed()) {
			Action.click();
			Thread.sleep(5000);
			if(ViewAction.isDisplayed()){
			ViewAction.click();
			Thread.sleep(9000);
			}
		}
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,180)");
		Thread.sleep(9000);
	//	ViewActionLabel.isDisplayed();
	//	System.out.println(ViewActionLabel.getText());
		
		// Thread.sleep(5000);
		// js.executeScript("window.scrollTo(0, 0)");
		/* if(ApproveBtn.isDisplayed()) {
			 ApproveBtn.click();
			 Thread.sleep(6000);
			 ApproveBtn.click();
			WebElement e = driver.findElement(By.cssSelector("div.MuiAlert-message"));
				if (e.isDisplayed()) {
					//pass
					System.out.println("Status Apporoved-Considerd As Deal");

				}
				else {
					// screenshot
					System.out.println("Status not Apporoved-Considerd As Deal");
                      }
                }
		 */
		
			 Transcript.click();
			 Thread.sleep(9000);
		/* if (PlayBtn.isDisplayed()) {
				PlayBtn.click();
				Thread.sleep(12000);
			}
		 js.executeScript("window.scrollTo(0, 0);");
			if(ReloadTab.isDisplayed()){
				ReloadTab.click();
				Thread.sleep(2000);
				System.out.println("Reload is working");
				PlayBtn.click();
			}*/
			 
			 WebDriverWait wait = new WebDriverWait(driver, 10000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wave-timeline']")));
			 if (PlayBtn.isDisplayed()) {
					PlayBtn.click();
					Thread.sleep(12000);
					PlayBtn.click();
				}
				js.executeScript("window.scrollTo(0, 0);");
				if(ReloadTab.isDisplayed()){
					ReloadTab.click();
					Thread.sleep(2000);
					System.out.println("Reload is working");
					PlayBtn.click();
					Thread.sleep(2000);
					BackwordReloadTab.click();
					Thread.sleep(7000);
					PlayBtn.click();
					Thread.sleep(7000);
					
				}
		 
			Thread.sleep(2000);
			RevenueTab.click();
		//	js.executeScript("window.scrollTo(0, 50);");
			
	
		 Thread.sleep(6000);

		 if(RejectBtn.isDisplayed()) {
			 RejectBtn.click();
			 Thread.sleep(1000);
			WebElement e = driver.findElement(By.cssSelector("div.MuiAlert-message"));
				if (e.isDisplayed()) {
					//pass
					System.out.println("Not Considerd As Deal");

				}
				else {
					// screenshot
					System.out.println("Create Deal option disable");
                      }
                }
		 Thread.sleep(6000);
		
		  if(ApproveBtn.isDisplayed()) {
		 ApproveBtn.click();
		 Thread.sleep(2000);
	/*	WebElement e = driver.findElement(By.cssSelector("div.MuiAlert-message"));
			if (e.isDisplayed()) {
				//pass
				System.out.println("Status Apporoved-Considerd As Deal");

			}
			else {
				// screenshot
				System.out.println("Status not Apporoved-Considerd As Deal");
                  }*/
            }
		 
		 	 
	}
	
}
		

		
		

	
	
	
	


