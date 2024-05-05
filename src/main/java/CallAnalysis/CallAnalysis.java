package CallAnalysis;

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

public class CallAnalysis extends BaseClass {
	// public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "CallAnalysis";// Read the data from excel sheet1
	Map<String, Object> customer = ref.exceldata(sheetName);

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public CallAnalysis(WebDriver driver) {
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

	@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[2]/ul/div[1]")
	WebElement DashboardTab;

	@FindBy(css = "div.MuiAlert-message")
	WebElement AlertMsg;

	@FindBy(xpath = "//div[text()='Call Analysis']")
	WebElement CallAnalysisTab;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//*[@id='root']/div/div[2]/div/div[1]/div/a")
	WebElement DownloadBtn;

	@FindBy(xpath = "//body/div/div/div[2]/div/div[2]/div/div[5]/div/div[1]")
	WebElement CategoryLabel;

	@FindBy(xpath = "//body/div/div/div[2]/div/div[2]/div/div[5]/div")
	WebElement UnpleasantWordChart;

	@FindBy(xpath = "//div/div[2]/div/div[3]/div/div[1]")
	WebElement ToneLabel;

	@FindBy(xpath = "//div/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div")
	WebElement ToneChart;

	@FindBy(xpath = "//div/div[2]/div/div[2]/div/div[4]/div/div[1]")
	WebElement DeadAirLabel;

	@FindBy(xpath = "//div/div/div[2]/div/div[2]/div/div[4]/div/div[2]")
	WebElement DeadAirChart;

	@FindBy(xpath = "//body/div/div/div[2]/div/div[2]/div/div[4]/div/div[1]")
	WebElement SentimentLabel;

	@FindBy(xpath = "//div[2]/div[3]/div/h2/div/div")
	WebElement SentimentCrossIcon;

	@FindBy(xpath = "//div/div[2]/form/div/div[1]/div/p")
	WebElement OrgReqFieldMsg;

	@FindBy(xpath = "//div/div[2]/form/div/div[2]/div/p")
	WebElement CusReqFieldMsg;

	@FindBy(xpath = "//div/div[2]/form/div/div[3]/div/p")
	WebElement ProReqFieldMsg;

	@FindBy(xpath = "//div/div[2]/form/div/div[4]/div/p")
	WebElement AgentReqFieldMsg;

	@FindBy(xpath = "//div/div[2]/div/div[2]/form/div/div[5]/p")
	WebElement StartDateReqFieldMsg;

	@FindBy(xpath = "//div/div[2]/div/div[2]/form/div/div[6]/p")
	WebElement EndDateReqFieldMsg;

	@FindBy(xpath = "(//div[@id='select-process'])[2]")
	WebElement selectAgent;

	@FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li")
	List<WebElement> agents;

	@FindBy(xpath = "(//div[@id='select-customer'])")
	WebElement selectCustomer;

	@FindBy(xpath = "//body/div[@id='menu-customer']/div[3]/ul[1]/li")
	List<WebElement> customers;

	@FindBy(xpath = "(//div[@id='select-process'])[1]")
	WebElement selectProcess;

	@FindBy(xpath = "//body/div[@id='menu-process']/div[3]/ul[1]/li")
	List<WebElement> processes;

	@FindBy(xpath = "(//div[@id='select-agent'])[1]")
	WebElement selectagent;

	@FindBy(xpath = "//body/div[@id='menu-agent']/div[3]/ul/li")
	List<WebElement> sagents;

	@FindBy(xpath = "//div/div[2]/div/div[2]/form/div/div[6]/p")
	WebElement StartdateReqFieldMsg;

	// download
	@FindBy(xpath = "//div/div[5]/div/div[1]/button")
	WebElement CattegoryDownBtn;

	@FindBy(xpath = "//div/div[3]/div/div[1]/button")
	WebElement ToneDownBtn;

	@FindBy(xpath = "//div/div[4]/div/div[1]/button")
	WebElement DeadAirDownBtn;

	@FindBy(xpath = "//div/div[4]/div/div[1]/button")
	WebElement SentimentDownBtn;

	@FindBy(css = "#root > div > div.css-1q9w6eg > div > div:nth-child(2) > div > div:nth-child(5) > div > div.recharts-responsive-container > div > svg > g.recharts-layer.recharts-bar > g.recharts-layer.recharts-bar-rectangles > g")
	List<WebElement> CategoryGraph;

	@FindBy(xpath = "//body/div/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div")
	WebElement Graph;

	@FindBy(xpath = "//div/table/tbody/tr[1]/td[3]/a/p")
	WebElement ViewLink;

	@FindBy(xpath = "//body/div[2]/div[3]/div/h2")
	WebElement UnpleasantDataDetails;

	@FindBy(xpath = "//div[2]/div[3]/div/h2")
	WebElement ToneDataDetails;

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/div/div[1]/table/tbody/tr[1]")
	WebElement AgentRecord;

	@FindBy(css = "#root > div > div.css-1q9w6eg > div > div:nth-child(2) > div > div:nth-child(3) > div > div.recharts-responsive-container > div > svg > g:nth-child(7) > g.recharts-layer.recharts-bar-rectangles > g > g")
	List<WebElement>ToneTable;

	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div/div/table/tbody/tr")
	WebElement ToneAgentRecord;

	@FindBy(xpath = "//a[text()='Download']")
	WebElement DownloadButton;

	@FindBy(css = "div > div:nth-child(6) > div.react-datepicker-wrapper > div > div > svg > path")
	WebElement StartDate;

	@FindBy(css = "div > div.css-1q9w6eg > div > div:nth-child(2) > form > div > div:nth-child(7) > div > div > div > input")
	WebElement EndDate;

	@FindBy(xpath = "//body/div[@id='menu-agent']/div[3]/ul/li[1]")
	WebElement SelectAllAgent;

	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
	WebElement CrossIcon;

	@FindBy(css = "g[seriesName='Negative']")
	WebElement NegativeSentiment;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div")
	WebElement NegativeSentimentLabel;

	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
	WebElement SentimentDownloadBtn;

	@FindBy(xpath = "//div[2]/div/div[2]/form/div/div[1]/div/div/div[1]") 
	WebElement OrgTextBox;

	@FindBy(xpath = "//form/div/div[1]/div/div/div[1]/div[2]/input")
	WebElement OrgTextField;
	
	@FindBy(xpath = "//div[2]/div/div[2]/form/div/div[1]/div/div") 
	WebElement OrgText;

	@FindBy(xpath = "//div[2]/div/div[2]/form/div/div[2]/div/div/div[1]")
	WebElement CusTextBox;

	@FindBy(xpath = "//form/div/div[2]/div/div/div/div[1]/div[2]/input")
	WebElement CusTextField;

	@FindBy(xpath = "//div[2]/div/div[2]/form/div/div[3]/div/div/div[1]")
	WebElement ProcessTextBox;

	@FindBy(xpath = "//form/div/div[3]/div/div/div[1]/div[2]/input")
	WebElement ProcessTextField;

	@FindBy(xpath = "//div[2]/div/div[2]/form/div/div[4]/div/div/div[1]")
	WebElement AgentTextBox;

	@FindBy(xpath = "//form/div/div[4]/div/div/div[1]/div[2]/input")
	WebElement AgentTextField;

	@FindBy(xpath = "//table/tbody/tr[1]/td[4]/a/p")
	WebElement ViewRecord;
	
	@FindBy(xpath = "//div/div/div[1]/div[1]/div/button")
	WebElement BackButton;
	
	@FindBy(xpath = "//div/div[2]/div/div[2]/div/button[2]")
	WebElement CustomeTab;
	
	@FindBy(xpath = "//div/div[2]/div/div[2]/div/button[1]")
	WebElement AgentTab;
	
	public void CallAnalysisDashboard() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String srole = (String) customer.get("SelectRole");
		String sprocess = (String) customer.get("SelectProcess");
		String scate = (String) customer.get("SelectAgent");
		String kw = (String) customer.get("Keywords");
		String eone = (String) customer.get("EnddDate");
		String sone = (String) customer.get("StarttDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);

	
		Thread.sleep(5000);
		DashboardTab.click();
		CallAnalysisTab.click();
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

		// Process
		
        if (ProcessTextBox.isDisplayed()) {
            Thread.sleep(15000);
            //ProcessTextBox.click();
            ProcessTextField.sendKeys(sprocess);
            Thread.sleep(3000);
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            //operators lists
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

        }

		// Agent
        if (AgentTextBox.isDisplayed()) {
            Thread.sleep(15000);
            //AgentTextBox.click();
            AgentTextField.sendKeys(scate);
            Thread.sleep(3000);
            Thread.sleep(15000);
            Actions act = new Actions(driver);
            //operators lists
            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

        }
		
		//	SubmitBtn.click();
		

		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,100)");
		// start date
		WebElement StartDate = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
		StartDate.click();
		//WebElement arrow = driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
	//	arrow.click();
		List<WebElement> StartDateList = driver
				.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		if (StartDate.isDisplayed()) {
			// State.click();
			int NoOfDate = StartDateList.size();
			int i = 0;
			while (i < NoOfDate) {
				String DList = StartDateList.get(i).getText();
				System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.equalsIgnoreCase(sone)) {
					StartDateList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
				// System.out.println(sone);

			}
		}

		Thread.sleep(9000);
	
		//js.executeScript("window.scrollBy(0,40)");
		// End date
		WebElement EndDate = driver.findElement(By.xpath("//input[@placeholder='End date']"));
		EndDate.click();
		Thread.sleep(1000);
		List<WebElement> EndDateList = driver.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		if (EndDate.isDisplayed()) {
			// State.click();
			int NoOfDate = EndDateList.size();
			int j = 0;
			while (j < NoOfDate) {
				String DList = EndDateList.get(j).getText();
				 System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.equalsIgnoreCase(eone)) {
					EndDateList.get(j).click();

					Thread.sleep(5000);
					break;
				}
				j++;
			}
		}

