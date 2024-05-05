package STY.IntelliConvo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CallAnalysis.CallAnalysis;
import Login.Login;
import Organisation.Organisation;
import STY.IntelliConvo.BaseClass;


public class CallAnalysisTest extends BaseClass {
	//UtilityClass ScreenCap = new UtilityClass();
	WebDriver driver;

	
	@Test(priority=1) 
	public void CallAnalysisTest() throws InterruptedException, IOException {
		
		driver = initializeDriver();
		CallAnalysis cs = PageFactory.initElements(driver, CallAnalysis.class);
		//CallAnalysis cs = new CallAnalysis(driver);	
		Thread.sleep(10000);
		Login lg=new Login(driver);
		//Thread.sleep(20000);
		lg.signInHappyPath();
		Thread.sleep(5000);
		cs.CallAnalysisDashboard();
		//Thread.sleep(9000);
		//cs.CallAnalysisDiffDate();
		//Thread.sleep(9000);
		//cs.SeletingMultipleAgents();
		

}
}
