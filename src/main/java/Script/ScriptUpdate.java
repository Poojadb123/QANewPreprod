package Script;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;




public class ScriptUpdate extends BaseClass{
	UtilityClass ref = new UtilityClass();
	String sheetName = "Script";// Read the data from excel sheet1
	
	//-----Customer sheet from the excel file-------------------
		String sheetNameCust = "Customer";
		Map<String, Map<String, String>> customersht = ref.getExcelAsMap(sheetNameCust);
		//-----------------------------------------------------------
		
		Map<String, Map<String, String>> customer = ref.getExcelAsMap(sheetName); // multiple rows
		
		Map<String, Object> customerOneRow = ref.exceldata(sheetName); //one row
		int excelRows = ref.getrowCount();

	/*Map<String, Map<String, String>> customer = ref.getExcelAsMap(sheetName);
    Map<String, Object> customerOneRow = ref.exceldata(sheetName);
     int excelRows = ref.getrowCount();*/
	

	public ScriptUpdate(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'Workspace')]")
	WebElement WorkspaceTab;

	@FindBy(xpath = "//div[contains(text(),'Script')]")
	WebElement ScriptModule;

	@FindBy(xpath = "//div/div[2]/div/div/div[1]/button")
	WebElement AddScriptBtn;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddBtn;

	@FindBy(xpath = "//div/div/form/div[1]/div[2]/div/p")
	WebElement CusReqFieldErrorMsg;

	@FindBy(xpath = "//div/div/form/div[1]/div[3]/div/p")
	WebElement ProReqFieldErrorMsg;

	@FindBy(xpath = "//div[1]/div[4]/div/div/div[1]/div/div")
	WebElement SelectParameter;

	@FindBy(xpath = "//div[1]/div[4]/div[2]/div/div[1]/div/div")
	WebElement Question1;

	@FindBy(xpath = "//div[1]/div[4]/div[3]/div/div[1]/div/div")
	WebElement Question2;

	@FindBy(xpath = "//div[1]/div[4]/div/div/div[1]/div/p")
	WebElement SelectParameterReqFMsg;

	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement ScriptRecord;

	@FindBy(xpath = "//table/tbody/tr[1]/th")
	WebElement ScriptOrgName;

	@FindBy(xpath = "//div/div/div[1]/div/div/textarea[1]")
	WebElement SecrptText;

	@FindBy(xpath = "//div[2]/div/div[1]/div/div/textarea[1]")
	WebElement SecrptText1;

	@FindBy(xpath = "//div[3]/div/div[1]/div/div/textarea[1]")
	WebElement SecrptText2;

	@FindBy(xpath = "//table/tbody/tr[1]/td[5]/button")
	WebElement ScriptAction;

	@FindBy(xpath = "//ul/li[1]")
	WebElement ScriptEditAction;

	@FindBy(xpath = "//div[2]/div[3]/div/h2/div")
	WebElement EditActionWindowTxt;

	@FindBy(xpath = "//div/div/form/div[2]/button[2]")
	WebElement ScriptUpdateBtn;

	@FindBy(xpath = "//tr[1]/td[3]")
	WebElement ScriptEyeIcon;

	@FindBy(xpath = "//h2/div/div")
	WebElement ScriptCrossIcon;

	@FindBy(css = "div:nth-child(4) > div > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-1ywo9w2")
	WebElement PlusIcon1;

	@FindBy(css = "div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > form > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3.css-1h77wgb > div:nth-child(4) > div:nth-child(2) > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-1ywo9w2")
	WebElement AddBtn2;

	public String corg;

	public String AddScript() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		Thread.sleep(8000);
		WorkspaceTab.click();
		ScriptModule.click();
		Thread.sleep(5000);
		
		
		String msg1 = null;
		String ind = null;
		String index = null;
		corg = (String) customerOneRow.get("SelectOrganisation");
		//String cust = (String) customerOneRow.get("SelectCustomer");
		String pro = (String) customerOneRow.get("SelectProcess");

		//Cutsomer Module 
		int f=1;
		while (f < excelRows) {
			index = Integer.toString(f);

			String Custorgnamesht = (String) customersht.get(index).get("CustomerOrgName");
			
			System.out.println("CurrentIndex: "+index);
			System.out.println("No. of rows : "+excelRows);
		
		
		Thread.sleep(5000);
		if (AddScriptBtn.isDisplayed()) {
			Thread.sleep(9000);
			AddScriptBtn.click();

		}
		
		//------------- Select Organisation--------------------------
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
				if (OList.contains(corg)) {
					OrgList.get(i).click();



					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}

		AddBtn.click();
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
				if (CList.contains(Custorgnamesht)) {
					CustList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}

		}

		Thread.sleep(4000);
		AddBtn.click();
		if (ProReqFieldErrorMsg.isDisplayed()) {
			System.out.println(ProReqFieldErrorMsg.getText());
		}

		// _____________selectProcess________________________

		WebElement SProcess = driver.findElement(By.xpath("//div/div/div/form/div[1]/div[3]/div/div/div"));
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
				if (PList.contains(pro)) {
					SelectProcessList.get(i).click();

					Thread.sleep(5000);
					break;
				}
				i++;
			}
		}

		int e=1;
		while(e < excelRows+1)
		{
			ind = Integer.toString(e);

			String para = (String) customer.get(ind).get("SelectParameter");
			String category = (String) customer.get(ind).get("SelectCategory");
			String Selectphrasetype = (String) customer.get(ind).get("SelectType");
			String KeyPhrase = (String) customer.get(ind).get("KeyPhrase");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			Thread.sleep(4000);
			AddBtn.click();
			Thread.sleep(4000);
			
			if (SelectParameterReqFMsg.isDisplayed()) {
				System.out.println(SelectParameterReqFMsg.getText());
			}

			/*
			 // Question Thread.sleep(3000); if (Question.isDisplayed()) {
			 
			  Thread.sleep(4000); SecrptText.sendKeys(que); }
			 */

			// __________________select parameter_________
			
			Thread.sleep(4000);
			System.out.println(e);
			WebElement SelectParameter1 = driver.findElement(By.xpath("//form/div[1]/div[4]/div["+e+"]/div/div[1]"));
			SelectParameter1.click();
			List<WebElement> spList = driver.findElements(By.xpath("//*[@id='menu-']/div[3]/ul/li"));
			Thread.sleep(4000);
			
			if (SelectParameter1.isDisplayed()) {
				// System.out.println(ct);
				// State.click();
				int NoOfCus = spList.size();
				// System.out.println(NoOfOrg);
				int i = 0;
				while (i < NoOfCus) {
					String CList = spList.get(i).getText();
					System.out.println(para);
					System.out.println("Comparision:"+e);
					System.out.println(spList.get(i).getText());
					if (CList.contains(para)) {
						spList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}

			Thread.sleep(4000);

			// ___________ select Category 1_____

			Thread.sleep(4000);
			WebElement SelectCategory = driver.findElement(By.xpath("//form/div[1]/div[4]/div["+e+"]/div/div[2]/div/div/div"));
			SelectCategory.click();
			List<WebElement> cList = driver.findElements(By.xpath("//div[3]/div[3]/ul/li"));
			Thread.sleep(4000);
			if (SelectCategory.isDisplayed()) {
				// System.out.println(ct);
				// State.click();
				int NoOfCus = cList.size();
				// System.out.println(NoOfOrg);
				int i = 0;
				while (i < NoOfCus) {
					String CList = cList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (CList.contains(category)) {
						cList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}

			}

			Thread.sleep(4000);
			// PlusIcon1.click();

			// _________select Phrase_______________

			WebElement SelectPhrase = driver.findElement(By.xpath("//form/div[1]/div[4]/div["+e+"]/div/div[3]/div/div/textarea[1]"));
			// SelectPhrase.click();
			// System.out.println(KeyPhrase);
			if (SelectPhrase.isDisplayed()) {
				Thread.sleep(2000);
				SelectPhrase.sendKeys(KeyPhrase);
				Thread.sleep(2000);
				
			}

			AddBtn.click();
			// --------------Select Type------------------

			WebElement SelectType = driver.findElement(By.xpath("//form/div[1]/div[4]/div["+e+"]/div/div[4]/div/div/div"));
			SelectType.click();
			List<WebElement> TList = driver.findElements(By.xpath("//div[3]/div[3]/ul/li"));
			if (SelectType.isDisplayed()) {
				int NoOfType = TList.size();
				// System.out.println(NoOfOrg);
				int i = 0;
				while (i < NoOfType) {
					String TypeList = TList.get(i).getText();
					// System.out.println(SList);
					// System.out.println(FeaturesNames.get(i).getText());
					if (TypeList.contains(Selectphrasetype)) {
						TList.get(i).click();

						Thread.sleep(5000);
						break;
					}
					i++;
				}
			}
			System.out.println("e of index no. : "+e);
			if (e == 29) {
				AddBtn.click();
				Thread.sleep(2000);
				if (ScriptOrgName.isDisplayed()) {
					msg1 = ScriptOrgName.getText();
				}

			} else {
				WebElement PlusIconSpecific= driver.findElement(By.cssSelector("body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > form > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-3.css-1h77wgb > div:nth-child(4) > div:nth-child("+e+") > svg.MuiSvgIcon-root.MuiSvgIcon-fontSizeMedium.css-1ywo9w2"));
				PlusIconSpecific.click();
			}
			e++;

		}
	       if(f == 2)
			{
				System.out.println("Exist Index : "+index);
				break;
			}
			f++;
		   }
		  return ind;
		
	}
	

	public String editScript() throws InterruptedException {
		String msg1 = null;
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(8000);
		WorkspaceTab.click();
		ScriptModule.click();
		Thread.sleep(5000);
		// driver.navigate().refresh();
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(250,0)");
		if (ScriptAction.isDisplayed()) {
			ScriptAction.click();
			ScriptEditAction.click();
			Thread.sleep(2000);
			// companyName
			if (EditActionWindowTxt.isDisplayed()) {
				/*
				 * if (EditFistNameTxt.isDisplayed()) { EditFistNameTxt.click();
				 * EditFistNameTxt.sendKeys("a");
				 */
				ScriptUpdateBtn.click();
				// }
			}
			Thread.sleep(5000);
			driver.navigate().refresh();
			if (ScriptRecord.isDisplayed()) {
				System.out.println(ScriptRecord.getText());

			}
			Thread.sleep(3000);
			if (ScriptOrgName.isDisplayed()) {
				msg1 = ScriptOrgName.getText();
			}

		}
		return msg1;
	}

}
