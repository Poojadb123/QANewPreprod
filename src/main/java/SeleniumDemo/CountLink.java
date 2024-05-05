package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Thread.sleep(4000);
		Actions a = new Actions(driver);
		//WebElement move = driver.findElement(By.className(".a4bIc")).click();
		//a.moveToElement(driver.findElement(By.id("APjFqb"))).click().keyDown(Keys.SHIFT).sendKeys("Selenium").build().perform();
		
		//driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Alh6id']/div[1]/div/ul/li[1]")).click();
		Thread.sleep(4000);
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		try {
		int count=link.size();
		System.out.println(count);
		
		
		for(int i=0 ; i<=count ;i++)
		{
			System.out.println(link.get(i).getText());
		}
		
		
		}catch(IndexOutOfBoundsException c) {
			
			System.out.println("Exception handle");
		}
		System.out.println("My First Commit");
		
		
		
	}

}
