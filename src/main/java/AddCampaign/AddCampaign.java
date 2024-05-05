package AddCampaign;

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

public class AddCampaign extends BaseClass {
	UtilityClass ref = new UtilityClass();
	String sheetName = "Campaign";// Read the data from excel sheet1
	Map<String, Object> customer = ref.exceldata(sheetName);

	String Email = (String) customer.get("Email");// Enter Email
	String FileName = (String) customer.get("FileName");

	public AddCampaign(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Administration']")
	WebElement AdministrationTab;

	@FindBy(xpath = "//div[text()='Campaign']")
	WebElement CampaignTab;

	@FindBy(xpath = "//button[text()='Add Campaign']")
	WebElement AddCampaignBtn;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//div[1]/div[2]/div/p")
	WebElement CusReqFieldErrorMsg;

	@FindBy(xpath = "//input[@name='campaignName[0]']")
	WebElement CampaignName;

	@FindBy(xpath = "//form/div[1]/div[3]/div/div/p")
	WebElement CampNameReqFieldMsg;

	@FindBy(xpath = "//input[@name='campaignProduct']")
	WebElement ProductName;

	@FindBy(xpath = "//form/div[1]/div[4]/div/div/p")
	WebElement ProductNameReqFieldMsg;
	
	@FindBy(xpath = "//form/div[1]/div[5]/p")
	WebElement SDateReqFieldMsg;

	@FindBy(xpath = "//form/div[1]/div[6]/p")
	WebElement EDateReqFieldMsg;

	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement CampaignRecord;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]")
	WebElement CampaignOrgName;

	@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[3]/button")
	WebElement CampaignAction;

	@FindBy(xpath = "//div[2]/div[3]/ul/li[1]")
	WebElement CampaignActionEdit;

	@FindBy(xpath = "//div/h2")
	WebElement EditActionWindowTxt;

	@FindBy(xpath = "//button[text()='Update']")
	WebElement OrgUpdateBtn;

	@FindBy(xpath = "//div/div/form/div[1]/div[3]/div/div/div/input")
	WebElement UpdateCampaignName;
	
	@FindBy(xpath = "//input[@name='campaign_product']")
	WebElement UpdateProduct;
	
	@FindBy(xpath = "//form/div[1]/div[4]/div/p")
	WebElement UProductReqField;
	
	//@FindBy(xpath = "//table/tbody/tr[1]")
	//WebElement CampaignRecord;

	//public String name = (String) customer.get("OrganisationName");
	public String corg = (String) customer.get("SelectOrganisation");
	
	public String AddCampaign() throws InterruptedException  {
	    String msg1 = null ;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

		String corg = (String) customer.get("SelectOrganisation");
		String name = (String) customer.get("CampaignName");
		String ct = (String) customer.get("SelectCustomer");
		String pro = (String) customer.get("Product");
		String sdate = (String) customer.get("StartDate");
		String edate = (String) customer.get("EndDate");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		
		Thread.sleep(6000);
		AdministrationTab.click();
		CampaignTab.click();
		Thread.sleep(9000);
		if (AddCampaignBtn.isDisplayed()) {
			Thread.sleep(9000);
			AddCampaignBtn.click();
			Thread.sleep(9000);

		}
			// select Organisation

			WebElement SelectOrg = driver.findElement(By.cssSelector("div#select-organisation"));
			SelectOrg.click();
			List<WebElement> OrgList = driver.findElements(By.xpath("//*[@id='menu-organisationId']/div[3]/ul/li"));
			if (SelectOrg.isDisplayed()) {
				// System.out.println(ct);
				// State.click();
				int NoOfOrg = OrgList.size();
				// System.out.println(NoOfOrg);
				int i = 0;
				while (i < NoOfOrg) {
					String OList = OrgList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (OList.contains(corg)) {
						OrgList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}
		
		SubmitBtn.click();
		if (CusReqFieldErrorMsg.isDisplayed()) {
			System.out.println(CusReqFieldErrorMsg.getText());
		}

		// select Customer

		WebElement SelectCustomer = driver.findElement(By.cssSelector("div#select-customer"));
		SelectCustomer.click();
		List<WebElement> CustList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
		if (SelectCustomer.isDisplayed()) {
			// System.out.println(ct);
			// State.click();
			int NoOfCus = CustList.size();
			// System.out.println(NoOfOrg);
			int i = 0;
			while (i < NoOfCus) {
				String CList = CustList.get(i).getText();
				// System.out.println(SList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (CList.contains(ct)) {
					CustList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}

		}
		Thread.sleep(8000);

		if (CampaignName.isDisplayed()) {
			CampaignName.click();
			Thread.sleep(8000);
			SubmitBtn.click();
		}
		Thread.sleep(3000);
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys(" ");
			Thread.sleep(6000);
		}
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			SubmitBtn.click();
		}

		CampaignName.sendKeys("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjjjjjj");
		Thread.sleep(6000);
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			SubmitBtn.click();
		}

