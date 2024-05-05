package STY.IntelliConvo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	// public static WebDriver driver;
	
	public WebDriver driver;
	//public static ExtentTest test;
	//public static ExtentReports extent;
	//public static ExtentHtmlReporter htmlReporter;

	
      public String URL= "http://164.52.196.208/";//QA
    // public String URL ="http://intelliconvo-prod-2112048666.ap-south-1.elb.amazonaws.com/";//Prod
	 // public String URL= "https://www.convintelligence.in/";//prod
	
	
@BeforeTest
public WebDriver initializeDriver() throws IOException {
	//	extentReport();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("Resource/data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
				
			  driver = new ChromeDriver();
			}
			
			
			//ChromeOptions options = new ChromeOptions();
				
				
				//driver.get("https://www.convintelligence.in");//QA
				//driver.get("http://13.234.71.226:3006/");//prod
				
				//Headless browsing 1920,1200
		       //  options = new ChromeOptions();

			/*	options.addArguments("--headless", "--disable-gpu", "--window-size=1220,800","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
				driver = new ChromeDriver(options);*/
		
				driver.get(URL+"Login"); //QA
				
				driver.manage().window().maximize();
			}
		
		return driver;
	}


	public WebDriver WD(WebDriver driver) {
		 return this.driver = driver;

	}
	/*
	public BaseClass(WebDriver driver) throws IOException {
		//super();
		this.driver = driver;
		
	}

*/	
	
	
/*	public static void extentReport() {

		htmlReporter = new ExtentHtmlReporter("IntelliConvoExtentReport2.html");
		htmlReporter.setAppendExisting(true);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setChartVisibilityOnOpen(true);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		test = extent.createTest("Automation tests");
		test.info("Automation started");

	}
*/
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		//extent.flush();
		
		
		driver.close();
		Thread.sleep(7000);
	}
}