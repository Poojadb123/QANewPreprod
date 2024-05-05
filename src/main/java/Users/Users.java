package Users;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class Users extends BaseClass{
	//public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "Users";// Read the data from excel sheet1
	String sheetName1 = "UsersAgentRole";
//	String sheetName2 = "UploadMonoFile";
    Map<String, Object> customer1 = ref.exceldata(sheetName);

	Map<String, Map<String, String>> customer = ref.getExcelAsMap(sheetName);
	Map<String, Map<String, String>> customer2 = ref.getExcelAsMap(sheetName1);
	//Map<String, Map<String, String>> customer3 = ref.getExcelAsMap(sheetName2);
	int excelRows = ref.getrowCount();
	
//	Map<String ,String> Email = Map<String, String> customer.get("Email");// Enter Email
//	Map<String,String> FileName = Map<String,String> customer.get("FileName");
	;

	public Users(WebDriver driver) {
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

	@FindBy(xpath = "//div[contains(text(),'Administration')]")
	WebElement AdministrationTab;
	
	@FindBy(css = "#root > div > div.MuiDrawer-root.MuiDrawer-docked > div > div.MuiBox-root.css-16ueahe")
	WebElement SideBar;

	@FindBy(xpath = "//div[text()='Users']")
	WebElement UsersTab;

	@FindBy(xpath = "//a[text()='New User']")
	WebElement NewUserBtn;

	@FindBy(xpath = "//input[@name='firstName']")
	WebElement UserFirstName;

	@FindBy(xpath = "//form/div[1]/div[5]/div/p")
	WebElement FNameReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[7]/div/p")
	WebElement AFNameReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[8]/div/p")
	WebElement ALNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement UserLastName;

	@FindBy(xpath = "//form/div[1]/div[6]/div/p")
	WebElement LNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='email']")
	WebElement UserEmail;

	@FindBy(xpath = "//form/div[1]/div[8]/div/p")
	WebElement EmailReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[10]/div/p")
	WebElement AEmailReqFieldMsg;

	@FindBy(xpath = "//input[@name='contactNumber']")
	WebElement UserContactNo;

	@FindBy(xpath = "//form/div[1]/div[8]/div/p")
	WebElement ContactReqFieldMsg;

	@FindBy(xpath = "//input[@name='employeeId']")
	WebElement UserEmployeeId;

	@FindBy(xpath = "//form/div[1]/div[10]/div/p")
	WebElement EmpidReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[11]/div/p")
	WebElement DOJReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[12]/div/p")
	WebElement AEmpidReqFieldMsg;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement CancelBtn;

	@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	WebElement UserAlertMessage;

	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[9]/button")
	WebElement UserAction;

	@FindBy(xpath = "//div[3]/ul/li[1]")
	WebElement UserActionEdit;

	@FindBy(xpath = "//ul/li[1]")
	WebElement UserActionDisable;

	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;

	@FindBy(xpath = "//div[1]/div[7]/div/div/input")
	WebElement EditFistNameTxt;

	@FindBy(xpath = "//table/tbody/tr[1]/td[4]")
	WebElement UsersRecordOrg;

	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement UsersRecord;

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

	@FindBy(xpath = "//div/div/div/form/div/div[8]/div/p")
	WebElement OrgAddrReqFieldMsg;

	@FindBy(xpath = "//div/div[9]/div/label[1]/span[1]")
	WebElement AWSServiceCheckbox;

	@FindBy(xpath = "//div/div[9]/div/label[2]/span[1]")
	WebElement CustomAICheckbox;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement OrgUpdateBtn;

	@FindBy(xpath = "//div[1]/div[1]/div/div/input")
	WebElement OrgComapanyNameText;
	// search
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement UsersSearchBar;

	@FindBy(xpath = "//div[1]/div[2]/div/p")
	WebElement CustomerReqFieldMsg;

	@FindBy(xpath = "//div[1]/div[3]/div/p")
	WebElement RoleReqFieldMsg;

	@FindBy(xpath = "//div[1]/div[4]/div/p")
	WebElement qaReqFieldMsg;
	
	//process
	@FindBy(css = "body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > form > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3.css-1h77wgb > div:nth-child(4) > div > div > div.css-1wy0on6 > div > svg")
	WebElement SelectProcessField;
	
	@FindBy(xpath = "//div[contains(text(),'Select Process')]")
	WebElement SelectProcTxt;
	
	@FindBy(css = "#select-process")
	WebElement SelectProcessTxt;
	
	@FindBy(xpath = "//*[@id='menu-']/div[3]/ul/li[1]")
	WebElement SelectProcessaField;
	
	@FindBy(xpath = "//div[1]/div[5]/div/p")
	WebElement ManagerReqFieldMsg;
	
	@FindBy(xpath = "//div[1]/div[6]/div/p")
	WebElement ProcessReqFieldMsg;
	
	@FindBy(xpath = "//div/div[2]/div/div/button[3]")
	WebElement AgentTab;
	
	@FindBy(xpath = "//div/div/div/table/tbody/tr[1]/td[10]/button")
	WebElement AgentUserAction;
	
	@FindBy(xpath = "//button[text()='Upload']")
	WebElement UploadBtn;
	
	@FindBy(css = ".MuiAlert-message")
	WebElement MultiAlertMsg;
	
	//public String sorg = (String) customer1.get("SelectOrganisation");
	public String sorg;

	public void AddNewUser() throws InterruptedException, IOException {
		//String msg = null;
		Thread.sleep(5000);
		SideBar.click();
		Thread.sleep(5000);
		AdministrationTab.click();
		UsersTab.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		String ind;
		for (int e = 1; e < excelRows + 1; e++) {
			ind = Integer.toString(e);

			String sorg = (String) customer.get(ind).get("SelectOrganisation");
			String scus = (String) customer.get(ind).get("SelectCustomer");
			String srole = (String) customer.get(ind).get("SelectRole");
			String sprocess = (String) customer.get(ind).get("SelectProcess");
			String fname = (String) customer.get(ind).get("FirstName");
			String lname = (String) customer.get(ind).get("LastName");
			String email = (String) customer.get(ind).get("PEmail");
			String mob = (String) customer.get(ind).get("Mobile");
			String empid = (String) customer.get(ind).get("EmployeeID");
			String lang = (String) customer.get(ind).get("SelectLanguage");
			String doj = (String) customer.get(ind).get("DOJ");

			if (NewUserBtn.isDisplayed()) {
				Thread.sleep(3000);
				NewUserBtn.click();
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

				AddBtn.click();
				if (CustomerReqFieldMsg.isDisplayed()) {
					System.out.println(CustomerReqFieldMsg.getText());
				}

				// Select Customer
				Thread.sleep(8000);
				WebElement SCustomer = driver.findElement(By.cssSelector("#select-customer"));
				SCustomer.click();
				List<WebElement> CustomerList = driver.findElements(By.xpath("//*[@id='menu-customer']/div[3]/ul/li"));
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
				Thread.sleep(8000);
				AddBtn.click();
				if (RoleReqFieldMsg.isDisplayed()) {
					System.out.println(RoleReqFieldMsg.getText());
				}
				// select Role
				WebElement SRole = driver.findElement(By.cssSelector("#select-role"));
				SRole.click();
				List<WebElement> RoleList = driver.findElements(By.xpath("//*[@id='menu-role']/div[3]/ul/li"));
				if (SRole.isDisplayed()) {
					// State.click();
					int NoOfOrg = RoleList.size();
					int i = 0;
					while (i < NoOfOrg) {
						String RList = RoleList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (RList.contains(srole)) {
							RoleList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}

				Thread.sleep(5000);
				//AddBtn.click();
				//if (ProcessReqFieldMsg.isDisplayed()) {
				//	System.out.println(ProcessReqFieldMsg.getText());
				//}
				
				
				// selectProcess
			/*	WebElement SProcess = driver.findElement(By.cssSelector("//div[text()='Select Process']"));
				SProcess.click();
				List<WebElement> SelectProcessList = driver.findElements(By.xpath("//*[@role='combobox']"));
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
				}*/
				
				if (SelectProcTxt.isDisplayed()) {
		            Thread.sleep(15000);
		            SelectProcTxt.click();
		           // SelectProcessaField.click();
		            //Thread.sleep(10000);
		              //OrgTextBox.click();
		            Thread.sleep(15000);
		            Actions act = new Actions(driver);
		            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();
				}
				// First Name
				if (UserFirstName.isDisplayed()) {
					UserFirstName.click();
					AddBtn.click();
				}
				if (FNameReqFieldMsg.isDisplayed()) {
					FNameReqFieldMsg.getText();
					UserFirstName.sendKeys(" ");
					Thread.sleep(6000);
					if (FNameReqFieldMsg.isDisplayed()) {
						System.out.println(FNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserFirstName.sendKeys("a");
					Thread.sleep(6000);
					if (FNameReqFieldMsg.isDisplayed()) {
						System.out.println(FNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserFirstName.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (FNameReqFieldMsg.isDisplayed()) {
						System.out.println(FNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserFirstName.sendKeys("1111");
					if (FNameReqFieldMsg.isDisplayed()) {
						System.out.println(FNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserFirstName.sendKeys(fname);
				}
				// lastname
				if (UserLastName.isDisplayed()) {
					UserLastName.click();
					AddBtn.click();
				}
				if (LNameReqFieldMsg.isDisplayed()) {
					LNameReqFieldMsg.getText();
					UserLastName.sendKeys(" ");
					Thread.sleep(6000);
					if (LNameReqFieldMsg.isDisplayed()) {
						System.out.println(LNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserLastName.sendKeys("a");
					Thread.sleep(6000);
					if (LNameReqFieldMsg.isDisplayed()) {
						System.out.println(LNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserLastName.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (LNameReqFieldMsg.isDisplayed()) {
						System.out.println(LNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserLastName.sendKeys("1111");
					if (LNameReqFieldMsg.isDisplayed()) {
						System.out.println(LNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserLastName.sendKeys(lname);
				}
				//Select Language
				
				Thread.sleep(3000);
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

				}
				// email
				if (UserEmail.isDisplayed()) {
					UserEmail.click();
					AddBtn.click();
				}
				if (EmailReqFieldMsg.isDisplayed()) {
					EmailReqFieldMsg.getText();
					UserEmail.sendKeys(" ");
					Thread.sleep(6000);
					if (EmailReqFieldMsg.isDisplayed()) {
						System.out.println(EmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserEmail.sendKeys("a");
					Thread.sleep(6000);
					if (EmailReqFieldMsg.isDisplayed()) {
						System.out.println(EmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserEmail.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (EmailReqFieldMsg.isDisplayed()) {
						System.out.println(EmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserEmail.sendKeys("1111");
					if (EmailReqFieldMsg.isDisplayed()) {
						System.out.println(EmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserEmail.sendKeys(email);
				}
				// mobile
				if (UserContactNo.isDisplayed()) {
					// UserContactNo.click();
					// AddBtn.click();

					/*
					 * if (ContactReqFieldMsg.isDisplayed()) { ContactReqFieldMsg.getText();
					 * UserContactNo.sendKeys(" "); Thread.sleep(6000); if
					 * (ContactReqFieldMsg.isDisplayed()) {
					 * System.out.println(ContactReqFieldMsg.getText());
					 * UserContactNo.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					 * Thread.sleep(3000); } UserContactNo.sendKeys("a"); Thread.sleep(6000); if
					 * (ContactReqFieldMsg.isDisplayed()) {
					 * System.out.println(ContactReqFieldMsg.getText());
					 * UserContactNo.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					 * Thread.sleep(3000); AddBtn.click(); }
					 * UserContactNo.sendKeys("*&(^(*)@@$&%%^$###"); Thread.sleep(5000); if
					 * (ContactReqFieldMsg.isDisplayed()) {
					 * System.out.println(ContactReqFieldMsg.getText());
					 * UserContactNo.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					 * Thread.sleep(3000); AddBtn.click(); } Thread.sleep(5000);
					 * UserContactNo.sendKeys("1111"); if (ContactReqFieldMsg.isDisplayed()) {
					 * System.out.println(ContactReqFieldMsg.getText());
					 * UserContactNo.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					 * Thread.sleep(3000); AddBtn.click(); }
					 */
					Thread.sleep(5000);
					UserContactNo.sendKeys(mob);
				}
				Thread.sleep(3000);
				// employeeid
				if (UserEmployeeId.isDisplayed()) {
					UserEmployeeId.click();
					AddBtn.click();
				}
				if (EmpidReqFieldMsg.isDisplayed()) {
					EmpidReqFieldMsg.getText();
					Thread.sleep(3000);
					UserEmployeeId.sendKeys(empid);
				}

				Thread.sleep(8000);
				
				// select DOJ
				Thread.sleep(3000);
				AddBtn.click();
				if (DOJReqFieldMsg.isDisplayed()) {
					System.out.println(DOJReqFieldMsg.getText());
				}

				WebElement SCalender = driver.findElement(By.xpath("//form/div[1]/div[11]/div/div/input"));
				SCalender.click();
				List<WebElement> SelectCalenderList = driver
						.findElements(By.cssSelector(".MuiButtonBase-root.MuiPickersDay-root.MuiPickersDay-dayWithMargin"));
				if (SCalender.isDisplayed()) {
					// State.click();
					int NoOfPro = SelectCalenderList.size();
					int i = 0;
					while (i < NoOfPro) {
						String PList = SelectCalenderList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (PList.equalsIgnoreCase(doj)) {
							SelectCalenderList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				Thread.sleep(4000);

				// upload voice
				//driver.findElement(By.xpath("//button[text()='Upload Voice (optional)']")).click();// button[text()='Upload
																									// Voice
																									// (optional)']
				//Thread.sleep(4000);
				//Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\WaveFile.exe");
				//Thread.sleep(8000);

				// Thread.sleep(6000);
				// upload profile picture
				//driver.findElement(By.xpath("//button[text()='Upload Profile Picture (optional)']")).click();// button[text()='Upload
																												// Voice
																												// (optional)']
				//Thread.sleep(6000);
				//Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\ImageFile.exe");
				Thread.sleep(9000);

				AddBtn.click();
				Thread.sleep(20000);
				//if (UsersRecord.isDisplayed()) {
				//	System.out.println(UsersRecord.getText());
				//}

				//if (UsersRecordOrg.isDisplayed()) {
					//msg = UsersRecordOrg.getText();
				//}
			}
		}
		//return msg;
	}
	
	
	public String AddUser_AgentRole() throws InterruptedException, IOException {
		String msg = null;
			
		Thread.sleep(5000);
		SideBar.click();
		Thread.sleep(5000);
		AdministrationTab.click();
		UsersTab.click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		String ind;
		System.out.println(excelRows);
		for (int e = 1; e < excelRows +1; e++) {
			ind = Integer.toString(e);

			
			 sorg = (String) customer2.get(ind).get("SelectOrganisation");
			String scus = (String) customer2.get(ind).get("SelectCustomer");
			String srole = (String) customer2.get(ind).get("SelectRole");
			String sprocess = (String) customer2.get(ind).get("SelectProcess");
			String fname = (String) customer2.get(ind).get("FirstName");
			String lname = (String) customer2.get(ind).get("LastName");
			String email = (String) customer2.get(ind).get("PEmail");
			String mob = (String) customer2.get(ind).get("Mobile");
			String empid = (String) customer2.get(ind).get("EmployeeID");
			String lang = (String) customer2.get(ind).get("SelectLanguage");
			String qrole = (String) customer2.get(ind).get("SelectQA");
			String smanger = (String) customer2.get(ind).get("SelectManager");
			String doj = (String) customer2.get(ind).get("DOJ");

			if (NewUserBtn.isDisplayed()) {
				Thread.sleep(3000);
				NewUserBtn.click();
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
						if (OList.contains(sorg)) {
							OrgList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
				Thread.sleep(3000);

				AddBtn.click();
				if (CustomerReqFieldMsg.isDisplayed()) {
					System.out.println(CustomerReqFieldMsg.getText());
				}

				// Select Customer
				Thread.sleep(8000);
				WebElement SCustomer = driver.findElement(By.cssSelector("#select-customer"));
				SCustomer.click();
				List<WebElement> CustomerList = driver.findElements(By.xpath("//html/body/div[3]/div[3]/ul/li"));
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
				Thread.sleep(8000);
				AddBtn.click();
				if (RoleReqFieldMsg.isDisplayed()) {
					System.out.println(RoleReqFieldMsg.getText());
				}
				// select Role
				WebElement SRole = driver.findElement(By.cssSelector("#select-role"));
				SRole.click();
				List<WebElement> RoleList = driver.findElements(By.xpath("//*[@id='menu-role']/div[3]/ul/li"));
				if (SRole.isDisplayed()) {
					// State.click();
					int NoOfOrg = RoleList.size();
					int i = 0;
					while (i < NoOfOrg) {
						String RList = RoleList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (RList.contains(srole)) {
							RoleList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}

				Thread.sleep(5000);
				AddBtn.click();
				if (qaReqFieldMsg.isDisplayed()) {
					System.out.println(qaReqFieldMsg.getText());
				}
				
				//select Qa
				WebElement QARole = driver.findElement(By.cssSelector("#select-qa"));
				QARole.click();
				List<WebElement> qaRoleList = driver.findElements(By.xpath("//html/body/div[3]/div[3]/ul/li"));
				if (QARole.isDisplayed()) {
					// State.click();
					int NoOfOrg = qaRoleList.size();
					int i = 0;
					while (i < NoOfOrg) {
						String RList = qaRoleList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (RList.contains(qrole)) {
							qaRoleList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}

				Thread.sleep(5000);
				AddBtn.click();
			    if (ManagerReqFieldMsg.isDisplayed()) {
				System.out.println(ManagerReqFieldMsg.getText());
				}
			    
			  //select Manager
				WebElement MRole = driver.findElement(By.cssSelector("#select-manager"));
				MRole.click();
				List<WebElement> MRoleList = driver.findElements(By.xpath("//body/div[3]/div[3]/ul/li"));
				if (MRole.isDisplayed()) {
					// State.click();
					int NoOfOrg = MRoleList.size();
					int i = 0;
					while (i < NoOfOrg) {
						String RList = MRoleList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (RList.contains(smanger)) {
							MRoleList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
				Thread.sleep(5000);
				AddBtn.click();
			    if (ProcessReqFieldMsg.isDisplayed()) {
				System.out.println(ProcessReqFieldMsg.getText());
				}

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
					Thread.sleep(8000);
					
			/*	if (SelectProcessTxt.isDisplayed()) {
		            Thread.sleep(15000);
		        
		            SelectProcessField.click();
		            //Thread.sleep(10000);
		              //OrgTextBox.click();
		            Thread.sleep(15000);
		            Actions act = new Actions(driver);
		            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();
				}*/
				// First Name
				if (UserFirstName.isDisplayed()) {
					UserFirstName.click();
					AddBtn.click();
				}
				if (AFNameReqFieldMsg.isDisplayed()) {
					AFNameReqFieldMsg.getText();
					UserFirstName.sendKeys(" ");
					Thread.sleep(6000);
					if (AFNameReqFieldMsg.isDisplayed()) {
						System.out.println(AFNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserFirstName.sendKeys("a");
					Thread.sleep(6000);
					if (AFNameReqFieldMsg.isDisplayed()) {
						System.out.println(AFNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserFirstName.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (AFNameReqFieldMsg.isDisplayed()) {
						System.out.println(AFNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserFirstName.sendKeys("1111");
					if (AFNameReqFieldMsg.isDisplayed()) {
						System.out.println(AFNameReqFieldMsg.getText());
						UserFirstName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserFirstName.sendKeys(fname);
				}
				// lastname
				if (UserLastName.isDisplayed()) {
					UserLastName.click();
					AddBtn.click();
				}
				if (ALNameReqFieldMsg.isDisplayed()) {
					ALNameReqFieldMsg.getText();
					UserLastName.sendKeys(" ");
					Thread.sleep(6000);
					if (ALNameReqFieldMsg.isDisplayed()) {
						System.out.println(ALNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserLastName.sendKeys("a");
					Thread.sleep(6000);
					if (ALNameReqFieldMsg.isDisplayed()) {
						System.out.println(ALNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserLastName.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (ALNameReqFieldMsg.isDisplayed()) {
						System.out.println(ALNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserLastName.sendKeys("1111");
					if (ALNameReqFieldMsg.isDisplayed()) {
						System.out.println(ALNameReqFieldMsg.getText());
						UserLastName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserLastName.sendKeys(lname);
				}
				//Select Language
				
				Thread.sleep(3000);
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

				}
				// email
				if (UserEmail.isDisplayed()) {
					UserEmail.click();
					AddBtn.click();
				}
				if (AEmailReqFieldMsg.isDisplayed()) {
					AEmailReqFieldMsg.getText();
					UserEmail.sendKeys(" ");
					Thread.sleep(6000);
					if (AEmailReqFieldMsg.isDisplayed()) {
						System.out.println(AEmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
					}
					UserEmail.sendKeys("a");
					Thread.sleep(6000);
					if (AEmailReqFieldMsg.isDisplayed()) {
						System.out.println(AEmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					UserEmail.sendKeys("*&(^(*)@@$&%%^$###");
					Thread.sleep(5000);
					if (AEmailReqFieldMsg.isDisplayed()) {
						System.out.println(AEmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserEmail.sendKeys("1111");
					if (AEmailReqFieldMsg.isDisplayed()) {
						System.out.println(AEmailReqFieldMsg.getText());
						UserEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						AddBtn.click();
					}
					Thread.sleep(5000);
					UserEmail.sendKeys(email);
				}
				// mobile
				if (UserContactNo.isDisplayed()) {
					Thread.sleep(5000);
					UserContactNo.sendKeys(mob);
				}
				Thread.sleep(3000);
				// employeeid
				if (UserEmployeeId.isDisplayed()) {
					UserEmployeeId.click();
					AddBtn.click();
				}
				if (AEmpidReqFieldMsg.isDisplayed()) {
					AEmpidReqFieldMsg.getText();
					Thread.sleep(3000);
					UserEmployeeId.sendKeys(empid);
				}

				Thread.sleep(8000);
				
				// select DOJ
				Thread.sleep(3000);
		
				WebElement SCalender = driver.findElement(By.xpath("//form/div[1]/div[13]/div/div/input"));
				SCalender.click();
				List<WebElement> SelectCalenderList = driver
						.findElements(By.cssSelector(".MuiButtonBase-root.MuiPickersDay-root.MuiPickersDay-dayWithMargin"));
				if (SCalender.isDisplayed()) {
					// State.click();
					int NoOfPro = SelectCalenderList.size();
					int i = 0;
					while (i < NoOfPro) {
						String PList = SelectCalenderList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (PList.equalsIgnoreCase(doj)) {
							SelectCalenderList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}
				}
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				Thread.sleep(4000);
				// upload voice
				//driver.findElement(By.xpath("//button[text()='Upload Voice (optional)']")).click();// button[text()='Upload
																									// Voice
																									// (optional)']
				//Thread.sleep(4000);
				//Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\WaveFile.exe");
				//Thread.sleep(8000);

				// Thread.sleep(6000);
				// upload profile picture
				//driver.findElement(By.xpath("//button[text()='Upload Profile Picture (optional)']")).click();// button[text()='Upload
																												// Voice
																												// (optional)']
				//Thread.sleep(4000);
				//Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\ImageFile.exe");
				//Thread.sleep(8000);

				AddBtn.click();
				Thread.sleep(1000);
				 AgentTab.click();
				if (UsersRecord.isDisplayed()) {
					System.out.println(UsersRecord.getText());
				}

				if (UsersRecordOrg.isDisplayed()) {
					msg = UsersRecordOrg.getText();
				}
			}
		}
		return msg;
	}
	
	
	
	   public String MonoCalls() throws InterruptedException, IOException {
		   String msg= null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		//String Fname = (String) customer.get(ind).get("FileName");

		Thread.sleep(5000);
	//	AdministrationTab.click();
	//	UsersTab.click();
		
		for (int e = 1; e <= 2; e++)
		{
				
			if(AgentTab.isDisplayed())
			{
				AgentTab.click();
			}
			if (UsersRecord.isDisplayed()) {
				System.out.println(UsersRecord.getText());
				
			}
			String uploadIcon = "//div/div/table/tbody/tr["+e+"]/td[11]/button";
			 WebElement button = driver.findElement(By.xpath(uploadIcon));
			 
			 Thread.sleep(3000);
			 button.click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[text()='Upload User Voice']")).click();
			 Thread.sleep(9000);
			 Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\AayeshaFile.exe");
				
			  Thread.sleep(9000);
				
			 UploadBtn.click();
			 Thread.sleep(8000);
			 
		}
	   
		
	/*	if(AgentTab.isDisplayed())
		{
			AgentTab.click();
		}
		if (UsersRecord.isDisplayed()) {
			System.out.println(UsersRecord.getText());
			
		}
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div/table/tbody/tr[1]/td[11]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Upload User Voice']")).click();
		Thread.sleep(9000);
		Runtime.getRuntime().exec("D:\\SeleniumTestingNew\\IntelliConvo\\Document\\AayeshaFile.exe");
		
		Thread.sleep(9000);
		
		UploadBtn.click();
		Thread.sleep(8000);*/
		
		//alert msg
	/*	if(MultiAlertMsg.isDisplayed())
		{
			msg=MultiAlertMsg.getText();
			System.out.println(MultiAlertMsg.getText());
		}
		return msg;*/
		if (UsersRecordOrg.isDisplayed()) {
			msg = UsersRecordOrg.getText();
		}
		
		
		
		return msg;
		
	
		
	}
	

	public String editUser() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		AdministrationTab.click();
		UsersTab.click();
		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(12000);
		js.executeScript("window.scrollBy(250,0)");
		
	      AgentTab.click();
		/*  WebElement horizontalSlider = driver.findElement(By.xpath("//div[2]/div/div/div[3]/div[3]/div/div[2]"));
		  Actions actions = new Actions(driver);
		  actions.clickAndHold(horizontalSlider).moveByOffset(100, 0).release().perform();
		  Thread.sleep(8000);
		  
		 // js.executeScript("window.scrollBy(0, 0);");
		  Thread.sleep(8000);
		  js.executeScript("window.scrollBy(0, 100);");*/
	      js.executeScript("document.documentElement.scrollLeft = 10000;");
		  
		if (AgentUserAction.isDisplayed()) {
			AgentUserAction.click();
			UserActionEdit.click();
		}
			Thread.sleep(2000);
			// companyName
			if (EditActionWindowTxt.isDisplayed()) {
				if (EditFistNameTxt.isDisplayed()) {
					EditFistNameTxt.click();
					EditFistNameTxt.sendKeys("a");
					OrgUpdateBtn.click();
				}
			}
			Thread.sleep(12000);
			//driver.navigate().refresh();
			//Thread.sleep(5000);
			if (UsersRecord.isDisplayed()) {
				System.out.println(UsersRecord.getText());
			}
			Thread.sleep(7000);
			if (UsersRecordOrg.isDisplayed()) {
				msg1 = UsersRecordOrg.getText();
			}

		
		return msg1;
	}

/*	public String UsersSearch() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		// String ser = (String) customer.get("Search");

		WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder='Search by name']"));
		SearchBar.click();
		SearchBar.sendKeys("Radha");
		Thread.sleep(3000);
		List<WebElement> BussList = driver.findElements(By.xpath(
				"//body/div/div/div[2]/div/div/div[2]/div[3]/div/div[1]/div[2]/div/div/div/div/table/tbody/tr/td[3]"));
		// System.out.println(SList);
		for (int i = 0; i < BussList.size(); i++) {
			String SList = BussList.get(i).getText();
			System.out.println(SList);
			Assert.assertTrue(SList.contains("Radha"));
			// BussList.get(i).click();
			// Thread.sleep(5000);
			// break;

			// }
			// SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			// Assert.assertTrue(SList.contains("STUser"));
		}
		return sheetName;

	}*/

	public String DeleteUser() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		

		// OrgMgmtTab.click();
		// Thread.sleep(3000);
		if (UserAction.isDisplayed()) {
			UserAction.click();
			UserActionDisable.click();
			Thread.sleep(2000);
			System.out.println(UserAlertMessage.getText());
			msg1 = UserAlertMessage.getText();
			Thread.sleep(1000);
		}

		return msg1;

	}

	
/*	public String UsersSearch() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
	
	
		if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(sorg);
			System.out.println("Search is working using Organisation name");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		
		 if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(scus);
			System.out.println("Search is working using Customer Organisation name");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		 
		 if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(email);
			System.out.println("Search is working using Email");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		 
		 if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(email);
			System.out.println("Search is working using Email");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		 
		 
		 if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(empid);
			System.out.println("Search is working using Employee Id");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		 
		 
		 if (UsersSearchBar.isDisplayed()) 
		   {
			UsersSearchBar.click();
			Thread.sleep(3000);
			UsersSearchBar.sendKeys(fname);
			System.out.println("Search is working using User Name");
			UsersSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(5000);	
		   }
		 
				
}*/
}