		Thread.sleep(12000);
		SubmitBtn.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(8000);
	/*	if (UnpleasantWordChartlabel.isDisplayed()) {
			System.out.println(UnpleasantWordChartlabel.getText());
			Thread.sleep(3000);
			System.out.println(UnpleasantWordChart.getText());
			// Unpleasant download Chart
			try {
				UnpleasantDownBtn.isDisplayed();
				UnpleasantDownBtn.click();
				Thread.sleep(4000);
				System.out.println("Unpleasant file download is working");
				Thread.sleep(5000);
			}

			catch (Exception e) {
				System.out.println("Unpleasant file download is not working");
				Thread.sleep(5000);
			}

		}

		// table
		Thread.sleep(3000);
		//Graph.click();
		
		unpleasantGraph.get(0).click();
		//action.moveToElement(Graph).click().perform();
		Thread.sleep(3000);
		
		System.out.println(UnpleasantDataDetails.getText());
		Thread.sleep(2000);
		
		if (AgentRecord.isDisplayed()) {
			System.out.println(AgentRecord.getText());
		}
		
		//redirection of uploaded file
	/*	 if(ViewLink.isDisplayed()) 
		 { 
		 ViewLink.click();
		 }*/
		/* if (CrossIcon.isDisplayed())
		  {
			CrossIcon.click();
		  }
		Thread.sleep(10000);
		// js.executeScript("window.scrollBy(0,350)", "");*/
		//Customer Tab
		CustomeTab.click();
		Thread.sleep(8000);
		AgentTab.click();
		
