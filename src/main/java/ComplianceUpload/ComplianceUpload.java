package ComplianceUpload;

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

public class ComplianceUpload extends BaseClass{
	UtilityClass ref = new UtilityClass();
	String sheetName = "ComplianceUpload";// Read the data from excel sheet1
	//String sheetName1 = "UploadFile";
	Map<String, Object> customer = ref.exceldata(sheetName);

	//Map<String, Map<String, String>> customer1 = ref.getExcelAsMap(sheetName1);
	//int excelRows = ref.getrowCount();

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public ComplianceUpload(WebDriver driver) {
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

	@FindBy(xpath = "//div/p/section/div[1]/button[1]")
	WebElement PlayBtn;

	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement SelectedRecord;

	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	WebElement UploadStatus;

	@FindBy(xpath = "//div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div/div/div/button[2]")
	WebElement ToneLabel;

	@FindBy(xpath = "//div/div/div/button[3]")
	WebElement SentimentLabel;

	@FindBy(xpath = "//div/div/div[2]/div[3]/div/div/button")
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
	
	@FindBy(xpath = "//div/p/section/div[1]/button[2]")
	WebElement ReloadTab;
	
	@FindBy(xpath = "//div[2]/div[2]/div[2]/div[2]/div[2]/div/p/div/div[1]/h4")
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
	
	@FindBy(xpath = "//div[2]/div[2]/div[3]/div/p/div/div[1]/h4")
	WebElement CustomerSentAnalysisLabel;
	
	@FindBy(xpath = "//div/div[2]/div/button[4]")
	WebElement ScriptComplianceTab;
	
	@FindBy(xpath = "//div[2]/div[3]/div[4]/div/p/div/div[1]/div")
	WebElement ComplianceChart;
	
	@FindBy(xpath = "//div[3]/div[4]/div/p/div/div[2]/div")
	WebElement QuestionAskedChart;
	
	@FindBy(xpath = "//div/div/div/table/tbody/tr[1]/td[3]/button")
	WebElement EyeIcon;
	
	@FindBy(xpath = "//html/body/div[2]/div[3]/div")
	WebElement DialogBox;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2")
	WebElement ScriptLabel;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/div/div/div")
	WebElement Phrases;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
	WebElement scriptCrossIcon;
	
	@FindBy(xpath = "//div/div[2]/div/button[5]")
	WebElement ScoreCardTab;
	
	@FindBy(xpath = "//table/tbody/tr[1]/td[4]/button")
	WebElement ScoreCardEyeIcon;
	
	@FindBy(xpath = "//button[contains(.,'Agent & Call Details')]")
	WebElement AgentCallButton;
	
	@FindBy(xpath = "//div[2]/div[3]/div/div/div/div/div/div/div/div")
	WebElement AgentDetails;
	
	@FindBy(xpath = "//Button[2][contains(.,'Submit')]")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//form/div/div[1]/div/div/div[1]/div[1]/p")
	WebElement CallTrackIDFieldMsg;
	
	@FindBy(xpath = "//input[@name='callTrackId']")
	WebElement CallTrackIDText;
	
	@FindBy(xpath = "//form/div/div[1]/div/div/div[3]/div[1]/p")
	WebElement DateOfJoinFieldMsg;
	
	@FindBy(xpath = "//form/div/div[1]/div/div/div[3]/div[1]/p")
	WebElement TenureReqFieldMsg;
	
	@FindBy(xpath = "//input[@name='tenure']")
	WebElement TenureTextBox;
	
	@FindBy(xpath = "//form/div/div[1]/div/div/div[4]/div[1]/p")
	WebElement BucketReqFieldMsg;
	
	@FindBy(xpath = "//input[@name='bucket']")
	WebElement BucketTextField;
	
	@FindBy(xpath = "//form/div/div[1]/div/div/div[5]/div[1]/p")
	WebElement CallDateReqField;
	
	@FindBy(xpath = "//div/div/div/div/div/form/div/div[2]")
	WebElement CallDetails;
	
	@FindBy(xpath = "//input[@name='week']")
	WebElement WeekTextBox;
	
	@FindBy(xpath = "//input[@name='typeOfCall']")
	WebElement TypeOfCallRating;
	
	@FindBy(xpath = "//input[@name='accountDetails']")
	WebElement AccDetailsFatched;
	
	@FindBy(xpath = "//input[@name='status']")
	WebElement Status;
	
	@FindBy(xpath = "//input[@name='interactionId']")
	WebElement InteractionID;
	
	@FindBy(xpath = "//input[@name='callDuration']")
	WebElement CallDuration;
	
	@FindBy(xpath = "//input[@name='callDurationBucket']")
	WebElement CallDurationBucket;
	
	@FindBy(xpath = "//input[@name='customerTagging']")
	WebElement Customer;
	
	@FindBy(xpath = "//input[@name='qrcType']")
	WebElement QRCType;
	
	@FindBy(xpath = "//input[@name='attribute']")
	WebElement Attribute;
	
	@FindBy(xpath = "//input[@name='subAttribute']")
	WebElement SubAttribute;
	
	@FindBy(xpath = "//input[@name='genesysDisposition']")
	WebElement GenesysDisposition;
	
	@FindBy(xpath = "//p[contains(.,'Improvement Details')]")
	WebElement improvementDetails;
	
	@FindBy(xpath = "//textarea[@name='callSummary']")
	WebElement CallSummary;
	
	@FindBy(xpath = "//textarea[@name='bestPractices']")
	WebElement BestPractice;
	
	@FindBy(xpath = "//textarea[@name='improvementAreas']")
	WebElement improvementAreas;
	
	@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
	WebElement CrossIocn;
	
	@FindBy(xpath = "//p/div/div/div[1]/div/button[1]")
	WebElement DownloadBtn;
	
	
	public String sorg = (String) customer.get("SelectOrganisation");
	
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
			
			/*			WebElement SCampaign = driver.findElement(By.cssSelector("div#select-campaign"));
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
				Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\CompFile.exe");
				Thread.sleep(7000);

				SubmitBtn.click();
				Thread.sleep(10000);
				driver.navigate().refresh();
				System.out.println(RecordOrg.getText());

				if (SelectedRecord.isDisplayed()) {
					SelectedRecord.getText();
					WebDriverWait wait = new WebDriverWait(driver, 10000);
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
		
		  SelectedRecord.click();
		if (UploadAction.isDisplayed()) {
			UploadAction.click();
			Thread.sleep(20000);
			ViewAction.click();
			System.out.println("Navigating to Compliance view");
			Thread.sleep(8000);
		}
		
		ScriptComplianceTab.click();
		System.out.println(ComplianceChart.getText() +"Compliance Chart is showing");
		
		Thread.sleep(5000);
		QuestionAskedChart.click();
		System.out.println(QuestionAskedChart.getText() +"Question Asked is showing");
		
		EyeIcon.click();
		if(DialogBox.isDisplayed()) {
			DialogBox.click();
			System.out.println(ScriptLabel.getText());
			Thread.sleep(6000);
			if(Phrases.isDisplayed()) {
				System.out.println(Phrases.getText());
				Thread.sleep(4000);
				scriptCrossIcon.click();	
			}
			   if(ScoreCardTab.isDisplayed()) {
				   ScoreCardTab.click();
				   Thread.sleep(7000);
				   ScoreCardEyeIcon.click();
				   Thread.sleep(4000);
				   scriptCrossIcon.click();	 
				   Thread.sleep(9000);
			   }
			}		
	}
	
	public void Agent_Call_Details() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		
		String ctid = (String) customer.get("CallTrackID");
		String doj = (String) customer.get("DateOfJoining");
		String tenture = (String) customer.get("Tenture");
		String bucket = (String) customer.get("Bucket");
		String calldate = (String) customer.get("CallDate");
		String evaldate = (String) customer.get("EvalDate");
		String week = (String) customer.get("Week");
		String attribute = (String) customer.get("Attribute");
		String subattribute = (String) customer.get("SubAttribute");
		String genesys = (String) customer.get("Genesys");
		String qrctype = (String) customer.get("QRCType");
		String cus = (String) customer.get("Cus");
		String tocr = (String) customer.get("TypeOfCallRating");
		String adf = (String) customer.get("AccDetailsFatched");
		String status = (String) customer.get("Status");
		String inter = (String) customer.get("InteractionID");
		String cd = (String) customer.get("CallDuration");
		String cdb = (String) customer.get("CallDurationBucket");
		String cs = (String) customer.get("CallSummary");
		String bpoc = (String) customer.get("BestPracticeOnCall");
		String aoi = (String) customer.get("AreaOfImprovemnet");

		
		AgentCallButton.click();
		if(AgentDetails.isDisplayed()) {
			AgentDetails.click();
			Thread.sleep(6000);
			SubmitButton.click();
			Thread.sleep(6000);
		}  
		   if(CallTrackIDFieldMsg.isDisplayed()) {
			   System.out.println(CallTrackIDFieldMsg.getText());
			   CallTrackIDText.sendKeys(ctid);
		       Thread.sleep(6000);
		   }
		   
		   Thread.sleep(3000);
		   SubmitButton.click();
			if (DateOfJoinFieldMsg.isDisplayed()) {
				System.out.println(DateOfJoinFieldMsg.getText());
			}

			//DateOfJoining
			WebElement DateOfJoining = driver.findElement(By.xpath("//form/div/div[1]/div/div/div[3]/div[1]/div/input"));
			DateOfJoining.click();
			List<WebElement> DOJList = driver
					.findElements(By.cssSelector(".MuiButtonBase-root.MuiPickersDay-root.MuiPickersDay-dayWithMargin"));
			if (DateOfJoining.isDisplayed()) {
				// State.click();
				int NoOfPro = DOJList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = DOJList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.contains(doj)) {
						DOJList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
			
		   Thread.sleep(3000);
		   SubmitButton.click();
		   if(TenureReqFieldMsg.isDisplayed()) {
			 System.out.println(TenureReqFieldMsg.getText());
			 Thread.sleep(3000);
			 TenureTextBox.sendKeys(tenture);
			 Thread.sleep(6000);
		   }
		   
		   Thread.sleep(3000);
		   SubmitButton.click();
			if (BucketReqFieldMsg.isDisplayed()) {
				System.out.println(BucketReqFieldMsg.getText());
				BucketTextField.sendKeys(bucket);
			}
			
			//Call Date
			Thread.sleep(6000);
			SubmitButton.click();
			if(CallDateReqField.isDisplayed()) {
				System.out.println(CallDateReqField.getText());
			}
			
			//DateOfJoining
			WebElement CallDate = driver.findElement(By.xpath("//form/div/div[1]/div/div/div[5]/div[1]/div/input"));
			CallDate.click();
			List<WebElement> CallList = driver
					.findElements(By.cssSelector(".MuiButtonBase-root.MuiPickersDay-root.MuiPickersDay-dayWithMargin"));
			if (CallDate.isDisplayed()) {
				// State.click();
				int NoOfPro = CallList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = CallList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.contains(calldate)) {
						CallList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
			
			//Eval Date
			
			WebElement EvalDate = driver.findElement(By.xpath("//form/div/div[1]/div/div/div[5]/div[2]/div/input"));
			EvalDate.click();
			List<WebElement> EvaldateList = driver
					.findElements(By.cssSelector(".MuiButtonBase-root.MuiPickersDay-root.MuiPickersDay-dayWithMargin"));
			if (EvalDate.isDisplayed()) {
				// State.click();
				int NoOfPro = EvaldateList.size();
				int i = 0;
				while (i < NoOfPro) {
					String PList = EvaldateList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (PList.contains(evaldate)) {
						EvaldateList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
			
			 Thread.sleep(3000);
			   SubmitButton.click();
			   
			//Call Details
			  if(CallDetails.isDisplayed()) {
				  CallDetails.click();
				  SubmitButton.click();
			  }
			  if(WeekTextBox.isDisplayed()) {
				  WeekTextBox.sendKeys(week);
			  }
			  Thread.sleep(5000);
			  SubmitButton.click();
			  
			  if(TypeOfCallRating.isDisplayed()) {
				  TypeOfCallRating.sendKeys(tocr) ;
			  }
			  Thread.sleep(5000);
			  SubmitButton.click();
			  
			  if(AccDetailsFatched.isDisplayed()) {
				  AccDetailsFatched.sendKeys(adf) ;
			  }
			  Thread.sleep(5000);
			  SubmitButton.click();
			  
			  if(Status.isDisplayed()) {
				  Status.sendKeys(status) ;
			  }
			  Thread.sleep(5000);
			  SubmitButton.click();
			  
			  if(InteractionID.isDisplayed()) {
				  InteractionID.sendKeys(inter) ;
			  }
			   Thread.sleep(5000);
			   SubmitButton.click();
			   
			   if(CallDuration.isDisplayed()) {
				   CallDuration.sendKeys(cd);
			   }
			   Thread.sleep(5000);
			   if(CallDurationBucket.isDisplayed()){
				   CallDurationBucket.sendKeys(cdb);
			   }
			   Thread.sleep(5000);
			   SubmitButton.click();
			   Thread.sleep(5000);
			   if(Customer.isDisplayed()){
				   Customer.sendKeys(cus);
			   }
			   
			   SubmitButton.click();
			   Thread.sleep(5000);
			   
			   if(QRCType.isDisplayed()){
				   QRCType.sendKeys(qrctype);
			   }
			   SubmitButton.click();
			   Thread.sleep(5000);
			   
			   if(Attribute.isDisplayed()){
				   Attribute.sendKeys(attribute);
			   }
			   SubmitButton.click();
			   Thread.sleep(5000);
			   
			   if(SubAttribute.isDisplayed()){
				   SubAttribute.sendKeys(subattribute);
			   }
			   SubmitButton.click();
			   Thread.sleep(5000);
			   if(GenesysDisposition.isDisplayed()){
				   GenesysDisposition.sendKeys(genesys);
			   }
			   SubmitButton.click();
			   Thread.sleep(9000);
			   improvementDetails.click();
			   
			   Thread.sleep(9000);
			   if(CallSummary.isDisplayed()) {
				   CallSummary.sendKeys(cs);
			   }
			   SubmitButton.click();
			   Thread.sleep(9000);
			   if(BestPractice.isDisplayed()) {
				   BestPractice.sendKeys(bpoc);
			   }
					 
			   SubmitButton.click();
			   Thread.sleep(9000);
			   if(improvementAreas.isDisplayed()) {
				   improvementAreas.sendKeys(aoi);
			   }
			   
			   SubmitButton.click();
			   CrossIocn.click();
			   Thread.sleep(9000);
			   DownloadBtn.click();
			   
			 		   
		
	}
}
