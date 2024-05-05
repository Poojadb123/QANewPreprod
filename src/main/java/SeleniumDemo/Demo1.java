package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://SeleniumFiles2022/chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         
         WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
		driver.get("https://wallethub.com/profile/test-insurance-company-13732055i");
		
		WebElement el = driver.findElement(By.xpath("//div[1]/nav/div[3]/button[1]"));
		
		if(el.isDisplayed()) {
			System.out.println(el.getText()+"Login sucessfully");
		}
		else {
			System.out.println("Login Failed");
		}
		
		driver.close();
			
		
		 
		 
		 
		 
		 
		
		
	}

}
