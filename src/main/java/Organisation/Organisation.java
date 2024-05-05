package Organisation;

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
import org.testng.Assert;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class Organisation extends BaseClass {
	//public WebDriver driver;
	UtilityClass ref = new UtilityClass();
	String sheetName = "Organisation";// Read the data from excel sheet1
	Map<String, Object> customer = ref.exceldata(sheetName);

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public Organisation(WebDriver driver) {
		// super(driver);
		this.driver = driver;
	//	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement Email_A;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Pass_A;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement Btn_A;
	
	@FindBy(xpath = "//input[@name='remember']")
	WebElement Checkbox;

	@FindBy(xpath = "//div[contains(text(),'Administration')]")
	WebElement AdministrationTab;

	@FindBy(xpath = "//div[contains(text(),'Organisation')]")
	WebElement OrganisationTab;

	@FindBy(xpath = "//a[text()='New Organisation']")
	WebElement OrganisationBtn;

	@FindBy(xpath = "//input[@name='OrganisationName']")
	WebElement OrganisationName;

	@FindBy(xpath = "//div/div/div/form/div/div[1]/div/p")
	WebElement OrgNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='OrganisationEmail']")
	WebElement OrganisationEmail;

	@FindBy(xpath = "//div/div/div/form/div/div[2]/div/p")
	WebElement OrgEmailReqFieldMsg;

	@FindBy(xpath = "//input[@name='OrganisationMobile']")
	WebElement OrganisationMobile;

	@FindBy(xpath = "//div/div/div/form/div/div[3]/div/p")
	WebElement OrgMobReqFieldMsg;

	@FindBy(xpath = "//input[@name='OrganisationState']")
	WebElement OrganisationState;

	@FindBy(xpath = "//div/div/div/form/div/div[4]/div/p")
	WebElement OrgStateReqFieldMsg;

	@FindBy(xpath = "//input[@name='OrganisationCity']")
	WebElement OrganisationCity;

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

	@FindBy(xpath = "//div/div/div/form/div/div[8]/div/p")
	WebElement OrgAddrReqFieldMsg;

	@FindBy(xpath = "//div/div[9]/div/label[1]/span[1]")
	WebElement AWSServiceCheckbox;

	@FindBy(xpath = "//div/div[9]/div/label[2]/span[1]")
	WebElement CustomAICheckbox;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement CancelBtn;

	@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
	WebElement OrgAlertMessage;
	
	@FindBy(xpath = "//div/table/tbody/tr[1]/td[7]/button")
	WebElement OrgAction;
	
	@FindBy(xpath = "//div[3]/ul/li[1]")
	WebElement OrgActionEdit;
	
	@FindBy(xpath = "//ul/li[1]")
	WebElement OrgActionDisable;
	
	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;
	
	@FindBy(xpath = "//button[text()='Update']")
	WebElement OrgUpdateBtn;
	
	@FindBy(xpath = "//div[1]/div[1]/div/div/input")
	WebElement OrgComapanyNameText;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement OrgRecord;

	@FindBy(xpath = "//table/tbody/tr[1]/th")
    WebElement RecordOrgName;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]/td[4]")
    WebElement RecordCityName;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]/td[5]")
    WebElement RecordStateName;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]/td[6]")
    WebElement RecordCountryeName;
	
	@FindBy(xpath = "//div/div/div/div/table/tbody/tr[1]")
	WebElement UpdateOrgRecord;
	
	@FindBy(xpath = "//div/div/div/form/div/div[7]/div/p")
	WebElement CountryReqFieldMsg;
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement UpdateAddress;
	
	@FindBy(xpath = "//*[@id='root']/div/div[1]/div/div[1]/button")
	WebElement SideBarToggleBtn;
	
  //  @FindBy(xpath = "//div/form/div[1]/div[8]/div/div/textarea[1]")
  //  WebElement UpdateAddress;
	//search
	
	@FindBy(xpath = "//input[@placeholder='Search Organisation']")
	WebElement OrgSearchBar;
	
	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[3]")
	WebElement OrgContactEmailData;
	
	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[2]")
	WebElement OrgContactNoData;
	
	@FindBy(xpath = "//div/div/div/table/tbody/tr[1]/td[4]")
	WebElement OrgCityData;

	public String name = (String) customer.get("OrganisationName");
	
	public String AddNewOrganisation() throws InterruptedException {
		String msg = null;
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);

		String name = (String) customer.get("OrganisationName");
		String orgemail = (String) customer.get("OrgEmail");
		String num = (String) customer.get("Contact");
		String state = (String) customer.get("State");
		String city = (String) customer.get("City");
		String pincode = (String) customer.get("Zip");
		String addr = (String) customer.get("Address");
		String ct = (String) customer.get("Country");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		SideBarToggleBtn.click();
		Thread.sleep(5000);
		AdministrationTab.click();
		OrganisationTab.click();
		Thread.sleep(5000);

		if (OrganisationBtn.isDisplayed()) {
			Thread.sleep(3000);
			OrganisationBtn.click();
			Thread.sleep(8000);
			// Name

			if (OrganisationName.isDisplayed()) {
				OrganisationName.click();
				AddBtn.click();
			}
			if (OrgNameReqFieldMsg.isDisplayed()) {

				OrgNameReqFieldMsg.getText();
				OrganisationName.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgNameReqFieldMsg.isDisplayed()) {
					System.out.println(OrgNameReqFieldMsg.getText());
					OrganisationName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();

				}
				OrganisationName.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgNameReqFieldMsg.isDisplayed()) {
					System.out.println(OrgNameReqFieldMsg.getText());
					OrganisationName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationName.sendKeys("*********************");
				if (OrgNameReqFieldMsg.isDisplayed()) {
					System.out.println(OrgNameReqFieldMsg.getText());
					OrganisationName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationName.sendKeys("111111111111111");
				if (OrgNameReqFieldMsg.isDisplayed()) {
					System.out.println(OrgNameReqFieldMsg.getText());
					OrganisationName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationName.sendKeys("a");
				if (OrgNameReqFieldMsg.isDisplayed()) {
					System.out.println(OrgNameReqFieldMsg.getText());
					OrganisationName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationName.sendKeys(name);
			}
			// Email if
			if (OrganisationEmail.isDisplayed()) {
				OrganisationEmail.click();
				AddBtn.click();
			}
			if (OrgEmailReqFieldMsg.isDisplayed()) {
				OrgEmailReqFieldMsg.getText();
				OrganisationEmail.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgEmailReqFieldMsg.isDisplayed()) {
					System.out.println(OrgEmailReqFieldMsg.getText());
					OrganisationEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();

				}
				OrganisationEmail.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgEmailReqFieldMsg.isDisplayed()) {
					System.out.println(OrgEmailReqFieldMsg.getText());
					OrganisationEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationEmail.sendKeys("abc@@");
				if (OrgEmailReqFieldMsg.isDisplayed()) {
					System.out.println(OrgEmailReqFieldMsg.getText());
					OrganisationEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationEmail.sendKeys("111111111111111");
				if (OrgEmailReqFieldMsg.isDisplayed()) {
					System.out.println(OrgEmailReqFieldMsg.getText());
					OrganisationEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationEmail.sendKeys("jjjjjjjjjjjjjjjjjjjiiiiiiiiiii");
				if (OrgEmailReqFieldMsg.isDisplayed()) {
					System.out.println(OrgEmailReqFieldMsg.getText());
					OrganisationEmail.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationEmail.sendKeys(orgemail);
			} // number if
			if (OrganisationMobile.isDisplayed()) {
				OrganisationMobile.click();
				AddBtn.click();
			}
			if (OrgMobReqFieldMsg.isDisplayed()) {
				OrgMobReqFieldMsg.getText();
				OrganisationMobile.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgMobReqFieldMsg.isDisplayed()) {
					System.out.println(OrgMobReqFieldMsg.getText());
					OrganisationMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();

				}
				OrganisationMobile.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgMobReqFieldMsg.isDisplayed()) {
					System.out.println(OrgMobReqFieldMsg.getText());
					OrganisationMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationMobile.sendKeys("abc@@");
				if (OrgMobReqFieldMsg.isDisplayed()) {
					System.out.println(OrgMobReqFieldMsg.getText());
					OrganisationMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationMobile.sendKeys("1111111111111111111111111111111");
				if (OrgMobReqFieldMsg.isDisplayed()) {
					System.out.println(OrgMobReqFieldMsg.getText());
					OrganisationMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationMobile.sendKeys("jjjjjjjjjjjjjjjjjjjiiiiiiiiiii");
				if (OrgMobReqFieldMsg.isDisplayed()) {
					System.out.println(OrgMobReqFieldMsg.getText());
					OrganisationMobile.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationMobile.sendKeys(num);
			}
			// State if
			if (OrganisationState.isDisplayed()) {
				OrganisationState.click();
				AddBtn.click();
			}
			if (OrgStateReqFieldMsg.isDisplayed()) {
				OrgStateReqFieldMsg.getText();
				OrganisationState.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgStateReqFieldMsg.isDisplayed()) {
					System.out.println(OrgStateReqFieldMsg.getText());
					OrganisationState.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();

				}
				/*OrganisationState.sendKeys("a");
				Thread.sleep(6000);
				if (OrgStateReqFieldMsg.isDisplayed()) {
					System.out.println(OrgStateReqFieldMsg.getText());
					OrganisationState.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}*/
				OrganisationState.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgStateReqFieldMsg.isDisplayed()) {
					System.out.println(OrgStateReqFieldMsg.getText());
					OrganisationState.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationState.sendKeys("1111111111111111111111111111111");
				if (OrgStateReqFieldMsg.isDisplayed()) {
					System.out.println(OrgStateReqFieldMsg.getText());
					OrganisationState.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationState.sendKeys(state);
			}
			// city
			if (OrganisationCity.isDisplayed()) {
				OrganisationCity.click();
				AddBtn.click();
			}
			if (OrgCityReqFieldMsg.isDisplayed()) {
				OrgCityReqFieldMsg.getText();
				OrganisationCity.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgCityReqFieldMsg.isDisplayed()) {
					System.out.println(OrgCityReqFieldMsg.getText());
					OrganisationCity.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();

				}
				/*OrganisationCity.sendKeys("a");
				Thread.sleep(6000);
				if (OrgCityReqFieldMsg.isDisplayed()) {
					System.out.println(OrgCityReqFieldMsg.getText());
					OrganisationCity.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}*/
				OrganisationCity.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgCityReqFieldMsg.isDisplayed()) {
					System.out.println(OrgCityReqFieldMsg.getText());
					OrganisationCity.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationCity.sendKeys("1111111111111111111111111111111");
				if (OrgCityReqFieldMsg.isDisplayed()) {
					System.out.println(OrgCityReqFieldMsg.getText());
					OrganisationCity.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationCity.sendKeys(state);
			}
			// pincode if
			if (OrganisationPincode.isDisplayed()) {
				OrganisationPincode.click();
				AddBtn.click();
			}
			if (OrgPinReqFieldMsg.isDisplayed()) {
				OrgPinReqFieldMsg.getText();
				OrganisationPincode.sendKeys(" ");
				Thread.sleep(6000);
				if (OrgPinReqFieldMsg.isDisplayed()) {
					System.out.println(OrgPinReqFieldMsg.getText());
					OrganisationPincode.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
				}
				OrganisationPincode.sendKeys("a");
				Thread.sleep(6000);
				if (OrgPinReqFieldMsg.isDisplayed()) {
					System.out.println(OrgPinReqFieldMsg.getText());
					OrganisationPincode.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				OrganisationPincode.sendKeys("*&(^(*)@@$&%%^$###");
				Thread.sleep(5000);
				if (OrgPinReqFieldMsg.isDisplayed()) {
					System.out.println(OrgPinReqFieldMsg.getText());
					OrganisationPincode.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationPincode.sendKeys("1111");
				if (OrgPinReqFieldMsg.isDisplayed()) {
					System.out.println(OrgPinReqFieldMsg.getText());
					OrganisationPincode.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					AddBtn.click();
				}
				Thread.sleep(5000);
				OrganisationPincode.sendKeys(pincode);
			}

			// country
			AddBtn.click();
			if(CountryReqFieldMsg.isDisplayed()) {
				System.out.println(CountryReqFieldMsg.getText());
			}
			
			Thread.sleep(3000);
			WebElement Country = driver.findElement(By.cssSelector("#mui-component-select-OrganisationCountry"));//#mui-component-select-OrganisationCountry
			Country.click();
			List<WebElement> CountryList = driver.findElements(By.xpath("//*[@id='menu-OrganisationCountry']/div[3]/ul/li"));
			if (Country.isDisplayed()) {
				// State.click();
				int NoOfState = CountryList.size();
				int i = 0;
				while (i < NoOfState) {
					String SList = CountryList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (SList.contains(ct)) {
						CountryList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}
			Thread.sleep(3000);
			// addr
			js.executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(3000);
			if (OrganisationAddress.isDisplayed()) {
				OrganisationAddress.click();
				AddBtn.click();
			}
			Thread.sleep(3000);
			if (OrgAddrReqFieldMsg.isDisplayed()) {
				System.out.println(OrgAddrReqFieldMsg.getText());
				OrganisationAddressText.sendKeys(" ");
				Thread.sleep(6000);
			}
			if (OrgAddrReqFieldMsg.isDisplayed()) {
				System.out.println(OrgAddrReqFieldMsg.getText());
				OrganisationAddressText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				AddBtn.click();
			}

			OrganisationAddressText.sendKeys("a");
			Thread.sleep(6000);
			if (OrgAddrReqFieldMsg.isDisplayed()) {
				System.out.println(OrgAddrReqFieldMsg.getText());
				OrganisationAddressText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				AddBtn.click();
			}
			OrganisationAddressText.sendKeys("*&(^(*)@@$&%%^$");
			Thread.sleep(5000);
			if (OrgAddrReqFieldMsg.isDisplayed()) {
				System.out.println(OrgAddrReqFieldMsg.getText());
				OrganisationAddressText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				AddBtn.click();
			}
			Thread.sleep(5000);
			OrganisationAddressText.sendKeys("11");
			if (OrgAddrReqFieldMsg.isDisplayed()) {
				System.out.println(OrgAddrReqFieldMsg.getText());
				OrganisationAddressText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				AddBtn.click();
			}
			Thread.sleep(5000);
			OrganisationAddressText.sendKeys(addr);
		}

		Thread.sleep(5000);
		AddBtn.click();
		Thread.sleep(8000);
		if (OrgRecord.isDisplayed()) {
			System.out.println(OrgRecord.getText());
		}
		if(RecordOrgName.isDisplayed()) {
			msg = RecordOrgName.getText();
		}

		return msg;

	}
	
	public String editOrganisation() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		Thread.sleep(5000);
		AdministrationTab.click();
		OrganisationTab.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(12000);
		js.executeScript("window.scrollBy(1000,0)");
		js.executeScript("window.scrollTo(document.body.scrollWidth, 0)");
		Thread.sleep(12000);
		 js.executeScript("window.scrollTo(0, 0);");//Top
		if (OrgAction.isDisplayed()) {
			OrgAction.click();
			OrgActionEdit.click();
			Thread.sleep(6000);
			// companyName
			if (EditActionWindowTxt.isDisplayed()) {
				UpdateAddress.sendKeys("Vikass Nagar");
				//OrgUpdateBtn.click();
			}
			OrgUpdateBtn.click();
			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(8000);
			if (UpdateOrgRecord.isDisplayed()) {
				Thread.sleep(12000);
				System.out.println(UpdateOrgRecord.getText());
			}
			if(RecordOrgName.isDisplayed()) {
				System.out.println(RecordOrgName.getText());
				msg1 = RecordOrgName.getText();
			}

		}
		return msg1;

	}
	
	public String DeleteOrg() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

		//OrgMgmtTab.click();
		Thread.sleep(3000);
		if (OrgAction.isDisplayed()) {
			OrgAction.click();
			OrgActionDisable.click();
			Thread.sleep(2000);
		}
		
			System.out.println(OrgAlertMessage.getText());
			msg1 = OrgAlertMessage.getText();
		
		return msg1;

	}  
	
	public String OrgSearch() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
	
	String num = (String) customer.get("Contact");
	String orgemail = (String) customer.get("OrgEmail");
	String state = (String) customer.get("State");
	String city = (String) customer.get("City");
	

	Thread.sleep(5000);
	AdministrationTab.click();
	OrganisationTab.click();
	Thread.sleep(5000);

	WebElement SearchBar = driver.findElement(By.xpath("//input[@placeholder='Search Organisation']"));
	SearchBar.click();
	SearchBar.sendKeys("Netflix");
	Thread.sleep(6000);
	List<WebElement> BussList = driver.findElements(By.xpath("//div/div/div/table/tbody/tr/th"));
	//System.out.println(SList);
	for(int i=0 ;i<BussList.size();i++)
	{
		String SList=BussList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains("Netflix"));
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys(name);
	Thread.sleep(6000);
	List<WebElement> OrgNameList = driver.findElements(By.xpath("//div/div/div/table/tbody/tr/th"));
	//System.out.println(SList);
	for(int i=0 ;i<BussList.size();i++)
	{
		String SList=BussList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains(name));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		//Assert.assertTrue(SList.contains("STUser"));
	}
	
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys("1234567890");
	Thread.sleep(6000);
	List<WebElement> ContactNameList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[2]"));
	//System.out.println(SList);
	for(int i=0 ;i<ContactNameList.size();i++)
	{
		String SList=ContactNameList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains("1234567890"));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys(num);
	Thread.sleep(6000);
	List<WebElement> ContactNList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[2]"));
	for(int i=0 ;i<ContactNList.size();i++)
	{
		String SList=ContactNList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains(num));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys("shyena@gmail.com");
	Thread.sleep(6000);
	List<WebElement> EmailList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[3]"));
	for(int i=0 ;i<EmailList.size();i++)
	{
		String SList=EmailList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains("shyena@gmail.com"));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys(orgemail);
	Thread.sleep(6000);
	List<WebElement> EmailLists = driver.findElements(By.xpath("//tr[@role='checkbox']/td[3]"));
	for(int i=0 ;i<EmailLists.size();i++)
	{
		String SList=EmailLists.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains(orgemail));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys(city);
	Thread.sleep(6000);
	List<WebElement> CityList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[4]"));
	for(int i=0 ;i<CityList.size();i++)
	{
		String SList=CityList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains(city));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys(state);
	Thread.sleep(6000);
	List<WebElement> StateSerchList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[5]"));
	for(int i=0 ;i<StateSerchList.size();i++)
	{
		String SList=StateSerchList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains(state));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	Thread.sleep(5000);
	SearchBar.click();
	SearchBar.sendKeys("India");
	Thread.sleep(6000);
	List<WebElement> CountrySList = driver.findElements(By.xpath("//tr[@role='checkbox']/td[6]"));
	for(int i=0 ;i<CountrySList.size();i++)
	{
		String SList=CountrySList.get(i).getText();
		System.out.println(SList);
		Assert.assertTrue(SList.contains("India"));
		Thread.sleep(1000);
		SearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
	}
	return null;
	
	
	
/*	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys("Netflix");
		Thread.sleep(8000);

		String OrgCompanyName = RecordOrgName.getText();
		if (OrgCompanyName.contains(OrgCompanyName)) {
			System.out.println("Search working with Organisation name");
		} else {
			System.out.println("Search not working with Organisation name");
		}
		Thread.sleep(8000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}
	

	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys(name);
		Thread.sleep(8000);
		String OrgCompanyName = RecordOrgName.getText();
		if (OrgCompanyName.contains(name)) {
			System.out.println("Search working with company name");
		} else {
			System.out.println("Search not working with company name");
		}
		Thread.sleep(8000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}

	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys("india");
		Thread.sleep(2000);
		String RecordCity = RecordCountryeName.getText();
		if (RecordCity.contains("india")) {
			System.out.println("Search working with country");
		} else {
			System.out.println("Search not working with country");
		}
		Thread.sleep(3000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}

/*	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys("9375");
		Thread.sleep(2000);
		String OrgContactPhone = OrgContactNoData.getText();
		if (OrgContactPhone.contains("9375")) {
			System.out.println("Search working with contact phone no.");
		} else {
			System.out.println("Search not working with contact phone no.");
		}
		Thread.sleep(3000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}*/

/*	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys(city);
		Thread.sleep(2000);
		String OrgCityname = RecordCityName.getText();
		if (OrgCityname.contains(city)) {
			System.out.println("Search working with city");
		} else {
			System.out.println("Search not working with city");
		}
		Thread.sleep(3000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}

	if (OrgSearchBar.isDisplayed()) {
		OrgSearchBar.click();
		OrgSearchBar.sendKeys("pune");
		Thread.sleep(2000);
		String OrgCityName = OrgCityData.getText();
		if (OrgCityName.contains("pune")) {
			System.out.println("Search working with city");
		} else {
			System.out.println("Search not working with city");
		}
		Thread.sleep(3000);
		OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
		Thread.sleep(6000);
	}
	return null; */

}
		
	/*		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr/th[1]"));
			int rowCount = rows.size();
			for (int i = 1; i <= rowCount; i++) {
				String OrgNameElement = driver.findElement(By.xpath("//div/div/table/tbody/tr[1]/th")).getText();
				if (OrgNameElement.equalsIgnoreCase(name)) {
					System.out.println("Organisation Search working");
				       	
						break;
					}
				
				}
			}
		*/
	
	/*		if (OrgSearchBar.isDisplayed())
				;
			{
				OrgSearchBar.click();
				Thread.sleep(2000);
				OrgSearchBar.sendKeys("PackersandMovers");
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with organisation name");
				System.out.println(RecordOrgName.getText());

				Thread.sleep(1000);
				OrgSearchBar.sendKeys("Nagpur");
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with city");
				System.out.println(RecordCityName.getText());
				
				
				Thread.sleep(1000);
				OrgSearchBar.sendKeys("Maharashtra");
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with state");
				System.out.println(RecordStateName.getText());
				
				Thread.sleep(1000);
				OrgSearchBar.sendKeys("India");
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with country");
				System.out.println(RecordCountryeName.getText());
				
				Thread.sleep(1000);
				OrgSearchBar.sendKeys("9548");
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with contact no");
				System.out.println(RecordCountryeName.getText());
				
				Thread.sleep(1000);
				OrgSearchBar.sendKeys(num);
				Thread.sleep(4000);
				OrgSearchBar.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(4000);
				System.out.println("Search working with contact no");
				System.out.println(RecordCountryeName.getText());
			}	
	
	return null;

	 }*/
	}

