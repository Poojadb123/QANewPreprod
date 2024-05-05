package SalesKeywords;

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

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class SalesKeywords extends BaseClass{

	//public WebDriver driver;
		UtilityClass ref = new UtilityClass();
		String sheetName = "Skeywords";// Read the data from excel sheet1
		Map<String, Object> customer = ref.exceldata(sheetName);

		String Email = (String) customer.get("Email");// Enter Email
		String FileName = (String) customer.get("FileName");

		public SalesKeywords(WebDriver driver) {
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

		@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[2]/ul/div[2]")
		WebElement WorkspaceTab;

		@FindBy(xpath = "//div[text()='Key Words']")
		WebElement KeyWordsTab;

		@FindBy(xpath = "//button[text()='Add Keywords']")
		WebElement AddKeywordsBtn;

		@FindBy(xpath = "//div/form/div[1]/div[1]/div/p")
		WebElement SelectOrgReqFieldMsg;

		@FindBy(xpath = "//button[text()='Update']")
		WebElement UAddBtn;

		@FindBy(xpath = "//button[text()='Cancel']")
		WebElement CancelBtn;

		@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
		WebElement AlertMessage;

		@FindBy(xpath = "//div[1]/div[4]/div/div/div[1]/div/div")
		WebElement Keywords;

		@FindBy(xpath = "//div/div/div[1]/div/div/textarea[1]")
		WebElement KeywordsText;

		@FindBy(xpath = "//tbody/tr[1]/td[7]/button")
		WebElement KeywordAction;

		@FindBy(xpath = "//div[3]/ul/li[1]")
		WebElement KeywordActionEdit;

		@FindBy(xpath = "//div/h2")
		WebElement EditActionWindowTxt;

		@FindBy(xpath = "//div/div/div[1]/div/div/textarea[1]")
		WebElement KeywordTextField;

		@FindBy(xpath = "//button[text()='Add']")
		WebElement AddBtn;

		@FindBy(xpath = "//ul/li[1]")
		WebElement KeywordActionDelete;

		@FindBy(xpath = "//table/tbody/tr[1]")
		WebElement KeywordsRecord;

		@FindBy(xpath = "//table/tbody/tr[1]/th")
		WebElement KeywordsOrgRecord;
		
		@FindBy(xpath = "//html/body/div[2]//div[1]/div[4]/div[2]/div/div[1]/div/div/textarea[1]")
		WebElement KeywordsTextBox1;
		
		@FindBy(css = "div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > form > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3.css-1h77wgb > div:nth-child(4) > div > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-1ywo9w2")
		WebElement AddBtn1;
		
		@FindBy(css = "div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > form > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3.css-1h77wgb > div:nth-child(4) > div:nth-child(2) > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-1ywo9w2")
		WebElement AddBtn2;
		
		@FindBy(xpath = "//html/body/div[2]/div[3]/div/div/div/form/div[1]/div[4]/div[3]/div/div[1]/div/div/textarea[1]")
		WebElement KeywordsTextBox2;
		
		@FindBy(xpath = "//input[@name='keywords']")
		WebElement SelectCategory;
		
		@FindBy(xpath = "//div[1]/div[4]/div/div/div[2]/div/p")
		WebElement CatReqFieldMsg;
		
		public String sorg = (String) customer.get("SelectOrganisation");

		
		public String AddKeywords() throws InterruptedException, IOException {
			String msg = null;
			driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

			String sorg = (String) customer.get("SelectOrganisation");
			String scus = (String) customer.get("SelectCustomer");
			String srole = (String) customer.get("SelectRole");
			String sprocess = (String) customer.get("SelectProcess");
			String scate = (String) customer.get("SelectCategory");
			String kw = (String) customer.get("Keywords");
			String email = (String) customer.get("PEmail");
			String mob = (String) customer.get("Mobile");
			String empid = (String) customer.get("EmployeeID");
			JavascriptExecutor js = (JavascriptExecutor) driver;

			Thread.sleep(5000);
			WorkspaceTab.click();
			KeyWordsTab.click();
			Thread.sleep(5000);
			if (AddKeywordsBtn.isDisplayed()) {
				Thread.sleep(3000);
				AddKeywordsBtn.click();
				Thread.sleep(6000);
				AddBtn.click();
				System.out.println(SelectOrgReqFieldMsg.getText());
				Thread.sleep(8000);

				// Select Organisation
				Thread.sleep(3000);
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
				Thread.sleep(3000);

				// Select Customer
				Thread.sleep(3000);
				WebElement SCustomer = driver.findElement(By.cssSelector("#select-customer"));
				SCustomer.click();
				List<WebElement> CustomerList = driver
						.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
				Thread.sleep(3000);
				// selectProcess
				WebElement SProcess = driver.findElement(By.cssSelector("#select-process"));
				SProcess.click();
				List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
				// keywords
				Thread.sleep(5000);
				if (Keywords.isDisplayed()) {
					KeywordsText.sendKeys(kw);
				}

				SelectCategory.sendKeys("unpleasant");
				AddBtn.click();
				CatReqFieldMsg.isDisplayed();
				System.out.println(CatReqFieldMsg.getText());
				Thread.sleep(2000);
				SelectCategory.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SelectCategory.sendKeys(scate);
				Thread.sleep(5000);
				AddBtn.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(8000);
				System.out.println(KeywordsRecord.getText());
				System.out.println(KeywordsOrgRecord.getText());
				msg = KeywordsOrgRecord.getText();
			}
			return msg;
		}

		public String UpdateKeyword() throws InterruptedException {
			String msg1 = null;
			driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

			WorkspaceTab.click();
			KeyWordsTab.click();
			Thread.sleep(5000);
			if (KeywordAction.isDisplayed()) {
				KeywordAction.click();
				Thread.sleep(6000);
				KeywordActionEdit.click();
				Thread.sleep(6000);
				// companyName
				if (EditActionWindowTxt.isDisplayed()) {
					if (KeywordTextField.isDisplayed()) {
						KeywordTextField.click();
						KeywordTextField.sendKeys("t");
						UAddBtn.click();
						Thread.sleep(5000);
						System.out.println(KeywordsRecord.getText());
						System.out.println(KeywordsOrgRecord.getText());
						msg1 = KeywordsOrgRecord.getText();
					}
				}
			}
			return msg1;
		}

		public String AddMulKeywords() throws InterruptedException, IOException {
			String msg = null;
			driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

			String sorg = (String) customer.get("SelectOrganisation");
			String scus = (String) customer.get("SelectCustomer");
			String srole = (String) customer.get("SelectRole");
			String sprocess = (String) customer.get("SelectProcess");
			String scate = (String) customer.get("SelectCategory");
			String kw = (String) customer.get("Keywords");
			String kw1 = (String) customer.get("Keywords1");
			String kw2 = (String) customer.get("Keywords2");
			String kw3 = (String) customer.get("Keywords3");
			String email = (String) customer.get("PEmail");
			String mob = (String) customer.get("Mobile");
			String empid = (String) customer.get("EmployeeID");
			//addbtn1
		//	String AddBtn1 = (String) customer.get("Keywords1");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			Thread.sleep(5000);
			WorkspaceTab.click();
			KeyWordsTab.click();
			Thread.sleep(5000);
			if (AddKeywordsBtn.isDisplayed()) {
				Thread.sleep(3000);
				AddKeywordsBtn.click();
				Thread.sleep(6000);
				AddBtn.click();
				System.out.println(SelectOrgReqFieldMsg.getText());
				Thread.sleep(8000);

				// Select Organisation
				Thread.sleep(3000);
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
				Thread.sleep(3000);

				// Select Customer
				Thread.sleep(3000);
				WebElement SCustomer = driver.findElement(By.cssSelector("#select-customer"));
				SCustomer.click();
				List<WebElement> CustomerList = driver
						.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
				Thread.sleep(3000);
				// selectProcess
				WebElement SProcess = driver.findElement(By.cssSelector("#select-process"));
				SProcess.click();
				List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
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
				// keywords
				Thread.sleep(5000);
				if (Keywords.isDisplayed()) {
					KeywordsText.sendKeys(kw1);
				}
				if(AddBtn1.isDisplayed()) {
					AddBtn1.click();
					Thread.sleep(5000);
					KeywordsTextBox1.sendKeys(kw2);
				}
				// select category
				Thread.sleep(3000);
				WebElement SCategory = driver.findElement(By.cssSelector("#select-Category"));
				SCategory.click();
				List<WebElement> SelectCategoryList = driver
						.findElements(By.xpath("//*[@id='menu-keywords[0].Category']/div[3]/ul/li"));
				if (SCategory.isDisplayed()) {
					// State.click();
					int NoOfCate = SelectCategoryList.size();
					int i = 0;
					while (i < NoOfCate) {
						String CList = SelectCategoryList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (CList.contains(scate)) {
							SelectCategoryList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
				//select 2nd category
				// select category
							Thread.sleep(3000);
							WebElement SCategory1 = driver.findElement(By.xpath("//div[4]/div[2]/div/div[2]/div/div/div"));
							SCategory1.click();
							List<WebElement> SelectCategoryList1 = driver
									.findElements(By.xpath("//*[@id='menu-keywords[1].Category']/div[3]/ul/li"));
							if (SCategory1.isDisplayed()) {
								// State.click();
								int NoOfCate = SelectCategoryList1.size();
								int i = 0;
								while (i < NoOfCate) {
									String CList = SelectCategoryList1.get(i).getText();
									// System.out.println(SList);
									// System.out.println(FeaturesNames.get(i).getText());
									if (CList.contains(scate)) {
										SelectCategoryList1.get(i).click();

										Thread.sleep(5000);
										break;
									}
									i++;
								}
							}
				Thread.sleep(8000);
				//btn2
				if(AddBtn2.isDisplayed()) {
					AddBtn2.click();
					Thread.sleep(5000);
					KeywordsTextBox2.sendKeys(kw3);
				}
				// select category
				Thread.sleep(3000);
				WebElement SCategory2 = driver.findElement(By.xpath("//div[4]/div[3]/div/div[2]/div/div/div"));
				SCategory2.click();
				List<WebElement> SelectCategoryList2 = driver
						.findElements(By.xpath("//*[@id='menu-keywords[2].Category']/div[3]/ul/li"));
				if (SCategory2.isDisplayed()) {
					// State.click();
					int NoOfCate = SelectCategoryList2.size();
					int i = 0;
					while (i < NoOfCate) {
						String CList = SelectCategoryList2.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (CList.contains(scate)) {
							SelectCategoryList2.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
	            Thread.sleep(5000);
				AddBtn.click();
				Thread.sleep(8000);
				System.out.println(KeywordsRecord.getText());
				System.out.println(KeywordsOrgRecord.getText());
				msg = KeywordsOrgRecord.getText();
			}
			return msg;
		}
		public String DeleteKeyword() throws InterruptedException {
			String msg1 = null;
			driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

			// OrgMgmtTab.click();
			Thread.sleep(3000);
			if (KeywordAction.isDisplayed()) {
				KeywordAction.click();
				KeywordActionDelete.click();
				Thread.sleep(2000);
			}

			System.out.println(AlertMessage.getText());
			msg1 = AlertMessage.getText();

			return msg1;

		}

	}


