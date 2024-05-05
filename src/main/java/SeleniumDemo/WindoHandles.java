package SeleniumDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationstepbystep.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@data-image-title='Udemy']")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		for(String childWindow:allWindows)
		{
			if(childWindow.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(childWindow);
				String url=driver.getCurrentUrl();
				System.out.println("target window URL -"+ url);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		String parentWinURL=driver.getCurrentUrl();
		System.out.println(parentWinURL);
		driver.quit();
		
		

	}

}