		CampaignName.sendKeys("i");
		Thread.sleep(6000);
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			SubmitBtn.click();
		}
		CampaignName.sendKeys("@!@@#*&(^(*)@@$&%%^$");
		Thread.sleep(5000);
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			SubmitBtn.click();
		}
		Thread.sleep(5000);
		CampaignName.sendKeys("112223334444447777666");
		if (CampNameReqFieldMsg.isDisplayed()) {
			System.out.println(CampNameReqFieldMsg.getText());
			CampaignName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
			Thread.sleep(3000);
			SubmitBtn.click();
		}
		Thread.sleep(5000);
		CampaignName.sendKeys(name);

		// Product
		Thread.sleep(5000);
		if (ProductName.isDisplayed()) {
			ProductName.click();
			SubmitBtn.click();
		}
		if(ProductNameReqFieldMsg.isDisplayed()) {
			System.out.println(ProductNameReqFieldMsg.getText());
			ProductName.sendKeys("112223334444447777666");
			if (ProductNameReqFieldMsg.isDisplayed()) {
				System.out.println(ProductNameReqFieldMsg.getText());
				ProductName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SubmitBtn.click();
			}
			ProductName.sendKeys("#@!!@##$$%%^&**(()))*&^%#");
			if (ProductNameReqFieldMsg.isDisplayed()) {
				System.out.println(ProductNameReqFieldMsg.getText());
				ProductName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SubmitBtn.click();
			}
			ProductName.sendKeys("dfdfdffdffffffffffffffffffffffffffffffffffffffffffff");
			if (ProductNameReqFieldMsg.isDisplayed()) {
				System.out.println(ProductNameReqFieldMsg.getText());
				ProductName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SubmitBtn.click();
			}
			ProductName.sendKeys("aa");
			if (ProductNameReqFieldMsg.isDisplayed()) {
				System.out.println(ProductNameReqFieldMsg.getText());
				ProductName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SubmitBtn.click();
			}
			ProductName.sendKeys(" ");
			if (ProductNameReqFieldMsg.isDisplayed()) {
				System.out.println(ProductNameReqFieldMsg.getText());
				ProductName.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
				Thread.sleep(3000);
				SubmitBtn.click();
				
				ProductName.sendKeys(pro);
			}
			
		}

		// Start date
		Thread.sleep(5000);
		SubmitBtn.click();
		if (SDateReqFieldMsg.isDisplayed()) {
			System.out.println(SDateReqFieldMsg.getText());
		}
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,100)");
		// start date
		WebElement StartDate = driver.findElement(By.xpath("//*[@id='datepicker']"));
		StartDate.click();
	//	WebElement arrow = driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous"));
	//	arrow.click();
		List<WebElement> StartDateList = driver.findElements(By.cssSelector(".react-datepicker__day.react-datepicker__day"));
		if (StartDate.isDisplayed()) {
			// State.click();
			int NoOfDate = StartDateList.size();
			int i = 0;
			while (i < NoOfDate) {
				String DList = StartDateList.get(i).getText();
				System.out.println(DList);
				// System.out.println(FeaturesNames.get(i).getText());
				if (DList.equalsIgnoreCase(sdate)) {
					StartDateList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
				// System.out.println(sone);

			}
		}

		// EndDate
		if (EDateReqFieldMsg.isDisplayed()) {
			System.out.println(EDateReqFieldMsg.getText());
		}

		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,40)");
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
				if (DList.equalsIgnoreCase(edate)) {
					EndDateList.get(j).click();

					Thread.sleep(5000);
					break;
				}
				j++;
			}
		}

		Thread.sleep(9000);
		SubmitBtn.click();
		Thread.sleep(60000);
		if (CampaignRecord.isDisplayed()) {
			System.out.println(CampaignRecord.getText());
		}

		if (CampaignOrgName.isDisplayed()) {
			msg1= CampaignOrgName.getText();
		}
		return msg1;
		
	}


	public String editCampaign() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String ucname = (String) customer.get("UCampaignName");
		String uproo = (String) customer.get("UProduct");

		Thread.sleep(6000);
		AdministrationTab.click();
		CampaignTab.click();
		
	//	driver.navigate().refresh();
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(250,0)");
		if (CampaignAction.isDisplayed()) {
			CampaignAction.click();
			CampaignActionEdit.click();
			Thread.sleep(2000);
			// campaign Name
			if (EditActionWindowTxt.isDisplayed()) {
				Thread.sleep(8000);
				UpdateCampaignName.click();
				UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				OrgUpdateBtn.click();
				UpdateCampaignName.sendKeys("  ");
				if (CampNameReqFieldMsg.isDisplayed()) {
					System.out.println(CampNameReqFieldMsg.getText());
					UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					Thread.sleep(3000);
					OrgUpdateBtn.click();
				}

				UpdateCampaignName.sendKeys("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjjjjjj");
				Thread.sleep(6000);
				if (CampNameReqFieldMsg.isDisplayed()) {
					System.out.println(CampNameReqFieldMsg.getText());
					UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					Thread.sleep(3000);
					OrgUpdateBtn.click();
				}
				UpdateCampaignName.sendKeys("i");
				Thread.sleep(6000);
				if (CampNameReqFieldMsg.isDisplayed()) {
					System.out.println(CampNameReqFieldMsg.getText());
					UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					Thread.sleep(3000);
					OrgUpdateBtn.click();
				}
				UpdateCampaignName.sendKeys("@!@@#*&(^(*)@@$&%%^$");
				Thread.sleep(5000);
				if (CampNameReqFieldMsg.isDisplayed()) {
					System.out.println(CampNameReqFieldMsg.getText());
					UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					Thread.sleep(3000);
					OrgUpdateBtn.click();
				}
				Thread.sleep(5000);
				UpdateCampaignName.sendKeys("112223334444447777666");
				if (CampNameReqFieldMsg.isDisplayed()) {
					System.out.println(CampNameReqFieldMsg.getText());
					UpdateCampaignName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
					Thread.sleep(3000);
					OrgUpdateBtn.click();
				}
				Thread.sleep(5000);
				UpdateCampaignName.sendKeys(ucname);
	
			}
			
			//Product
			
			UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			OrgUpdateBtn.click();
			UpdateProduct.sendKeys(" ");
			Thread.sleep(1000);
			OrgUpdateBtn.click();
			if (UProductReqField.isDisplayed()) {
				System.out.println(UProductReqField.getText());
				UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				Thread.sleep(3000);
				OrgUpdateBtn.click();
			}

			UpdateProduct.sendKeys("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjjjjjj");
			Thread.sleep(6000);
			OrgUpdateBtn.click();
			if (UProductReqField.isDisplayed()) {
				System.out.println(UProductReqField.getText());
				Thread.sleep(3000);
				UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				Thread.sleep(3000);
				OrgUpdateBtn.click();
			}
			UpdateProduct.sendKeys("i");
			Thread.sleep(6000);
			OrgUpdateBtn.click();
			if (UProductReqField.isDisplayed()) {
				System.out.println(UProductReqField.getText());
				UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				Thread.sleep(3000);
				OrgUpdateBtn.click();
			}
			UpdateProduct.sendKeys("@!@@#*&(^(*)@@$&%%^$");
			Thread.sleep(5000);
			OrgUpdateBtn.click();
			if (UProductReqField.isDisplayed()) {
				System.out.println(UProductReqField.getText());
				UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				Thread.sleep(3000);
			}
			Thread.sleep(5000);
			UpdateProduct.sendKeys("112223334444447777666");
			OrgUpdateBtn.click();
			Thread.sleep(1000);
			if (UProductReqField.isDisplayed()) {
				System.out.println(UProductReqField.getText());
				UpdateProduct.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				Thread.sleep(3000);
				UpdateProduct.sendKeys(uproo);
				OrgUpdateBtn.click();
			}
			
			Thread.sleep(12000);
			driver.navigate().refresh();
			if (CampaignRecord.isDisplayed()) {
				System.out.println(CampaignRecord.getText());
			}
			Thread.sleep(3000);
			if (CampaignOrgName.isDisplayed()) {
				msg1 = CampaignOrgName.getText();
			}

		}
		return msg1;
	}

}