		Thread.sleep(8000);
		
		// Tone
		if (ToneDownBtn.isDisplayed()) {
			ToneDownBtn.click();
			Thread.sleep(1000);
			System.out.println("Tone file downloaded");
			Thread.sleep(1000);
			
			
		}
		if (ToneLabel.isDisplayed()) {
			System.out.println(ToneLabel.getText());
			Thread.sleep(8000);
			System.out.println(ToneChart.getText());
			System.out.println("Tone Chart is working.");

			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(5000);
			// table
			ToneTable.get(0).click();
			
			Thread.sleep(5000);
			
			//category
			if (CategoryLabel.isDisplayed()) {
			System.out.println(CategoryLabel.getText());
			Thread.sleep(3000);
			System.out.println(UnpleasantWordChart.getText());
			// Unpleasant download Chart
			try {
				CattegoryDownBtn.isDisplayed();
				CattegoryDownBtn.click();
				Thread.sleep(4000);
				System.out.println("Category download is working");
				Thread.sleep(5000);
			}

			catch (Exception e) {
				System.out.println("Category download is not working");
				Thread.sleep(5000);
			}

		}

		// table
		Thread.sleep(3000);
		//Graph.click();
		
		CategoryGraph.get(0).click();
		//action.moveToElement(Graph).click().perform();
		Thread.sleep(3000);
		
		System.out.println(UnpleasantDataDetails.getText());
		Thread.sleep(2000);
		
		if (AgentRecord.isDisplayed()) {
			System.out.println(AgentRecord.getText());
		}
			/*if (ToneDataDetails.isDisplayed()) {
				System.out.println(ToneDataDetails.getText());
				
			}
			Thread.sleep(3000);
			if (ToneAgentRecord.isDisplayed()) {
				System.out.println(ToneAgentRecord.getText());
			}*/
			//ViewRecord.click();
			//Thread.sleep(1000);
			//BackButton.click();
			//CrossIcon.click();
			
			CrossIcon.click();
			Thread.sleep(6000);

			js.executeScript("window.scrollBy(0,250)");
			//sentiment graph
			Thread.sleep(6000);
		/*	if (SentimentLabel.isDisplayed()) {
				System.out.println(SentimentLabel.getText());
				Thread.sleep(6000);
				if (SentimentDownBtn.isDisplayed()) {
					SentimentDownBtn.click();
					System.out.println("Sentiment file downloaded");
					Thread.sleep(4000);
					NegativeSentiment.click(); //
					Thread.sleep(6000);
					System.out.println(NegativeSentimentLabel.getText());
					Thread.sleep(6000);
					SentimentCrossIcon.click();
				}
			}*/
			
			// Main download btn
			js.executeScript("window.scrollTo(250, -document.body.scrollHeight);");
			if (DownloadButton.isDisplayed()) {
				DownloadButton.click();
				Thread.sleep(2000);
			}

			Thread.sleep(6000);
			driver.navigate().refresh();
		}
	}

	// verify that selecting multiple Agents
	public void SeletingMultipleAgents() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String srole = (String) customer.get("SelectRole");
		String sprocess = (String) customer.get("SelectProcess");
		String scate = (String) customer.get("SelectAgent");
		String kw = (String) customer.get("Keywords");
		String eone = (String) customer.get("EnddDate");
		String sone = (String) customer.get("StarttDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Select Organisation
		Thread.sleep(3000);
		WebElement SOrganisation = driver.findElement(By.cssSelector("#select-organisation"));
		SOrganisation.click();
		List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
		customers.get(0).click();
		Thread.sleep(8000);

		// selectProcess
		selectProcess.click();
		processes.get(0).click();

		Thread.sleep(9000);
		Actions action = new Actions(driver);
		// select agent
		selectagent.click();
		Thread.sleep(1000);
		// sagents.get(0).click();//SelectAll[0]
		SelectAllAgent.click(); //
		Thread.sleep(5000);
		action.moveToElement(selectagent).click().perform();

		// Thread.sleep(9000);
		/*
		 * SubmitBtn.click(); Thread.sleep(1000); if(AlertMsg.isDisplayed()) {
		 * System.out.println(AlertMsg.getText()); }
		 * if(StartdateReqFieldMsg.isDisplayed()) {
		 * System.out.println(StartdateReqFieldMsg.getText()); }
		 */
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,100)");
		// start date
		// WebElement StartDate = driver.findElement(By.cssSelector("div >
		// div:nth-child(6) > div.react-datepicker-wrapper > div > div > svg > path"));
		// StartDate
		action.moveToElement(StartDate).doubleClick().perform();
		WebElement arrow = driver
				.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
		arrow.click();
		Thread.sleep(1000);
		List<WebElement> StartDateList = driver
				.findElements(By.xpath("//div/div[6]/div[2]/div/div/div/div/div/div/div[@aria-disabled='false']"));
		WebElement Slabel = driver.findElement(By.cssSelector("div.react-datepicker__current-month"));
		if (Slabel.isDisplayed()) {
			// State.click();
			int NoOfDate = StartDateList.size();
			int j = 0;
			while (j < NoOfDate) {
				String DList = StartDateList.get(j).getText();
				// System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.contains(sone)) {
					StartDateList.get(j).click();

					Thread.sleep(5000);
					break;
				}
				j++;
			}
		}

		Thread.sleep(9000);
		// SubmitBtn.click();
		// Thread.sleep(1000);
		/*
		 * if(AlertMsg.isDisplayed()) { System.out.println(AlertMsg.getText()); }
		 * if(EndDateReqFieldMsg.isDisplayed()) {
		 * System.out.println(EndDateReqFieldMsg.getText()); }
		 */

		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,40)");
		// End date
		// WebElement EndDate = driver.findElement(By.cssSelector("div > div.css-1q9w6eg
		// > div > div:nth-child(2) > form > div > div:nth-child(7) > div > div > div >
		// input"));
		// EndDate.click();
		// WebElement arrow
		// =driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
		// arrow.click();
		action.moveToElement(EndDate).doubleClick().perform();
		Thread.sleep(1000);
		List<WebElement> EndDateList = driver
				.findElements(By.xpath("//div/div[7]/div[2]/div/div/div/div/div/div/div[@aria-disabled='false']"));
		WebElement Elabel = driver.findElement(By.cssSelector("div.react-datepicker__current-month"));
		if (Elabel.isDisplayed()) {
			// State.click();
			int NoOfDate = EndDateList.size();
			int j = 0;
			while (j < NoOfDate) {
				String DList = EndDateList.get(j).getText();
				// System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.contains(eone)) {
					EndDateList.get(j).click();

					Thread.sleep(5000);
					break;
				}
				j++;
			}
		}

		Thread.sleep(12000);
		// js.executeScript("window.scrollBy(0,50)");
		SubmitBtn.click();
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(8000);
	/*	if (UnpleasantWordChartlabel.isDisplayed()) {
			System.out.println(UnpleasantWordChartlabel.getText());
			Thread.sleep(3000);
			System.out.println(UnpleasantWordChart.getText());
			// Unpleasant download Chart
			if (UnpleasantDownBtn.isDisplayed()) {
				UnpleasantDownBtn.click();
				Thread.sleep(1000);
				System.out.println("Unpleasant words file downloaded");
			}
			System.out.println("Unpleasant Chart is working.");
		}

		// table
		Thread.sleep(3000);
		Graph.click();
		unpleasantGraph.get(0).click();
		action.moveToElement(Graph).click().perform();
		Thread.sleep(3000);
		if (UnpleasantDataDetails.isDisplayed()) {
			System.out.println(UnpleasantDataDetails.getText());
		}
		if (AgentRecord.isDisplayed()) {
			System.out.println(AgentRecord.getText());
		}
*/
		if (CrossIcon.isDisplayed()) {
			;
			CrossIcon.click();
		}
		Thread.sleep(10000);
		// js.executeScript("window.scrollBy(0,350)", "");
		// Tone
		if (ToneDownBtn.isDisplayed()) {
			ToneDownBtn.click();
			Thread.sleep(1000);
			System.out.println("Tone file downloaded");
		}
		if (ToneLabel.isDisplayed()) {
			System.out.println(ToneLabel.getText());
			Thread.sleep(8000);
			System.out.println(ToneChart.getText());
			System.out.println("Tone Chart is working.");
		}

		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		// table
		ToneTable.get(0).click();
		if (ToneDataDetails.isDisplayed()) {
			System.out.println(ToneDataDetails.getText());
		}
		Thread.sleep(3000);
		if (ToneAgentRecord.isDisplayed()) {
			System.out.println(ToneAgentRecord.getText());
		}
		CrossIcon.click();
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,250)");
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		if (DeadAirLabel.isDisplayed()) {
			System.out.println(DeadAirLabel.getText());
			Thread.sleep(6000);
			System.out.println(DeadAirChart.getText());
			Thread.sleep(7000);
			if (DeadAirDownBtn.isDisplayed()) {
				DeadAirDownBtn.click();
				Thread.sleep(3000);
				System.out.println("Dead Air file downloaded");
			}
			System.out.println("Dead Air Chart is working.");
		}

		Thread.sleep(6000);
		if (SentimentLabel.isDisplayed()) {
			System.out.println(SentimentLabel.getText());
			Thread.sleep(6000);
			if (SentimentDownBtn.isDisplayed()) {
				SentimentDownBtn.click();
				System.out.println("Sentiment file downloaded");
				Thread.sleep(4000);
				NegativeSentiment.click();
				Thread.sleep(6000);
			//	System.out.println(SentimentChart.getText());
				System.out.println("Sentiment Chart is working.");
				SentimentDownloadBtn.click();
			}
		}
		js.executeScript("window.scrollBy(0,-780)");
		Thread.sleep(12000);
		if (DownloadBtn.isDisplayed()) {
			DownloadBtn.click();
			System.out.println("Download functionality is working");
			Thread.sleep(5000);
		}
		// Main download btn
		js.executeScript("window.scrollTo(250, -document.body.scrollHeight);");
		if (DownloadButton.isDisplayed()) {
			DownloadButton.click();
			Thread.sleep(2000);
		}
	}

	// verify that selecting different date

	public void CallAnalysisDiffDate() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String srole = (String) customer.get("SelectRole");
		String sprocess = (String) customer.get("SelectProcess");
		String scate = (String) customer.get("SelectAgent");
		String kw = (String) customer.get("Keywords");
		String eone = (String) customer.get("DiffEndDate");
		String sone = (String) customer.get("DiffStarttDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Not entering any data & click on submit button
		// DashboardTab.click();
		// CallAnalysisTab.click();
		// Thread.sleep(5000);
		SubmitBtn.click();
		Thread.sleep(1000);

		// SubmitBtn.click();
		/*
		 * Thread.sleep(1000); if(AlertMsg.isDisplayed()) {
		 * System.out.println(AlertMsg.getText()); }
		 */
		if (OrgReqFieldMsg.isDisplayed()) {
			System.out.println(OrgReqFieldMsg.getText());
		}

		// Select Organisation
		Thread.sleep(3000);
		WebElement SOrganisation = driver.findElement(By.cssSelector("#select-organisation"));
		SOrganisation.click();
		List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
		/*
		 * if(AlertMsg.isDisplayed()) { System.out.println(AlertMsg.getText()); }
		 */
		if (CusReqFieldMsg.isDisplayed()) {
			System.out.println(CusReqFieldMsg.getText());
		}
		// Select Customer
		Thread.sleep(3000);
		selectCustomer.click();
		customers.get(0).click();

		Thread.sleep(8000);

		/*
		 * SubmitBtn.click(); if(ProReqFieldMsg.isDisplayed()) {
		 * System.out.println(ProReqFieldMsg.getText()); }
		 */
		// selectProcess

		selectProcess.click();
		processes.get(0).click();

		Thread.sleep(9000);
		SubmitBtn.click();
		Thread.sleep(1000);
		/*
		 * if(AlertMsg.isDisplayed()) { System.out.println(AlertMsg.getText()); }
		 */
		if (AgentReqFieldMsg.isDisplayed()) {
			System.out.println(AgentReqFieldMsg.getText());
		}

		Actions action = new Actions(driver);

		selectagent.click();
		sagents.get(0).click();
		Thread.sleep(5000);
		action.moveToElement(selectagent).click().perform();

		Thread.sleep(9000);
		SubmitBtn.click();
		Thread.sleep(1000);
		/*
		 * if(AlertMsg.isDisplayed()) { System.out.println(AlertMsg.getText()); }
		 */
		if (StartdateReqFieldMsg.isDisplayed()) {
			System.out.println(StartdateReqFieldMsg.getText());
		}
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,100)");

		// start date
		WebElement StartDate = driver.findElement(By.xpath("//input[@id='datepicker']"));
		StartDate.click();
		// WebElement previousarrow
		// =driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
		// previousarrow.click();
		// List<WebElement> StartDateList =
		// driver.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		List<WebElement> StartDateList = driver.findElements(
				By.xpath("//div/div[6]/div[2]/div[2]/div/div/div[2]/div/div/div[@aria-disabled='false']"));
		if (StartDate.isDisplayed()) {
			// State.click();
			int NoOfDate = StartDateList.size();
			int i = 0;
			while (i < NoOfDate) {
				String DList = StartDateList.get(i).getText();
				// System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.contains(sone)) {
					StartDateList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
				// System.out.println(sone);

			}
		}

		SubmitBtn.click();
		Thread.sleep(1000);
		/*
		 * if(AlertMsg.isDisplayed()) { System.out.println(AlertMsg.getText()); }
		 */
		if (EndDateReqFieldMsg.isDisplayed()) {
			System.out.println(EndDateReqFieldMsg.getText());
		}

		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,50)");
		// End date
		WebElement EndDate = driver.findElement(By.xpath("//input[@placeholder='End date']"));
		EndDate.click();
		// WebElement arrow
		// =driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
		// arrow.click();
		Thread.sleep(1000);
		List<WebElement> EndDateList = driver.findElements(
				By.xpath("//div/div[7]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[@aria-disabled='false']"));
		WebElement Elabel = driver.findElement(By.cssSelector("div.react-datepicker__current-month"));
		if (Elabel.isDisplayed()) {
			// State.click();
			int NoOfDate = EndDateList.size();
			int j = 0;
			while (j < NoOfDate) {
				String DList = EndDateList.get(j).getText();
				// System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.contains(eone)) {
					EndDateList.get(j).click();

					Thread.sleep(5000);
					break;
				}
				j++;
			}
		}

		/*
		 * WebElement Enddate =
		 * driver.findElement(By.xpath("//input[@placeholder='End date']"));
		 * Thread.sleep(2000); Enddate.sendKeys("09/01/2022");
		 * Enddate.sendKeys(Keys.ENTER);
		 */

		// 09/01/2022

		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(5000);
		SubmitBtn.click();
		Thread.sleep(1000);
		if (AlertMsg.isDisplayed()) {
			System.out.println(AlertMsg.getText());
		}
		Thread.sleep(6000);
		driver.navigate().refresh();
	}
}
