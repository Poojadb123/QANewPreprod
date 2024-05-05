package SalesDashboard;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class CreateDeal extends BaseClass {
	// public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "CreateDeal";// Read the data from excel sheet1
	Map<String, Object> customer = ref.exceldata(sheetName);

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public CreateDeal(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Create deal']")
	WebElement CreateDeal;

	@FindBy(xpath = "//h2/div/p")
	WebElement AddDealLabel;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath = "//form/div[1]/div[2]/div/p")
	WebElement CustomerReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[3]/div/p")
	WebElement AgentReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[4]/div/div/p")
	WebElement DealNameReqFieldMsg;

	@FindBy(xpath = "//form/div[1]/div[5]/div/p")
	WebElement DealStageReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[6]/div/p")
	WebElement DealStatusReqFieldMsg;
	
	@FindBy(xpath = "(//div[@id='select-agent'])")
	WebElement selectAgent;
	
	@FindBy(xpath = "//*[@id='menu-agent']/div[3]/ul/li")
	List<WebElement> Agents;
	
	@FindBy(xpath = "//input[@name='dealName']")
	WebElement DealName;

	@FindBy(xpath = "//form/div[1]/div[6]/div/p")
	WebElement DealSReqFieldMsg;
	
	@FindBy(xpath = "//div[@id='select-stage']")
	WebElement DealStage;

	@FindBy(css = "div.MuiAlert-message")
	WebElement AlertMessage;

	@FindBy(css = "#select-stage")
	WebElement Dealstage;
	
	@FindBy(css = "#select-deal")
	WebElement Dealstatus;
	
	@FindBy(xpath = "//*[@id='menu-dealStatus']/div[3]/ul/li")
	List<WebElement> Ds;
	
	@FindBy(xpath = "//*[@id='menu-dealStage']/div[3]/ul/li")
	List<WebElement> DStages;
	
   //deal
	@FindBy(xpath = "//div[text()='Deal']")
	WebElement DealTab;
	
	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement DealRecord;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[2]/button")
	WebElement ActionButton;
	
	@FindBy(xpath = "//html/body/div[2]/div[3]/ul/li[1]")
	WebElement EditDealAction;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement UpdateButton;
	
	@FindBy(xpath = "//html/body/div[2]/div[3]/ul/li[2]")
	WebElement ActionAddTask;
	
	@FindBy(xpath = "//h2/div/p")
	WebElement TaskLabel;
	
	@FindBy(xpath = "//input[@name='taskName']")
	WebElement TaskName;
	
	@FindBy(xpath = "//form/div[1]/div[4]/div/div/p")
	WebElement TaskNameReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[5]/div/p")
	WebElement TaskStatusReqFieldMsg;
	
	@FindBy(xpath = "//div/div/div/a[6]")
	WebElement TaskButton;
	
	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement TaskFirstRecord;
	
	@FindBy(xpath = "//table/tbody/tr[1]/th[4]")
	WebElement RecordTaskName;
	
	@FindBy(xpath = "//div[text()='Administration']")
	WebElement AdministrationTab;
	
	public String CreateDeal() throws InterruptedException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String scamp = (String) customer.get("SelectCampaign");
		String dname = (String) customer.get("DealName");
		String dstage = (String) customer.get("SelectDealStage");
		String ds = (String) customer.get("DealStatus");

		if (CreateDeal.isDisplayed()) {
			CreateDeal.click();
			Thread.sleep(5000);
			AddDealLabel.isDisplayed();
			System.out.println(AddDealLabel.getText());
		}
	/*	// Select Organisation
		Thread.sleep(3000);
		WebElement SOrganisation = driver.findElement(By.cssSelector("#select-organisation"));
		SOrganisation.click();
		List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-organisationId']/div[3]/ul/li"));
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
		SubmitBtn.click();
		Thread.sleep(1000);
		if(CustomerReqFieldMsg.isDisplayed()) {
			System.out.println(CustomerReqFieldMsg.getText());
		}
		
		// Select Customer
		Thread.sleep(3000);
		WebElement SCustomer = driver.findElement(By.cssSelector("#select-customer"));
		SCustomer.click();
		List<WebElement> CustomerList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
		if (SCustomer.isDisplayed()) {
			// State.click();
			int NoOfOrg = CustomerList.size();
			int i = 0;
			while (i < NoOfOrg) {
				String CList = CustomerList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (CList.contains(scus)) {
					CustomerList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}

		}
		Thread.sleep(9000);
		SubmitBtn.click();
		Thread.sleep(1000);
		if(AgentReqFieldMsg.isDisplayed()) {
			System.out.println(AgentReqFieldMsg.getText());
		}
		
		// Select Agent
				Thread.sleep(3000);
				selectAgent.click();
				Agents.get(0).click();*/
				SubmitBtn.click();
				Thread.sleep(8000); 

		//deal Name
				if(DealNameReqFieldMsg.isDisplayed()) {
				System.out.println(DealNameReqFieldMsg.getText());
				Thread.sleep(7000);
				DealName.sendKeys("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
				Thread.sleep(5000);
				if (DealNameReqFieldMsg.isDisplayed()) {
					System.out.println(DealNameReqFieldMsg.getText());
					DealName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					SubmitBtn.click();
				}
				DealName.sendKeys(dname);
				}
           //select Deal stage
				Thread.sleep(9000);
				SubmitBtn.click();
				Thread.sleep(1000);
				if(DealStageReqFieldMsg.isDisplayed()) {
					System.out.println(DealStageReqFieldMsg.getText());
					Thread.sleep(7000);
				}
			
				// Select stage
				Thread.sleep(3000);
				Dealstage.click();
				DStages.get(0).click();
				SubmitBtn.click();
				Thread.sleep(8000);
				
				//Deal Status
				if(DealStatusReqFieldMsg.isDisplayed()) {
					System.out.println(DealStatusReqFieldMsg.getText());
					Thread.sleep(7000);
				}
				
				Dealstatus.click();
				Ds.get(0).click();
				SubmitBtn.click();
				System.out.println(AlertMessage.getText());
				msg = AlertMessage.getText();

	

	return msg ;
	}
				

	public String CreateDealCheck() throws InterruptedException
	{
		String msg =null;
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		AdministrationTab.click();
		Thread.sleep(8000);
		if(DealTab.isDisplayed())
		{
			DealTab.click();
			Thread.sleep(1000);
			if(DealRecord.isDisplayed())
			{
				System.out.println("Created Deal showing in Deal Track");
				Thread.sleep(1000);
				ActionButton.click();
				Thread.sleep(1000);
				if(EditDealAction.isDisplayed()) 
				{
					Thread.sleep(1000);
					EditDealAction.click();
					Thread.sleep(1000);
					UpdateButton.click();
					AlertMessage.isDisplayed();
					msg=AlertMessage.getText();
					Thread.sleep(10000);
				}
			}
		}
		return msg;
		
	}
	
	
	public String tname = (String) customer.get("TaskName");
	
	public String AddTask() throws InterruptedException
	{
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		
		String tname = (String) customer.get("TaskName");
		String ts = (String) customer.get("TaskStatus");
		if(DealRecord.isDisplayed())
		{
			DealRecord.click();
			Thread.sleep(2000);
		ActionButton.click();
		if(ActionAddTask.isDisplayed())
		{
			Thread.sleep(1000);
			ActionAddTask.click();
			Thread.sleep(3000);
			System.out.println(TaskLabel.getText());
			Thread.sleep(1000);
			if(TaskName.isDisplayed())
			{
				TaskName.click();
				Thread.sleep(1000);
				SubmitBtn.click();
				Thread.sleep(1000);
				System.out.println(TaskNameReqFieldMsg.getText());
				Thread.sleep(1000);
				TaskName.sendKeys(tname);
			}
			
			SubmitBtn.click();
			Thread.sleep(1000);
			System.out.println(TaskStatusReqFieldMsg.getText());
			
		
			// Task Status
			Thread.sleep(3000);
			WebElement SCustomer = driver.findElement(By.cssSelector("div#select-task"));
			SCustomer.click();
			List<WebElement> CustomerList = driver.findElements(By.xpath("//*[@id='menu-taskStatus']/div[3]/ul/li"));
			if (SCustomer.isDisplayed()) {
				// State.click();
				int NoOfOrg = CustomerList.size();
				int i = 0;
				while (i < NoOfOrg) {
					String CList = CustomerList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (CList.contains(ts)) {
						CustomerList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}
			
			SubmitBtn.click();
			Thread.sleep(5000);
			if(TaskButton.isDisplayed()) {
				Thread.sleep(1000);
				TaskButton.click();
				Thread.sleep(1000);
				if(TaskFirstRecord.isDisplayed())
				{
					System.out.println(TaskFirstRecord.getText());
				}
				if(RecordTaskName.isDisplayed()) {
					msg = RecordTaskName.getText();
				}	
			}
		}
		
		}
		return msg;
	}
}



