package SalesUpload;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class SalesUpload extends BaseClass{
	UtilityClass ref = new UtilityClass();
	String sheetName = "SalesUpload";// Read the data from excel sheet1
	String sheetName1 = "SalesUploadFile";
	Map<String, Object> customer = ref.exceldata(sheetName);

	Map<String, Map<String, String>> customer1 = ref.getExcelAsMap(sheetName1);
	int excelRows = ref.getrowCount();

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public SalesUpload(WebDriver driver) {
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

	@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[2]/ul/div[2]")
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

	@FindBy(xpath = "//button[@type='button'][@title='play/pause']")
	WebElement PlayBtn;

	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement SelectedRecord;

	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	WebElement UploadStatus;

	@FindBy(xpath = "//button[contains(text(),'Word Analysis')]")
	WebElement WordAnalysis;

	@FindBy(xpath = "//div/div/div/button[3]")
	WebElement SentimentLabel;

	@FindBy(xpath = "//div/div[2]/div/div/div[1]/div[1]/div/button")
	WebElement BackBtn;

	@FindBy(xpath = "//table/tbody/tr[1]/td[1]")
	WebElement RecordOrg;
	
	@FindBy(xpath = "//div/div/form/div[1]/div[4]/div/p")
	WebElement CalReqFieldMsg;

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[6]/div/p")
	WebElement AgentReqFieldMsg;


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

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[5]/div/p")
	WebElement ProcessReqFieldMsg;

	@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[5]/div/p")
	WebElement AgeReqFieldMsg;

	//@FindBy(xpath = "//div[2]/div[3]/div/div/div/form/div[1]/div[6]/div/p")
	//WebElement AgentReqFieldMsg;

	@FindBy(xpath = "//input[@placeholder='Search by name']")
	WebElement UploadSearchBar;

	@FindBy(xpath = "//div/div/form/div[2]/button[1]")
	WebElement CancelBtn;
	
	@FindBy(xpath = "//*[@id='simple-tab-2']")
	WebElement PersonaliseTab;
	
	@FindBy(xpath = "//button[@type='button'][@title='reload']")
	WebElement ReloadTab;
	
	@FindBy(xpath = "//h4[contains(text(),'Word Analysis')]")
	WebElement WordAnalysisLabel;

	@FindBy(xpath = "//button[contains(text(),'Revenue')]")
	WebElement RevenueTab;
	
	@FindBy(xpath = "//h4[contains(text(),'Win Probablity')]")
	WebElement WinProbablity;
	
	@FindBy(xpath = "//div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/button[3]")
	WebElement FeedbackTab;
	
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
	
	@FindBy(xpath = "//div[2]/div[2]/div[3]/div/p/div/div[1]/h4")
	WebElement CustomerSentAnalysisLabel;
	
	@FindBy(css="div > p > div > div > div")
	WebElement WordAnalysisData;
	
	@FindBy(xpath="//div/div[2]/div[2]/div[2]/div[3]/div[10]/div/p/div/div")
	WebElement KeywordsTrackingData;
	
	
	public String sorg = (String) customer.get("SelectOrganisation");
	
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
	WorkspaceTab.click();
	UploadTab.click();
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
	List<WebElement> SelectCategoryList = driver.findElements(By.xpath("//*[@id='menu-agent']/div[3]/ul/li"));
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
	
	public String AddNewData() throws InterruptedException, IOException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String sorg = (String) customer.get("SelectOrganisation");
		String scus = (String) customer.get("SelectCustomer");
		String srole = (String) customer.get("SelectRole");
		String sprocess = (String) customer.get("SelectProcess");
		String sa = (String) customer.get("SelectAgent");
		String sc = (String) customer.get("SelectCampaign");
		String email = (String) customer.get("PEmail");
		String sd = (String) customer.get("SelectDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		WorkspaceTab.click();
		UploadTab.click();
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

			//Select Campaign
		/*	
						WebElement SCampaign = driver.findElement(By.cssSelector("div#select-campaign"));
						SCampaign.click();
						List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-campaign']/div[3]/ul/li"));
						if (SCampaign.isDisplayed()) {
							// State.click();
							int NoOfPro = SelectProcessList.size();
							int i = 0;
							while (i < NoOfPro) {
								String PList = SelectProcessList.get(i).getText();
								// System.out.println(SList);
								// System.out.println(FeaturesNames.get(i).getText());
								if (PList.contains(sc)) {
									SelectProcessList.get(i).click();

									Thread.sleep(5000);
									break;
								}
								i++;
							}
						}*/
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
							if (PList.contains(sd)) {
								SelectCalenderList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}
					}

			
					SubmitBtn.click();
					Thread.sleep(3000);
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
				List<WebElement> SelectCategoryList = driver.findElements(By.xpath("//*[@id='menu-agent']/div[3]/ul/li"));
				if (SCategory.isDisplayed()) {
					// State.click();
					int NoOfCate = SelectCategoryList.size();
					int i = 0;
					while (i < NoOfCate) {
						String CList = SelectCategoryList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (CList.equalsIgnoreCase(sa)) {
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
				Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\SalesFile.exe");
				Thread.sleep(7000);

				SubmitBtn.click();
				Thread.sleep(15000);
				driver.navigate().refresh();
				System.out.println(RecordOrg.getText());

				if (SelectedRecord.isDisplayed()) {
					SelectedRecord.getText();
					WebDriverWait wait = new WebDriverWait(driver, 20000);
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[5][contains(text(),'Process Completed')]")));
					System.out.println(UploadStatus.getText());
				}
				return msg = RecordOrg.getText();
			}

	
	public String editAction() throws InterruptedException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String Udate = (String) customer.get("EditUpdateDate");

	/*	WorkspaceTab.click();
		UploadTab.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().refresh();
		Thread.sleep(5000);*/
		
		SelectedRecord.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
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
		Thread.sleep(20000);
		System.out.println(UploadRecord.getText());
		System.out.println(RecordOrg.getText());
		msg = RecordOrg.getText();

		return msg;
	}


	public void editViewAction() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		WorkspaceTab.click();
		UploadTab.click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.navigate().refresh();
		Thread.sleep(5000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		  SelectedRecord.click();
		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(20000);
			ViewAction.click();
		//	System.out.println("Navigating to Sales Dashboard");
			Thread.sleep(8000);
		}
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
		}
		
		js.executeScript("window.scrollBy(0,300)");
	     Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,200)");
         
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight / 2);");

		//Word Analysis
		if (WordAnalysis.isDisplayed()) {
			WordAnalysis.click();
			Thread.sleep(12000);
			WordAnalysisLabel.isDisplayed();
			System.out.println(WordAnalysisData.getText()+  "Keywords are showing");
			//js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(4000);	
		}
		//Revenue
		if(RevenueTab.isDisplayed()) {
			RevenueTab.click();
			System.out.println(RevenueTab.getText());
			js.executeScript("window.scrollBy(0,200)");
			System.out.println(WinProbablity.getText()+ "Win Probablity graph is showing");
		//	js.executeScript("window.scrollBy(0,150)");
		    
			Thread.sleep(4000);
		}
		//Feedback tab
		//Thread.sleep(6000);
		
	/*	if(FeedbackTab.isDisplayed()) {
			FeedbackTab.click();
			System.out.println("Feedback Tab is clickable");
		}*/
		Thread.sleep(6000);
		 js.executeScript("window.scrollTo(0, 0);");
			if (BackBtn.isDisplayed()) {
				//js.executeScript("window.scrollBy(0,300)");
				Thread.sleep(3000);
				BackBtn.click();
	}
}
}
