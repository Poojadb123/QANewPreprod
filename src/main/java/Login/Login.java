package Login;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class Login extends BaseClass
{
	
		//this.WD(driver);
		//public WebDriver driver;
		//String reqField = "This field is required";
	    String emailreqField="Email is required.";
	    String passreqField="Password is required.";
		String invalidEmail = "Email must be a valid email address.";
		String invalidCreds = "Please check your email and password : User not found.";
	//	String expURL = "https://app.zinia.ai/profile";
	//	String expURL="http://13.126.209.38/dashboard/call";
		String expURL=URL+"dashboard/call";
		
		UtilityClass ref = new UtilityClass();
		String sheetName = "Login";//Read the data from excel sheet1
		Map<String, Object> customer = ref.exceldata(sheetName);

		String InvEmail = (String) customer.get("InvalidEmail");
		String InvCredEmail = (String) customer.get("InvalidCredEmail");
		String ValEmail = (String) customer.get("ValidEmail");
		String Password = (String) customer.get("Password");


		public Login(WebDriver driver) {
			this.driver=driver;
		}
		

		public void signInBlank() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(3000);
			// blank email ID field
			String e = driver.findElement(By.xpath("//div[2]/div/form/div[1]/div[1]/div/p")).getText();
			if (e.equalsIgnoreCase(emailreqField)) {
				//pass
				System.out.println("Pass");
			}
			else {
				//screenshot
				System.out.println("Fail");

			}
			String e1 = driver.findElement(By.xpath("//div[2]/div/form/div[1]/div[2]/div/p")).getText();
			if (e1.equalsIgnoreCase(passreqField)) {
				//pass
				System.out.println("Pass");
			}
			else {
				//screenshot
				System.out.println("Fail");

			}
			
		}
		
		public void signInBlankPassword( ) throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(InvCredEmail);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			//blank password field
			String p = driver.findElement(By.xpath("//div/div[2]/div/form/div[1]/div[2]/div/p")).getText();
			if (p.equalsIgnoreCase(passreqField)) {
				//pass
				System.out.println("Pass");

			}
			else {
				//screenshot
				System.out.println("Fail");

			}
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			
		}
		public void signInBlankEmailID() throws InterruptedException {
			// blank email ID field
			driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();;
			String e = driver.findElement(By.xpath("//div/div[2]/div/form/div[1]/div[1]/div/p")).getText();
			if (e.equalsIgnoreCase(emailreqField)) {
				//pass
				System.out.println("Pass");

			}
			else {
				//screenshot
				System.out.println("Fail");

			}
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));

		}
		public void signInInvalidEmailId() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(InvEmail);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			String e = driver.findElement(By.xpath("//div/div[2]/div/form/div[1]/div[1]/div/p")).getText();
			if (e.equalsIgnoreCase(invalidEmail)) {
				//pass
				System.out.println("Pass");

			}
			else {
				//screenshot
				System.out.println("Fail");

			}
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		}
		public void signInInvalidCreds() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(InvCredEmail);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();;
			Thread.sleep(1000);
			WebElement e = driver.findElement(By.cssSelector("div.MuiAlert-message"));
			if (e.isDisplayed()) {
				//pass
				System.out.println("Pass");

			}
			else {
				// screenshot
				System.out.println("Fail");

			}
		
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		}
		
		public void signInHappyPath() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(ValEmail);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(2500);
			String actualURL=driver.getCurrentUrl();
			System.out.println(actualURL);
			if (expURL.equalsIgnoreCase(actualURL)) {
				System.out.println("User login Successfully.");
			}
			else {
				System.out.println("Failed to log in ");
			}
		}
		
			

	}



