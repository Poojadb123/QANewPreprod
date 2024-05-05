	package Customers;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class Customers extends BaseClass {
	// public WebDriver driver;
		UtilityClass ref = new UtilityClass();
		String sheetName = "Customer";// Read the data from excel sheet1
		 Map<String, Object> customer1 = ref.exceldata(sheetName);

		// String Email = (String) customer.get("Email");// Enter Email
		// String FileName = (String) customer.get("FileName");

		Map<String, Map<String, String>> customer = ref.getExcelAsMap(sheetName);
		int excelRows = ref.getrowCount();

	public Customers(WebDriver driver) {
		// super(driver);
				this.driver = driver;
				// PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//input[@name='email']")
	WebElement Email_A;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Pass_A;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Btn_A;

	@FindBy(xpath = "//div[contains(text(),'Administration')]")
	WebElement AdministrationTab;
	
	@FindBy(css = "#root > div > div.MuiDrawer-root.MuiDrawer-docked > div > div.MuiBox-root.css-16ueahe")
	WebElement SideBar;

	@FindBy(xpath = "//div[contains(text(),'Customer')]")
	WebElement CustomerTab;

	@FindBy(xpath = "//button[text()='New Customer']")
	WebElement AddCustomerBtn;

	@FindBy(css = "div#select-organisation")
	WebElement SelectOrganisation;

	@FindBy(xpath = "//input[@name='process[0]']")
	WebElement Process;

	@FindBy(xpath = "//div/form/div/div[4]/div/div/p")
	WebElement ProcessReqFieldMsg;

	@FindBy(xpath = "//input[@name='customerFirstName']")
	WebElement FirstName;

	@FindBy(xpath = "//div/div/div/form/div/div[5]/div/p")
	WebElement FNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='customerLastName']")
	WebElement LastName;

	@FindBy(xpath = "//div/div/div/form/div/div[6]/div/p")
	WebElement LNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='customerEmail']")
	WebElement CustomerEmail;

	@FindBy(xpath = "//div/div/div/form/div/div[7]/div/p")
	WebElement CusEmailReqFieldMsg;

	@FindBy(xpath = "//input[@name='customerMobile']")
	WebElement CustomerMobile;

	@FindBy(xpath = "//div/div/div/form/div/div[8]/div/p")
	WebElement CusMobReqFieldMsg;

	@FindBy(css = "div#select-business")
	WebElement BusinessDomain;

	@FindBy(xpath = "//div/div/div/form/div/div[4]/div/p")
	WebElement OrgStateReqFieldMsg;

	@FindBy(css = "div#select-Language")
	WebElement SelectLanuguage;

	@FindBy(xpath = "//div/div/div/form/div/div[5]/div/p")
	WebElement OrgCityReqFieldMsg;

	@FindBy(xpath = "//input[@name='OrganisationPincode']")
	WebElement OrganisationPincode;

	@FindBy(xpath = "//div/div/div/form/div/div[6]/div/p")
	WebElement OrgPinReqFieldMsg;

	@FindBy(css = "div#select-country")
	WebElement OrganisationCountry;

	@FindBy(xpath = "//div/div/div/form/div/div[7]/div/p")
	WebElement OrgCountryReqFieldMsg;

	@FindBy(xpath = "//div/form/div/div[8]/div/div")
	WebElement OrganisationAddress;

	@FindBy(xpath = "//textarea[@name='OrganisationAddress']")
	WebElement OrganisationAddressText;

	@FindBy(xpath = "//input[@name='customerOrgName']")
	WebElement CustomerOrgName;

	@FindBy(xpath = "//div/div/div/form/div/div[2]/div/p")
	WebElement CusOrgReqFieldMsg;

	@FindBy(xpath = "//div/div[9]/div/label[2]/span[1]")
	WebElement CustomAICheckbox;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement CancelBtn;

	@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	WebElement CusAlertMessage;

	// edit
	@FindBy(xpath = "//table/tbody/tr[1]/td[8]/button")
	WebElement OrgAction;

	@FindBy(xpath = "//div[3]/ul/li[1]")
	WebElement OrgActionEdit;

	@FindBy(xpath = "//div[1]/div[2]/div/div/input")
	WebElement ECustomerOrgTextField;

	@FindBy(xpath = "//ul/li[1]")
	WebElement OrgActionDisable;

	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement OrgUpdateBtn;

	@FindBy(xpath = "//div[1]/div[1]/div/div/input")
	WebElement OrgComapanyNameText;

	@FindBy(xpath = "//table/tbody/tr[1]/td[5]")
	WebElement RecordCusOrgName;

	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement UpdateOrgRecord;

	@FindBy(xpath = "//form/div[1]/div[8]/div/div/input")
	WebElement UpdateMobNo;
	// select dashboard

	@FindBy(xpath = "//div[@id='select-dashboard']")
	WebElement SelectDashboard;

	@FindBy(xpath = "//*[@id='menu-dashboardServices']/div[3]/ul/li")
	List<WebElement> SDashboard;

	// select kpi
	@FindBy(xpath = "(//div[@id='select-process'])[1]")
	WebElement SelectKPIS;

	@FindBy(xpath = "//ul[@role='listbox']/li")
	List<WebElement> SKPI;

	@FindBy(xpath = "//div/div[11]/div/label[2]/span[1]")
	WebElement CustomAIService;
	
	@FindBy(xpath = "//div/div[12]/div/label[1]/span[1]")
	WebElement AWSService;

	@FindBy(xpath = "//input[@placeholder='Search Customer']")
	WebElement CustomerSearchBar;

	@FindBy(xpath = "//div/div/table/tbody/tr[1]/th")
	WebElement RecordOrgName;

	@FindBy(xpath = "//div/table/tbody/tr[1]/td[6]")
	WebElement RecordDomainName;

	@FindBy(xpath = "//div/table/tbody/tr[1]/td[7]")
	WebElement RecordProcessName;

	@FindBy(xpath = "//div/table/tbody/tr/td[4]")
	WebElement RecordEmail;

	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[3]")
	WebElement RecordContactNumber;
	
	@FindBy(xpath = "//span[text()='Select Dashboard']")
	WebElement SelectDashArrow;

	/*public String orgname = (String) customer1.get("OrganisationName");
	public String mob = (String) customer1.get("Mobile");
	public String email = (String) customer1.get("CustomerEmail");*/
	
	public String ct = (String) customer1.get("OrganisationName");
	
	public String AddNewCustomer() throws InterruptedException, IOException {
		String msg = null;
		Thread.sleep(5000);
		SideBar.click();
		AdministrationTab.click();
		CustomerTab.click();
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String ind;
		for (int e = 1; e <excelRows +1; e++) 
		{
			
			ind = Integer.toString(e);
			
	//	String name = (String) customer.get(ind).get("OrganisationName");
	//	String orgemail = (String) customer.get(ind).get("OrgEmail");
		String fname = (String) customer.get(ind).get("FirstName");
		String lname = (String) customer.get(ind).get("LastName");
		String email = (String) customer.get(ind).get("CustomerEmail");
		//String state = (String) customer.get(ind).get("State");
		//String city = (String) customer.get(ind).get("City");
		String process = (String) customer.get(ind).get("Process");
		String lang = (String) customer.get(ind).get("SelectLanguage");
		String ct = (String) customer.get(ind).get("OrganisationName");
		String mob = (String) customer.get(ind).get("Mobile");
		String buss = (String) customer.get(ind).get("BusinessDomain");
		String coname = (String) customer.get(ind).get("CustomerOrgName");
		String service = (String) customer.get(ind).get("SelectService");
	//	String dash = (String) customer.get(ind).get("SelectDashboard");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (AddCustomerBtn.isDisplayed()) {
			Thread.sleep(3000);
			AddCustomerBtn.click();
			Thread.sleep(8000);
			// select Organisation

			WebElement SelectOrg = driver.findElement(By.cssSelector("div#select-organisation"));
			SelectOrg.click();
			List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-customerOrganisation']/div[3]/ul/li"));
			if (SelectOrg.isDisplayed()) {
			//	System.out.println(ct);
				// State.click();
				int NoOfOrg = OrgList.size();
				//System.out.println(NoOfOrg);
				int i = 0;
				while (i < NoOfOrg) {
					String OList = OrgList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (OList.contains(ct)) {
						OrgList.get(i).click();
                       
						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}
			Thread.sleep(8000); 
		}
		// select customerOrganisation
		if (CustomerOrgName.isDisplayed()) {
			CustomerOrgName.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (CusOrgReqFieldMsg.isDisplayed()) {
			System.out.println(CusOrgReqFieldMsg.getText());
			CustomerOrgName.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (CusOrgReqFieldMsg.isDisplayed()) {
			System.out.println(CusOrgReqFieldMsg.getText());
			CustomerOrgName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		CustomerOrgName.sendKeys(" a@@**&^^%%$$##");
		Thread.sleep(6000);
		if (CusOrgReqFieldMsg.isDisplayed()) {
			System.out.println(CusOrgReqFieldMsg.getText());
			CustomerOrgName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		CustomerOrgName.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (CusOrgReqFieldMsg.isDisplayed()) {
			System.out.println(CusOrgReqFieldMsg.getText());
			CustomerOrgName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerOrgName.sendKeys("11776665554444");
		if (CusOrgReqFieldMsg.isDisplayed()) {
			System.out.println(CusOrgReqFieldMsg.getText());
			CustomerOrgName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerOrgName.sendKeys(coname);
		
		
		//Select Dashboard for CallAnalysis
		SelectDashboard.click();
		Thread.sleep(2000);
		SDashboard.get(0).click();//All Dashboard
		//SDashboard.get(2).click();//Call Analysis Dashboard
		//SDashboard.get(1).click();//Sales
		 // Click somewhere outside the dropdown to close it
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ESCAPE).build().perform();
		//Thread.sleep(2000);
		//SelectDashArrow.click();
		
		//Select Dashboard for Sales
	/*	 SelectDashboard.click();
		   SDashboard.get(1).click();	
		   Thread.sleep(1000);*/

	/*		//Select Dashboard for Compliance
		SelectDashboard.click();
		SDashboard.get(2).click();	
		Thread.sleep(1000);*/

		// select lanugauage
		
	/*	Thread.sleep(3000);
		WebElement SelectLang = driver.findElement(By.cssSelector("div#select-Language"));
		SelectLang.click();
		List<WebElement> LangList = driver.findElements(By.xpath("//*[@id='menu-language']/div[3]/ul/li"));
		if (SelectLang.isDisplayed()) {
			// State.click();
			int NoOfOrg = LangList.size();
			int i = 0;
			while (i < NoOfOrg) {
				String LList = LangList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (LList.contains(lang)) {
					LangList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}

		}*/
		Thread.sleep(3000);

		// process
		if (Process.isDisplayed()) {
			Process.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		Process.sendKeys("aa");
		Thread.sleep(6000);
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Process.sendKeys("afjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		Thread.sleep(6000);
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Process.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		Process.sendKeys("11");
		if (ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
			Process.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		Process.sendKeys(process);

		// first name
		if (FirstName.isDisplayed()) {
			FirstName.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		FirstName.sendKeys("aa");
		Thread.sleep(6000);
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		FirstName.sendKeys("aajjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		Thread.sleep(6000);
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		FirstName.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		FirstName.sendKeys("11111111111");
		if (FNameReqFieldMsg.isDisplayed()) {
			System.out.println(FNameReqFieldMsg.getText());
			FirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		FirstName.sendKeys(fname);

		// Last name
		if (LastName.isDisplayed()) {
			LastName.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		LastName.sendKeys("aa");
		Thread.sleep(6000);
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		
		LastName.sendKeys("iiiijjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
		Thread.sleep(6000);
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		LastName.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		LastName.sendKeys("abc1");
		if (LNameReqFieldMsg.isDisplayed()) {
			System.out.println(LNameReqFieldMsg.getText());
			LastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		LastName.sendKeys(lname);

		// email
		if (CustomerEmail.isDisplayed()) {
			CustomerEmail.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (CusEmailReqFieldMsg.isDisplayed()) {
			System.out.println(CusEmailReqFieldMsg.getText());
			CustomerEmail.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (CusEmailReqFieldMsg.isDisplayed()) {
			System.out.println(CusEmailReqFieldMsg.getText());
			CustomerEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		CustomerEmail.sendKeys("a@@");
		Thread.sleep(6000);
		if (CusEmailReqFieldMsg.isDisplayed()) {
			System.out.println(CusEmailReqFieldMsg.getText());
			CustomerEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		CustomerEmail.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (CusEmailReqFieldMsg.isDisplayed()) {
			System.out.println(CusEmailReqFieldMsg.getText());
			CustomerEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerEmail.sendKeys("11");
		if (CusEmailReqFieldMsg.isDisplayed()) {
			System.out.println(CusEmailReqFieldMsg.getText());
			CustomerEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerEmail.sendKeys(email);

		// mobile
		if (CustomerMobile.isDisplayed()) {
			CustomerMobile.click();
			AddBtn.click();
		}
		Thread.sleep(3000);
		if (CusMobReqFieldMsg.isDisplayed()) {
			System.out.println(CusMobReqFieldMsg.getText());
			CustomerMobile.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (CusMobReqFieldMsg.isDisplayed()) {
			System.out.println(CusMobReqFieldMsg.getText());
			CustomerMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}

		CustomerMobile.sendKeys("aaaaa");
		Thread.sleep(6000);
		if (CusMobReqFieldMsg.isDisplayed()) {
			System.out.println(CusMobReqFieldMsg.getText());
			CustomerMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		CustomerMobile.sendKeys("*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (CusMobReqFieldMsg.isDisplayed()) {
			System.out.println(CusMobReqFieldMsg.getText());
			CustomerMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerMobile.sendKeys("112334455666");
		if (CusMobReqFieldMsg.isDisplayed()) {
			System.out.println(CusMobReqFieldMsg.getText());
			CustomerMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			AddBtn.click();
		}
		Thread.sleep(5000);
		CustomerMobile.sendKeys(mob); 

		// business domain
		Thread.sleep(3000);
		WebElement Selectbuss = driver.findElement(By.cssSelector("div#select-business"));
		Selectbuss.click();
		List<WebElement> BussList = driver.findElements(By.xpath("//*[@id='menu-businessDomain']/div[3]/ul/li"));
		if (Selectbuss.isDisplayed()) {
			// State.click();
			int NoOfOrg = BussList.size();
			int i = 0;
			while (i < NoOfOrg) {
				String BList = BussList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (BList.contains(buss)) {
					BussList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}

		}
		Thread.sleep(3000);
		
	
		Actions action = new Actions(driver); 

		Thread.sleep(5000);
	
		//Select KPI's
		js.executeScript("window.scrollBy(0,1000)");
		SelectKPIS.click();
		//html.sendKeys(Keys.chord(Keys.TAB));*/
		SKPI.get(0).click();
		Thread.sleep(3000);
		new Actions(driver).moveToElement(CustomerOrgName).click().perform();
		
	/*	//Select Dashboard
		SelectDashboard.click();
		SDashboard.get(0).click();	*/
		Thread.sleep(1000);
	
		//Select Service
	/*	new Actions(driver).moveToElement(CustomAIService).click().perform();
		//new Actions(driver).moveToElement(AWSService).click().perform();
		Thread.sleep(3000);*/
		
		//select Services
		
		Thread.sleep(4000);
		
		WebElement SelectService = driver.findElement(By.xpath("//div[2]/div[3]/div/div/div/form/div/div[11]/div/label["+e+"]/span[1]"));
		Thread.sleep(4000);
		//SelectService.click();
		if (!SelectService.isSelected()) {
			SelectService.click();
        } else {
            System.out.println("Checkbox already selected: " + SelectService);
        }
	
		
		// Upload logo
		//driver.findElement(By.xpath("//button[text()='Upload Logo']")).click();
		Thread.sleep(4000);
		//Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\UploadLogo1.exe");
		Thread.sleep(8000);
		
		
	    Thread.sleep(12000);
	    js.executeScript("window.scrollBy(0,850)");

		AddBtn.click();
		Thread.sleep(40000);
		driver.navigate().refresh();
		Thread.sleep(50000);
		driver.navigate().refresh();
		Thread.sleep(30000);
		
		if (UpdateOrgRecord.isDisplayed()) {
			Thread.sleep(20000);
			System.out.println(UpdateOrgRecord.getText());
			}
			if(RecordCusOrgName.isDisplayed()) {
				msg = RecordCusOrgName.getText();
			}
	/*	UpdateOrgRecord.getText(); 
		System.out.println(UpdateOrgRecord.getText());
			msg = RecordCusOrgName.getText();*/
		
		// System.out.println(CusAlertMessage.getText());
		// return msg = CusAlertMessage.getText();
		}
		return msg;  
	}
	
	
			public String editCustomer() throws InterruptedException {
				String msg1 = null;
				driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
				JavascriptExecutor js = (JavascriptExecutor) driver;

			/*	AdministrationTab.click();
				CustomerTab.click();
				driver.navigate().refresh();*/
				
				Thread.sleep(12000);
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(5000);
				//js.executeScript("window.scrollBy(2500,0)");
			//	WebElement scroll = driver.findElement(By.xpath("//div/div/div[3]/div[2]/div/div[2]"));
			  //  JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement element = driver.findElement(By.cssSelector("div > div > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-rounded.MuiPaper-elevation0.MuiCard-root.css-1ttu96n > div.css-jjtu05 > div > div.simplebar-track.simplebar-horizontal")); // Replace with your own XPath
				Actions actions = new Actions(driver);
				actions.moveToElement(element).click().perform();
				Thread.sleep(7000);
				 js.executeScript("window.scrollTo(0, 0);");
				if(OrgAction.isDisplayed()) {
					OrgAction.click();
					OrgActionEdit.click();
					Thread.sleep(8000);
					// companyName
					if (EditActionWindowTxt.isDisplayed()) {
						UpdateMobNo.click();
						UpdateMobNo.sendKeys((Keys.SHIFT), (Keys.ARROW_LEFT), (Keys.DELETE));
						UpdateMobNo.sendKeys("8");
					}
					Thread.sleep(8000);
					OrgUpdateBtn.click();
					Thread.sleep(20000);
					//driver.navigate().refresh();
					//Thread.sleep(20000);
					//driver.navigate().refresh();
					//Thread.sleep(20000);
					
					if (UpdateOrgRecord.isDisplayed()) {
						Thread.sleep(1200);
						System.out.println(UpdateOrgRecord.getText());
					}
					Thread.sleep(5000);
					if (RecordCusOrgName.isDisplayed()) {
						System.out.println(RecordCusOrgName.getText());
						msg1 = RecordCusOrgName.getText();
					}

				}

				return msg1;
			}

	
			}
		//}