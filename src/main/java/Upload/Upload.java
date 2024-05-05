package Upload;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class Upload extends BaseClass {
	// public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "Upload";// Read the data from excel sheet1
	String sheetName1 = "UploadFile";
	String sheetName2 = "UploadMonoCalls";
	Map<String, Object> customer = ref.exceldata(sheetName);

	Map<String, Map<String, String>> customer1 = ref.getExcelAsMap(sheetName1);
	Map<String, Map<String, String>> customer2 = ref.getExcelAsMap(sheetName2);
	int excelRows = ref.getrowCount();
	


	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public Upload(WebDriver driver) {
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

	@FindBy(xpath = "//div[contains(text(),'Workspace')]")
	WebElement WorkspaceTab;

	@FindBy(xpath = "//ul/div[4]/div/div/div/a[2]")
	WebElement CustomerTab;

	@FindBy(xpath = "//div[text()='Upload']")
	WebElement UploadTab;

	@FindBy(xpath = "//button[text()='Upload New Data']")
	WebElement UploadNewDataBtn;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement CancelButton;

	@FindBy(xpath = "//form/div[1]/div[1]/div/p")
	WebElement SelectOrgReqFieldMsg;

	@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	WebElement AlertMessage;

	@FindBy(xpath = "//table/tbody/tr[1]/td[6]/button")
	WebElement UploadAction;

	@FindBy(xpath = "//div[3]/ul/li[1]")
	WebElement ViewAction;

	@FindBy(xpath = "//ul/li[2]")
	WebElement DeleteAction;

	@FindBy(xpath = "//div[3]/ul/li[3]")
	WebElement EditAction;

	@FindBy(xpath = "//ul/li[]")
	WebElement Action;

	@FindBy(xpath = "//ul/li[1]")
	WebElement OrgActionDisable;

	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement OrgUpdateBtn;

	@FindBy(css = "div.MuiBox-root.css-0 > div.MuiBox-root.css-0 > div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(2)")
	WebElement PlayBtn;

	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement SelectedRecord;

	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	WebElement UploadStatus;

	@FindBy(xpath = "//div[3]/div[2]/div/p/div/div[1]/h4")
	WebElement ToneLabel;

	@FindBy(xpath = "//button[text()='Sentiment']")
	WebElement SentimentLabel;
	
	@FindBy(xpath = "//div[2]/div[2]/div/div[3]/div/button[10]")
	WebElement KeywordTrackerLabel;

	@FindBy(xpath = "//div/div[2]/div[2]/div[2]/div[3]/div[9]/div")
	WebElement Unplesantwords;

	@FindBy(xpath = "//div/div[1]/div[1]/div/button")
	WebElement BackBtn;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]")
	WebElement RecordOrg;

	// edit action
	@FindBy(xpath = "//div/h2")
	WebElement UploadedDataLabel;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement UpdateBtn;

	@FindBy(xpath = "//button[text()='Upload']")
	WebElement UploadBtn;

	@FindBy(xpath = "//div/div[2]/div[2]/div[1]/div/div[2]/div/div")
	WebElement UploadedRecordName;

	@FindBy(xpath = "//div[1]/div[2]/div/div/div/div/table/tbody/tr[1]")
	WebElement UploadRecord;

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[2]/div/p")
	WebElement CustomerReqFieldMsg;

	@FindBy(xpath = "//div/div/form/div[1]/div[5]/div/p")
	WebElement ProcessReqFieldMsg;

	@FindBy(xpath = "//div/div/form/div[1]/div[4]/div/p")
	WebElement CalReqFieldMsg;

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[6]/div/p")
	WebElement AgentReqFieldMsg;

	@FindBy(xpath = "//input[@placeholder='Search by name']")
	WebElement UploadSearchBar;

	@FindBy(xpath = "//div/div/form/div[2]/button[1]")
	WebElement CancelBtn;
	
	@FindBy(xpath = "//*[@id='simple-tab-2']")
	WebElement PersonaliseTab;
	
	@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(1)")
	WebElement ReloadTab;
	
	@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(3)")
	WebElement BackwordReloadTab;
	
	@FindBy(xpath = "//div[3]/div[2]/div/p/div/div[1]/h4")
	WebElement AgentToneAnalysisLabel;

	@FindBy(xpath = "//div/p/div/div[2]/h4")
	WebElement CustomerToneLabel;
	
	@FindBy(css = "#simple-tabpanel-5 > div > p > div > div:nth-child(2) > div > div.recharts-responsive-container > div > svg")
	WebElement CustomerToneGraph;
	
	@FindBy(xpath = "//div[2]/div/p/div/div[3]/h4")
	WebElement CustomerToneAnalysisLabel;
	
	@FindBy(xpath = "//div[2]/div/p/div/div[4]/h4")
	WebElement AgentToneLabel;
	
	@FindBy(xpath = "//*/div/p/div/div[3]/div/div")
	WebElement CTGraph;
	
	@FindBy(css = "//*[@class='apexcharts-bar-area'][1]")
	WebElement CTGraphHighTone;
	
	@FindBy(xpath = "//*[@class=\"apexcharts-bar-area\"][1]")
	WebElement ATGraphHighTone;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2")
	WebElement HighToneDetails;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div/div/div[1]")
	WebElement AudioFileName;
	
	@FindBy(xpath = "//div[2]/div[3]/div[3]/div/p/div/div[1]/h4")
	WebElement CustomerSentAnalysisLabel;
	
	@FindBy(xpath = "//div[2]/div[3]/div[3]/div/p/div/div[2]/h4")
	WebElement AgentSentAnalysisLabel;
     
	//Feedback
	@FindBy(xpath = "//div/div[2]/div/div[4]/section/div[4]/button")
	WebElement dot;
	
	@FindBy(xpath = "//button[text()='Add Feedback']")
	WebElement AddFeedback;
	
	@FindBy(xpath = "//div/div/form/div[1]/div[5]/div/div/p")
	WebElement FeedbackReqFieldmsg;

	@FindBy(xpath = "//div/div/div/textarea[1]")
	WebElement FeedbackTextBox;
	
	@FindBy(xpath = "//div/div[2]/ul/div[5]/div[2][text()='Feedback']")
	WebElement FeedbackTab;
	
	@FindBy(xpath = "//div/div[2]/ul/div[6]/div/div/div/a[2]/div[text()='Call Rating']")
	WebElement CallRatingModule;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement FeedbackRecord;
	
	@FindBy(xpath = "//table/tbody/tr[1]/th[5]/a")
	WebElement File;
	
	@FindBy(xpath = "//div[3]/div/div/div/div/div/div/div[2]")
	WebElement AudioPlayBtn;
	
	@FindBy(xpath = "//div[2]/div[3]/div/h2/div/div")
	WebElement CrossIcon;
	
	@FindBy(xpath = "//body/div[2]/div[3]/ul/li[1]")
	WebElement Download;
	
	@FindBy(xpath = "//div/div/div/button[3]")
	WebElement WordAnalysis;
	
	@FindBy(xpath = "//div[2]/div[3]/div[5]/div/p/div/div/div")
	WebElement WordAnalysisKeywords;
	
	@FindBy(xpath = "//div/div/div/button[4]")
	WebElement ScriptCompliance;

	@FindBy(xpath = "//div/div/div/button[5]")
	WebElement ScoreCardTab;
	
	@FindBy(xpath = "//*[@id='gauge']")
	WebElement ComplianceDial;
	
	@FindBy(xpath = "//div/div/div/table/tbody/tr[1]/td[3]/button")
	WebElement ViewParameter;
	
	@FindBy(xpath = "//div[2]/div[3]/div/h2/div/div")
	WebElement ScriptCrossIcon;
	
	@FindBy(css = "div > p > div > div > div:nth-child(1) > div > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium")
	WebElement ScoreDownloadBtn;
	
	@FindBy(xpath = "//div/div/div/button[6]")
	WebElement CallInsightsTab;
	
	@FindBy(xpath = "//*/div/p/div[2]/div[1]/div")
	WebElement GoodParameter;
	
	@FindBy(xpath = "//*/div/p/div[2]/div[2]/div")
	WebElement NeedImprovementParameter;
	
	@FindBy(xpath = "//div/div/div/button[7]")
	WebElement RevenueTab;
	
	@FindBy(xpath = "//button[text()='Need Improvement']")
	WebElement NeedImprovementBtn;
	
	@FindBy(xpath = "//h2[@id='modal-modal-title']")
	WebElement NeedImprovementData;
	
	@FindBy(css = "body > div.MuiModal-root.css-8ndowl > div.MuiBox-root.css-c4ay95 > div > svg > path")
	WebElement crossIcon;
	
	@FindBy(xpath = "//div/div/table/tbody/tr[1]/th[10]/button")
	WebElement Summary;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2")
	WebElement DialogBoxLabel;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div[1]/div[1]/div")
	WebElement GoodParametersDetails;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div[1]/div[2]/div")
	WebElement GoodParametersReason;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div[2]/div[1]/div")
	WebElement NeedImprovementParameters;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div[2]/div[2]/div")
	WebElement ImprovementReason;
	
	@FindBy(xpath = "//div/table/tbody/tr[1]/th[9]/a")
	WebElement ViewFile;
	
	@FindBy(xpath = "//div[2]/div/div/div[1]/div[1]/div/button")
	WebElement backBtn;
	
	
	
	public String sorg = (String) customer.get("SelectOrganisation");

	String location = "D:\\SeleniumTestingNew\\IntelliConvo\\Document\\";

	// uploading max file
	public String UploadingMaximumFile() throws IOException, InterruptedException {
		Thread.sleep(5000);
		WorkspaceTab.click();
		UploadTab.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		if (UploadNewDataBtn.isDisplayed()) {
			Thread.sleep(3000);
			UploadNewDataBtn.click();
			Thread.sleep(2000);

			// upload Audio
			String ind;
			for (int e = 1; e < excelRows + 1; e++) {
				ind = Integer.toString(e);

				String Fname = (String) customer1.get(ind).get("FileName");

				Thread.sleep(8000);
				driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
				Thread.sleep(4000);
				Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\"+Fname+".exe");
				Thread.sleep(4000);
				if (e == 20) {
				//	driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
					AlertMessage.isEnabled();
					System.out.println(AlertMessage.getText());
					CancelButton.click();
					break;

				}

			}
		}

		return null;
	}

	public String AddNewData() throws InterruptedException, IOException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String srole = (String) customer.get("SelectRole");
		String sprocess = (String) customer.get("SelectProcess");
		String scate = (String) customer.get("SelectAgent");
		String kw = (String) customer.get("Keywords");
		String email = (String) customer.get("PEmail");
		String sd = (String) customer.get("SelectDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		
	//	WorkspaceTab.click();
	//	UploadTab.click();
		Thread.sleep(5000);
		if (UploadNewDataBtn.isDisplayed()) {
			Thread.sleep(3000);
			UploadNewDataBtn.click();
			Thread.sleep(2000);
			SubmitBtn.click();
			System.out.println(SelectOrgReqFieldMsg.getText());
			Thread.sleep(8000);

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
			Thread.sleep(3000);
			SubmitBtn.click();
			if (CustomerReqFieldMsg.isDisplayed()) {
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

			// select calender
			Thread.sleep(3000);
			SubmitBtn.click();
			if (CalReqFieldMsg.isDisplayed()) {
				System.out.println(CalReqFieldMsg.getText());
			}

			WebElement SCalender = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[4]/div/div/div"));
			SCalender.click();
			List<WebElement> SelectCalenderList = driver
					.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
			if (SCalender.isDisplayed()) {
				// State.click();
				int NoOfPro = SelectCalenderList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = SelectCalenderList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.equalsIgnoreCase(sd)) {
						SelectCalenderList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}

	
			Thread.sleep(3000);
			SubmitBtn.click();
			if (ProcessReqFieldMsg.isDisplayed()) {
				System.out.println(ProcessReqFieldMsg.getText());
			}
			// selectProcess
			WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[5]/div/div/div"));
			SProcess.click();
			List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-process']/div[3]/ul/li"));
			if (SProcess.isDisplayed()) {
				// State.click();
				int NoOfPro = SelectProcessList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = SelectProcessList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.contains(sprocess)) {
						SelectProcessList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
		}

	/*	// select calender
		Thread.sleep(3000);
		SubmitBtn.click();
		if (SelReqFieldMsg.isDisplayed()) {
			System.out.println(SelReqFieldMsg.getText());
		}

		WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[5]/div/div/div"));
		SProcess.click();
		List<WebElement> SelectProcessList = driver
				.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		if (SProcess.isDisplayed()) {
			// State.click();
			int NoOfPro = SelectProcessList.size();
			int i = 0;
			while (i < NoOfPro) {
				String PList = SelectProcessList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (PList.contains(mob)) {
					SelectProcessList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}
*/
		Thread.sleep(3000);
		SubmitBtn.click();
		if (AgentReqFieldMsg.isDisplayed()) {
			System.out.println(AgentReqFieldMsg.getText());
		}
		// select agent
		Thread.sleep(3000);
		WebElement SCategory = driver.findElement(By.xpath("//div/form/div[1]/div[6]/div/div/div"));
		SCategory.click();
		List<WebElement> SelectCategoryList = driver.findElements(By.xpath("//ul/li[@role='option']"));
		if (SCategory.isDisplayed()) {
			// State.click();
			int NoOfCate = SelectCategoryList.size();
			int i = 0;
			while (i < NoOfCate) {
				String CList = SelectCategoryList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (CList.equalsIgnoreCase(scate)) {
					SelectCategoryList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}

		// upload Audio
		Thread.sleep(8000);
/*		driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\ImageFile.exe");
		if (AlertMessage.isDisplayed()) {
			System.out.println(AlertMessage.getText());
		}*/

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\shubhamFile.exe");
		Thread.sleep(7000);

		SubmitBtn.click();
		Thread.sleep(90000);
		driver.navigate().refresh();
		System.out.println(RecordOrg.getText());

		if (SelectedRecord.isDisplayed()) {
			SelectedRecord.getText();
			WebDriverWait wait = new WebDriverWait(driver, 100000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[5][contains(text(),'Process Completed')]")));
			System.out.println(UploadStatus.getText());
		}
		return msg = RecordOrg.getText();
	}

	public void editViewAction() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		
		String manual = (String) customer.get("MScore");
		String auto = (String) customer.get("AScore");
		String both = (String) customer.get("BScore");

		//WorkspaceTab.click();
		//UploadTab.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().refresh();
	// driver.findElement(By.xpath("//div/div[1]/div[1]/div/div/div/div/table/tbody/tr[2]")).click();
		 // SelectedRecord.click();
		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(20000);
			ViewAction.click();
			Thread.sleep(8000);
		}
		 //  PersonaliseTab.click();	
		 //  Thread.sleep(2000);
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
		if(dot.isDisplayed()) {
			dot.click();
			Thread.sleep(3000);
			//Download.click();
			Download.sendKeys(Keys.ENTER ,Keys.TAB);
			System.out.println("Audio Downloaded sucessfully.");
			Thread.sleep(3000);
			//BackwordReloadTab.click();
		}
		
		js.executeScript("window.scrollBy(0,300)");
	     Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,100)");
         
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");

		//Tone
		if (ToneLabel.isDisplayed()) {
			//ToneLabel.click();
			Thread.sleep(12000);
			AgentToneAnalysisLabel.isDisplayed();
			System.out.println(AgentToneAnalysisLabel.getText() +"Agent Tone graph working");
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(4000);	
		}
		//customer tone Analysis label
		if(CustomerToneLabel.isDisplayed()) {
			System.out.println(CustomerToneLabel.getText());
			js.executeScript("window.scrollBy(0,400)");
			System.out.println(CustomerToneGraph.getText()+"Customer Tone graph is working");
			Thread.sleep(4000);
		}
		//Customer Tone Analysis
		js.executeScript("window.scrollBy(0,500)");
		if(CustomerToneAnalysisLabel.isDisplayed()) {
			System.out.println(CustomerToneAnalysisLabel.getText());
		}
		Thread.sleep(6000);
	/*	if(CTGraph.isDisplayed()) {
			CTGraph.getText();
			Thread.sleep(6000);
			CTGraphHighTone.isDisplayed();
			CTGraphHighTone.click();	
		}
		Thread.sleep(8000);
		
		HighToneDetails.isDisplayed();
		System.out.println(HighToneDetails.getText());
		Thread.sleep(3000);
		if(AudioFileName.isDisplayed()) {
			System.out.println(AudioFileName.getText()+"Audio File Name is showing");
		}
		//Agent Tone Analysis
		if(AgentToneLabel.isDisplayed()) {
			System.out.println(AgentToneLabel.getText());
			js.executeScript("window.scrollBy(0,400)");
			ATGraphHighTone.isDisplayed();
			ATGraphHighTone.click();	
		}*/
		//sentiment 
		js.executeScript("window.scrollBy(0,-950)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-350)");
		if (SentimentLabel.isDisplayed()) {
			SentimentLabel.click();
			Thread.sleep(8000);
			 System.out.println(CustomerSentAnalysisLabel.getText());
		}
		  System.out.println(AgentSentAnalysisLabel.getText());
		  
		  Thread.sleep(8000);
		  if (WordAnalysis.isDisplayed()) {
		         WordAnalysis.click();
				Thread.sleep(8000);
				 System.out.println(WordAnalysisKeywords.getText());
			}
		  
		  //script compliance
		  
		  if (ScriptCompliance.isDisplayed()) {
			  ScriptCompliance.click();
				Thread.sleep(8000);
				 System.out.println(ComplianceDial.getText());
				// Thread.sleep(8000);
				 ViewParameter.click();
				 Thread.sleep(8000);
				 ScriptCrossIcon.click();	 
			}
		  
		  //Score card
		  if (ScoreCardTab.isDisplayed()) {
			  ScoreCardTab.click();
				Thread.sleep(8000);
				// System.out.println(ComplianceDial.getText());
				 Thread.sleep(8000);
				// ScoreDownloadBtn.click();
				// Select score card
					Thread.sleep(3000);
					WebElement SCustomer = driver.findElement(By.cssSelector("div > p > div > div > div:nth-child(1) > div > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium"));
					SCustomer.click();
					List<WebElement> CustomerList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
					if (SCustomer.isDisplayed()) {
						// State.click();
						int NoOfOrg = CustomerList.size();
						int i = 0;
						while (i < NoOfOrg) {
							String CList = CustomerList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (CList.contains(manual)) {
								CustomerList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}
                     }
					 System.out.println("Manual score card downloaded sucessfully.");
					Thread.sleep(8000);
					
					//automated
					
					// Select score card
					Thread.sleep(3000);
					WebElement AutomatedScore = driver.findElement(By.cssSelector("div > p > div > div > div:nth-child(1) > div > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium"));
					AutomatedScore.click();
					List<WebElement> scoreList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
					if (AutomatedScore.isDisplayed()) {
						// State.click();
						int NoOfOrg = scoreList.size();
						int i = 0;
						while (i < NoOfOrg) {
							String CList = scoreList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (CList.contains(auto)) {
								scoreList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}

					}
					System.out.println("AI score card downloaded sucessfully.");
                       Thread.sleep(8000);
                       //Both
                    // Select score card
   					Thread.sleep(3000);
   					WebElement BothScore = driver.findElement(By.cssSelector("div > p > div > div > div:nth-child(1) > div > button.MuiButtonBase-root.MuiIconButton-root.MuiIconButton-sizeMedium"));
   					BothScore.click();
   					List<WebElement> bscoreList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
   					if (BothScore.isDisplayed()) {
   						// State.click();
   						int NoOfOrg = bscoreList.size();
   						int i = 0;
   						while (i < NoOfOrg) {
   							String CList = bscoreList.get(i).getText();
   							// System.out.println(SList);
   							// System.out.println(FeaturesNames.get(i).getText());
   							if (CList.contains(both)) {
   								bscoreList.get(i).click();

   								Thread.sleep(5000);
   								break;
   							}
   							i++;
   						}

   					}
   					System.out.println("Both score card downloaded sucessfully.");
   					Thread.sleep(6000);		
				
			}
		  
		  
		  //Call Insights
		  if(CallInsightsTab.isDisplayed()) {
			  CallInsightsTab.click();
			  Thread.sleep(6000);
			  GoodParameter.click();
			 System.out.println(GoodParameter.getText() + "Good Calls parameter");
			 Thread.sleep(6000);
			 NeedImprovementParameter.click();
			 System.out.println(NeedImprovementParameter.getText() + "Need Improvement Calls parameter");
			 Thread.sleep(6000);
			 NeedImprovementBtn.click();
			 Thread.sleep(6000);
			 crossIcon.click();
			 
		  }
		  
		  //Revenue Tab
		  
		  if(RevenueTab.isDisplayed()) {
			  RevenueTab.click();
			  Thread.sleep(3000);
			// System.out.println(Unplesantwords.getText());
		  }
		  
		  
		  
		  if(KeywordTrackerLabel.isDisplayed()) {
			  KeywordTrackerLabel.click();
			  Thread.sleep(3000);
			 System.out.println(Unplesantwords.getText());
		  }
		  
		  js.executeScript("window.scrollTo(0, 0);");
		if (BackBtn.isDisplayed()) {
			//js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(3000);
			BackBtn.click();
		}

	}

	
	public String editAction() throws InterruptedException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		
	
		String Udate = (String) customer.get("EditUpdateDate");

		driver.navigate().refresh();
		Thread.sleep(2000);
		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(5000);
			EditAction.click();
			Thread.sleep(8000);
		}
		if (UploadedDataLabel.isDisplayed()) {
			System.out.println(UploadedDataLabel.getText());
		}

		// calender
		WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[5]/div/div/div"));
		SProcess.click();
		List<WebElement> SelectProcessList = driver
				.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		if (SProcess.isDisplayed()) {
			// State.click();
			int NoOfPro = SelectProcessList.size();
			int i = 0;
			while (i < NoOfPro) {
				String PList = SelectProcessList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (PList.equalsIgnoreCase(Udate)) {
					SelectProcessList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}

		Thread.sleep(5000);
		UpdateBtn.click();
		/*
		 * if (AlertMessage.isDisplayed()) { System.out.println(AlertMessage.getText());
		 * msg = AlertMessage.getText(); }
		 */
		/*
		 * if (UploadRecord.isDisplayed()) { System.out.println(UploadRecord.getText());
		 * }
		 */
		Thread.sleep(10000);
		System.out.println(UploadRecord.getText());
		System.out.println(RecordOrg.getText());
		msg = RecordOrg.getText();

		return msg;
	}

	public void AddFeedback() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String Feed = (String) customer.get("Feedback");

		//driver.navigate().refresh();
		//WorkspaceTab.click();
		//UploadTab.click();
		Thread.sleep(2000);
		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(6000);
			ViewAction.click();
			Thread.sleep(4000);
			AddFeedback.click();
			Thread.sleep(8000);
			SubmitBtn.click();
			System.out.println(FeedbackReqFieldmsg.getText());
			FeedbackTextBox.sendKeys("  ");
			Thread.sleep(2000);
			System.out.println(FeedbackReqFieldmsg.getText());
			FeedbackTextBox.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			FeedbackTextBox.sendKeys(Feed);
			SubmitBtn.click();
			Thread.sleep(8000);
			
			if(FeedbackTab.isDisplayed())
			{
				System.out.println("Check on the Feedback screen");
				Thread.sleep(1000);
				FeedbackTab.click();
				CallRatingModule.click();
				FeedbackRecord.click();
				Thread.sleep(8000);
				Summary.click();
				Thread.sleep(2000);
				System.out.println(DialogBoxLabel.getText());
				if(GoodParametersDetails.isDisplayed())
				{
					System.out.println("Good Parameter Details"+GoodParametersDetails.getText());
					
				}
				Thread.sleep(8000);
				if(GoodParametersReason.isDisplayed())
				{
					System.out.println("Reason For Good Parameter "+GoodParametersReason.getText());
					
				}
				Thread.sleep(8000);
				if(NeedImprovementParameters.isDisplayed())
				{
					System.out.println("Need Improvement Parameter "+NeedImprovementParameters.getText());
					
				}
				Thread.sleep(8000);
				if(ImprovementReason.isDisplayed())
				{
					System.out.println("Improvement Reason "+ImprovementReason.getText());
					
				}
				Thread.sleep(8000);
				//System.out.println("Audio is playing");
				//Thread.sleep(6000);
				//AudioPlayBtn.click();
				//System.out.println("Audio is stopped");
				CrossIcon.click();
				
				Thread.sleep(6000);
				if(ViewFile.isDisplayed())
				{
					ViewFile.click();
					System.out.println("Checked the View Screen");
					Thread.sleep(6000);
					backBtn.click();
				}
				}				
			
		}
	}

	public String SelectDiffDateUpload() throws InterruptedException, IOException {
		String ind;
		for (int e = 1; e <= 3; e++) {
			ind = Integer.toString(e);

	String Fname = (String) customer1.get(ind).get("FileName");
	String date = (String) customer1.get(ind).get("SDate");
	String sprocess = (String) customer.get("SelectProcess");
	String scate = (String) customer.get("SelectAgent");
	String scus = (String) customer.get("SelectCustomer");
	String sorg = (String) customer.get("SelectOrganisation");
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(5000);
	//WorkspaceTab.click();
	//UploadTab.click();
	Thread.sleep(5000);
	if (UploadNewDataBtn.isDisplayed()) {
		Thread.sleep(3000);
		UploadNewDataBtn.click();
		Thread.sleep(2000);
		SubmitBtn.click();
		System.out.println(SelectOrgReqFieldMsg.getText());
		Thread.sleep(8000);

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
		Thread.sleep(3000);
		SubmitBtn.click();
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
		
		// select calender
					Thread.sleep(3000);
					SubmitBtn.click();
					if (CalReqFieldMsg.isDisplayed()) {
						System.out.println(CalReqFieldMsg.getText());
					}

					WebElement SCalender = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[4]/div/div/div"));
					SCalender.click();
					List<WebElement> SelectCalenderList = driver
							.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
					if (SCalender.isDisplayed()) {
						// State.click();
						int NoOfPro = SelectCalenderList.size();
						int i = 0;
						while (i < NoOfPro) {
							String PList = SelectCalenderList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (PList.equalsIgnoreCase(date)) {
								SelectCalenderList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}
					}

			
		Thread.sleep(3000);
		SubmitBtn.click();
		if(ProcessReqFieldMsg.isDisplayed()) {
			System.out.println(ProcessReqFieldMsg.getText());
		}
		// selectProcess
		WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[5]/div/div/div"));
		SProcess.click();
		List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-process']/div[3]/ul/li"));
		if (SProcess.isDisplayed()) {
			// State.click();
			int NoOfPro = SelectProcessList.size();
			int i = 0;
			while (i < NoOfPro) {
				String PList = SelectProcessList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (PList.contains(sprocess)) {
					SelectProcessList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}
	}

	// select calender
    Thread.sleep(3000);
	SubmitBtn.click();
	
		if(AgentReqFieldMsg.isDisplayed()) {
			System.out.println(AgentReqFieldMsg.getText());
		}
	// select agent
	Thread.sleep(3000);
	WebElement SCategory = driver.findElement(By.xpath("//div/form/div[1]/div[6]/div/div/div"));
	SCategory.click();
	List<WebElement> SelectCategoryList = driver.findElements(By.xpath("//ul/li[@role='option']"));
	if (SCategory.isDisplayed()) {
		// State.click();
		int NoOfCate = SelectCategoryList.size();
		int i = 0;
		while (i < NoOfCate) {
			String CList = SelectCategoryList.get(i).getText();
			// System.out.println(SList);
			// System.out.println(FeaturesNames.get(i).getText());
			if (CList.equalsIgnoreCase(scate)) {
				SelectCategoryList.get(i).click();

				Thread.sleep(5000);
				break;
			}
			i++;
		}
	}
   Thread.sleep(2000);
	// upload Audio
	Thread.sleep(8000);
	driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
	Thread.sleep(18000);
	Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\" + Fname + ".exe");
	Thread.sleep(18000);

	SubmitBtn.click();
	
	Thread.sleep(90000);
	driver.navigate().refresh();
		}
		
		return null;
	}
	
	
	
	  public String UploadMonoCalls() throws InterruptedException, IOException {
	  driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
	  
	  String ind = null; 
	  String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		
		WorkspaceTab.click();
		UploadTab.click();
		Thread.sleep(5000);
		
			
			for (int e = 1; e < excelRows + 1; e++) 
			{
				ind = Integer.toString(e);
				
				
				String sorg = (String) customer2.get(ind).get("SelectOrganisation");
				String scus = (String) customer2.get(ind).get("SelectCustomer");
				String sprocess = (String) customer2.get(ind).get("SelectProcess");
				String sagent = (String) customer2.get(ind).get("SelectAgent");
				String sd = (String) customer2.get(ind).get("SelectDate");

				
		   if (UploadNewDataBtn.isDisplayed())
		    {
			Thread.sleep(3000);
			UploadNewDataBtn.click();
			Thread.sleep(2000);
			SubmitBtn.click();
			System.out.println(SelectOrgReqFieldMsg.getText());
			Thread.sleep(8000);

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
			Thread.sleep(3000);
			SubmitBtn.click();
			if (CustomerReqFieldMsg.isDisplayed()) {
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

			// select calender
			Thread.sleep(3000);
			SubmitBtn.click();
			if (CalReqFieldMsg.isDisplayed()) {
				System.out.println(CalReqFieldMsg.getText());
			}

			WebElement SCalender = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[4]/div/div/div"));
			SCalender.click();
			List<WebElement> SelectCalenderList = driver
					.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
			if (SCalender.isDisplayed()) {
				// State.click();
				int NoOfPro = SelectCalenderList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = SelectCalenderList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.equalsIgnoreCase(sd)) {
						SelectCalenderList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}

	
			Thread.sleep(3000);
			SubmitBtn.click();
			if (ProcessReqFieldMsg.isDisplayed()) {
				System.out.println(ProcessReqFieldMsg.getText());
			}
			// selectProcess
			WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[5]/div/div/div"));
			SProcess.click();
			List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-process']/div[3]/ul/li"));
			if (SProcess.isDisplayed()) {
				// State.click();
				int NoOfPro = SelectProcessList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = SelectProcessList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.contains(sprocess)) {
						SelectProcessList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
		

		Thread.sleep(3000);
		SubmitBtn.click();
		if (AgentReqFieldMsg.isDisplayed()) {
			System.out.println(AgentReqFieldMsg.getText());
		}
		// select agent
		Thread.sleep(3000);
		WebElement SCategory = driver.findElement(By.xpath("//div/form/div[1]/div[6]/div/div/div"));
		SCategory.click();
		List<WebElement> SelectCategoryList = driver.findElements(By.xpath("//ul/li[@role='option']"));
		if (SCategory.isDisplayed()) {
			// State.click();
			int NoOfCate = SelectCategoryList.size();
			int i = 0;
			while (i < NoOfCate) {
				String CList = SelectCategoryList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (CList.equalsIgnoreCase(sagent)) {
					SelectCategoryList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}

		// upload Audio
		Thread.sleep(8000);
/*		driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\ImageFile.exe");
		if (AlertMessage.isDisplayed()) {
			System.out.println(AlertMessage.getText());
		}*/

		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[text()='Upload Audio']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\AnchorAayeshaFile.exe");
		Thread.sleep(7000);

		SubmitBtn.click();
		
		}
	  
		Thread.sleep(90000);
		driver.navigate().refresh();
		System.out.println(RecordOrg.getText());

		if (SelectedRecord.isDisplayed()) {
			SelectedRecord.getText();
		/*	WebDriverWait wait = new WebDriverWait(driver, 100000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[5][contains(text(),'Process Completed')]")));
			System.out.println(UploadStatus.getText());*/
		}
	}
		return msg = RecordOrg.getText();

}

	public String DeleteAction() throws InterruptedException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(2000);
			DeleteAction.click();
		}
		if (AlertMessage.isDisplayed()) {
			System.out.println(AlertMessage.getText());
			msg = AlertMessage.getText();
		}
		return msg;

	}

}
