package SeleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D://SeleniumFiles2022/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
       //Total no of Rows in table
       int rows=  driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size(); //always prefer
       // int rows= driver.findElements(By.tagName("tr")).size(); //when we have one single table
       System.out.println("Total no of Rows:"+ rows); 
        
       //Total no of Columns
      int column= driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
     // int column= driver.findElements(By.tagName("th")).size();
       System.out.println("Total no of Columns:"+column);
       
     
   /*    //Read specific row and column data
      String name= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[6]/td[1]")).getText();
      System.out.println(name);
       
       
      //Read all the data from specific row & column
      
    for(int r=2;r<=rows;r++ ) {
    
    	for(int c=1;c<=column;c++) {
    		 String rc= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    	      System.out.print(rc+"         ");
    		
    	}
    	   System.out.println();
    }
      */
        
        for(int r=2;r<=rows;r++) {
        String author=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
        
        if(author.equals("Amit"))
        {
        	String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
        	System.out.println(author+"  "+bookname);
        }
        	
        }
        
        //find sum of prices for all the books
        
        int sum=0;
        for(int r=2;r<=rows;r++) {
        	
        String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
        sum=sum+Integer.parseInt(price);
        	
        }
        System.out.println("Total price of book:"+sum);
        
	}

}
