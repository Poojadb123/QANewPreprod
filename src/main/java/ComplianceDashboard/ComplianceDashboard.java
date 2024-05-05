	package ComplianceDashboard;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import STY.IntelliConvo.BaseClass;
import STY.IntelliConvo.UtilityClass;

public class ComplianceDashboard extends BaseClass{
	//public WebDriver driver;
		UtilityClass ref = new UtilityClass();
		String sheetName = "ComplianceDashboard";// Read the data from excel sheet1
		Map<String, Object> customer = ref.exceldata(sheetName);

		String Email = (String) customer.get("Email");// Enter Email
		String FileName = (String) customer.get("FileName");

		public ComplianceDashboard(WebDriver driver) {
			// super(driver);
			this.driver = driver;
			//PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//input[@name='email']")
		WebElement Email_A;

		@FindBy(xpath = "//input[@name='password']")
		WebElement Pass_A;

		@FindBy(xpath = "//button[text()='Login']")
		WebElement Btn_A;

		@FindBy(xpath = "//div/div[1]/div[2]/div/div/div/div[2]/ul/div[1]")
		WebElement DashboardTab;
		
		@FindBy(xpath = "//div[text()='Compliance']")
		WebElement ComplianceDashboardTab;

		@FindBy(xpath = "//button[text()='Submit']")
		WebElement SubmitBtn;
		
		@FindBy(xpath = "//div[2]/div/div[2]/div[1]/div[2]/div/div[1]")
		WebElement ScoredCallCard;

		@FindBy(xpath = "//button[text()='Add Feedback']")
		WebElement AddFeedbackBtn;

		@FindBy(xpath = "//div/form/div[1]/div[5]/div/div/p")
		WebElement FeedReqFieldmsg;

		@FindBy(xpath = "//div[1]/div[5]/div/div/div/textarea[1]")
		WebElement FeedbackTextArea;

		@FindBy(xpath = "//input[@name='email']")
		WebElement UserEmail;

		@FindBy(xpath = "//form/div[1]/div[7]/div/p")
		WebElement EmailReqFieldMsg;

		@FindBy(xpath = "//input[@name='contactNumber']")
		WebElement UserContactNo;

		@FindBy(xpath = "//form/div[1]/div[8]/div/p")
		WebElement ContactReqFieldMsg;

		@FindBy(xpath = "//input[@name='employeeId']")
		WebElement UserEmployeeId;

		@FindBy(xpath = "//form/div[1]/div[9]/div/p")
		WebElement EmpidReqFieldMsg;
		
		@FindBy(xpath = "//button[text()='Add']")
		WebElement AddBtn;

		@FindBy(xpath = "//button[text()='Cancel']")
		WebElement CancelBtn;

		@FindBy(css = "div[class='MuiAlert-message css-1pxa9xg-MuiAlert-message']")
		WebElement UserAlertMessage;
		
		@FindBy(xpath = "//div/div/table/tbody/tr[1]/td[9]/button")
		WebElement UserAction;
		
		@FindBy(xpath = "//ul/li[2]")
		WebElement UserActionEdit;
		
		@FindBy(xpath = "//ul/li[1]")
		WebElement UserActionDisable;
		
		@FindBy(xpath = "//div/h2")
		WebElement EditActionWindowTxt;
		
		@FindBy(xpath = "//div[1]/div[5]/div/div/input")
		WebElement EditFistNameTxt;
		
		@FindBy(xpath = "//table/tbody/tr[1]/td[4]")
		WebElement UsersRecordOrg;

		@FindBy(xpath = "//table/tbody/tr[1]")
		WebElement UsersRecord;
		
		@FindBy(xpath = "(//div[@id='select-customer'])[1]")
		WebElement selectCustomer;
		
		@FindBy(xpath = "//body/div[@id='menu-customer']/div[3]/ul[1]/li")
		List<WebElement> customers;
		
		@FindBy(xpath = "//form/div/div[3]/div/div/div")
		WebElement selectProcess;
		
		@FindBy(xpath = "//*[@id='menu-process']/div[3]/ul/li")
		List<WebElement> Processes;
		
		@FindBy(xpath = "//div/form/div/div[4]/div/div/div")
		WebElement selectAgent;

		@FindBy(xpath = "//*[@id='menu-campaign']/div[3]/ul/li")
		List<WebElement> Agents;
		
		@FindBy(xpath = "//*[@id='select-format']")
		WebElement SelectDate ;
		
		@FindBy(xpath = "//*[@id='menu-format']/div[3]/ul/li")
		List<WebElement> Dates;
		
		
		@FindBy(xpath = "//tbody/tr[1]/td[2]/button")
		WebElement Action;
		
		@FindBy(xpath = "//body/div[2]/div[3]/ul/li[3]")
		WebElement ViewAction;
		
		@FindBy(xpath = "//div/div[1]/h4")
		WebElement ViewActionLabel;
		
		@FindBy(xpath = "//table/tbody/tr[1]/td[3]/button")
		WebElement QuestionEyeIcon;
		
		@FindBy(css = "div.MuiBox-root.css-0 > div.MuiBox-root.css-0 > div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(2)")
		WebElement PlayBtn;
		
		
		@FindBy(css = "div > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(2) > div > div > div.controls > svg > path:nth-child(1)")
		WebElement Transcript;
		
		@FindBy(xpath = "//body/div[2]/div[3]/div/h2/div/div")
		WebElement CrossIcon;
		
		@FindBy(xpath = "//div/div/div[1]/div[1]/div/button")
		WebElement backBtn;
		
		//Goal
		@FindBy(xpath = "//div[3]/div/div[1]/button")
		WebElement AddGoalBtn;
		
		@FindBy(xpath = "//div[2]/div[3]/div/h2")
		WebElement AddGoalLabel;
		
		@FindBy(xpath = "//button[2][text()='Submit']")
		WebElement GoalSubmitbtn;
		
		@FindBy(xpath = "//div[1]/div[4]/div/div/p")
		WebElement GoalReqfieldmsg;
		
		@FindBy(xpath = "//form/div[1]/div[4]/div/div/div/input")
		WebElement GoalText;
		
		@FindBy(xpath = "//input[@name='comment']")
		WebElement CommentsText;
		
		@FindBy(xpath = "//div[1]/div[6]/div/div/p")
		WebElement CommentsReqfieldmsg;
		
		@FindBy(css = "div.MuiAlert-message")
		WebElement AlertMessage;
		
		@FindBy(xpath = "//div[4]/div/div[2]/div/div/div[1]/table/tbody")
		WebElement GoalOrgRecord;
		
		@FindBy(xpath="//form/div/div[1]/div/div/div[1]")
		WebElement OrgTextBox;
		
		@FindBy(xpath="//form/div/div[1]/div/div/div[1]/div[2]/input")
		WebElement OrgTextField;
		
		@FindBy(xpath="//form/div/div[2]/div/div/div[1]")
		WebElement CusTextBox;
		
		@FindBy(xpath="//form/div/div[2]/div/div/div[1]/div[2]/input")
		WebElement CusTextField;
		
		@FindBy(xpath="//form/div/div[3]/div/div/div[1]")
		WebElement ProcessTextBox;
		
		@FindBy(xpath="//form/div/div[3]/div/div/div[1]/div[2]/input")
		WebElement ProTextField;
		
		@FindBy(xpath="//form/div/div[4]/div/div/div[1]")
		WebElement AgentTextBox;
		
		@FindBy(xpath="//form/div/div[4]/div/div/div[1]/div[2]/input")
		WebElement AgentTextField;
		
		@FindBy(xpath="//form/div/div[5]/div/div/div[1]")
		WebElement DateTextBox;
		
		@FindBy(xpath="//form/div/div[5]/div/div/div[1]/div[2]/input")
		WebElement DateTextField;
		
		@FindBy(xpath="//div/div/table/tbody/tr[1]/td[3]/a/p")
		WebElement FirstViewRecord;
		
		@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(1)")
		WebElement ReloadTab;
		
		@FindBy(css = "div > div:nth-child(2) > div > div:nth-child(4) > section > div:nth-child(4) > svg:nth-child(3)")
		WebElement BackwordReloadTab;
		
		@FindBy(xpath = "//div/div[2]/div/div[4]/section/div[4]/button")
		WebElement dot;
		
		@FindBy(xpath = "//body/div[2]/div[3]/ul/li[1]")
		WebElement Download;
		
		@FindBy(xpath = "//div/div[2]/div[2]/div[1]/div/div[1]/button")
		WebElement ScoreDownloadBtn;
		
		@FindBy(xpath = "//div/div[2]/div[2]/div[4]/div/div[1]")
		WebElement ScoringPercentage;
		
		@FindBy(xpath = "//div/div[2]/div[2]/div[4]/div/div[2]")
		WebElement ScoringPercentagevalues;
		
		@FindBy(xpath = "//div/div[2]/div/div[2]/div[2]/div[5]")
		WebElement ScriptAdherencecard;
		
		@FindBy(xpath = "//div[2]/div[2]/div[5]/div/div[1]/button")
		WebElement ScriptAdherenceDownload;
		
		public void ComplianceDashboardTC() throws InterruptedException, IOException {
			driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);

			String sorg = (String) customer.get("SelectOrganisation");
			String agent = (String) customer.get("SelectAgent");
			String scus = (String) customer.get("SelectCustomer");
			String spro = (String) customer.get("SelectProcess");
			String sdate = (String) customer.get("SelectDate");
			
		
			
			Thread.sleep(5000);
			DashboardTab.click();
			ComplianceDashboardTab.click();
			Thread.sleep(5000);
			//SubmitBtn.click();
			Thread.sleep(1000);
			
			if (OrgTextBox.isDisplayed()) {
	            Thread.sleep(15000);
	            OrgTextField.sendKeys(sorg);
	            //Thread.sleep(10000);
	            //OrgTextBox.click();
	            Thread.sleep(15000);
	            Actions act = new Actions(driver);
	            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

	            Thread.sleep(10000);

	            }
			
			// Customer
			if (CusTextBox.isDisplayed()) {
	            Thread.sleep(15000);
	            //CusTextBox.click();
	            Thread.sleep(1000);
	            CusTextField.sendKeys(scus);
	            Thread.sleep(15000);
	            Actions act = new Actions(driver);
	            //operators lists
	            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

	        }
			
			// Process
			if (ProcessTextBox.isDisplayed()) {
	            Thread.sleep(15000);
	            //CusTextBox.click();
	            Thread.sleep(1000);
	            ProTextField.sendKeys(spro);
	            Thread.sleep(15000);
	            Actions act = new Actions(driver);
	            //operators lists
	            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

	        }
			
			//Agent
			
			if (AgentTextBox.isDisplayed()) {
	            Thread.sleep(15000);
	            //CusTextBox.click();
	            Thread.sleep(1000);
	            AgentTextField.sendKeys(agent);
	            Thread.sleep(15000);
	            Actions act = new Actions(driver);
	            //operators lists
	            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

	        }
			
			// date
	        if (DateTextBox.isDisplayed()) {
	            Thread.sleep(15000);
	            //AgentTextBox.click();
	            DateTextField.sendKeys(sdate);
	            Thread.sleep(3000);
	            Thread.sleep(15000);
	            Actions act = new Actions(driver);
	            //operators lists
	            act.sendKeys(Keys.chord(Keys.SHIFT,Keys.ENTER)).build().perform();

	        }
			SubmitBtn.click();
	        Thread.sleep(20000);
	        if(ScoredCallCard.isDisplayed())
	        {
	        	ScoredCallCard.click();
	        	Thread.sleep(7000);
	        	
	        	System.out.println("Landing to Scored card Info ");
	        	Thread.sleep(7000);
	        	int scoredcallsRow = driver.findElements(By.xpath("//div[3]/div/div/div/div/div/table/tbody/tr")).size();
	        	System.out.println("Total no of scored calls Rows:"+ scoredcallsRow);
	        	
	        	Thread.sleep(7000);
	        	FirstViewRecord.click();
	        }
	         Thread.sleep(12000);
	         if (PlayBtn.isDisplayed()) {
	 			PlayBtn.click();
	 			Thread.sleep(12000);
	 			PlayBtn.click();
	 		}
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	 		js.executeScript("window.scrollTo(0, 0);");
	 		if(ReloadTab.isDisplayed()){
	 			ReloadTab.click();
	 			Thread.sleep(2000);
	 			System.out.println("Reload is working");
	 			PlayBtn.click();
	 			Thread.sleep(2000);
	 			BackwordReloadTab.click();
	 			Thread.sleep(7000);
	 			PlayBtn.click();
	 			Thread.sleep(7000);
	 			
	 		}
	 		if(dot.isDisplayed()) {
	 			dot.click();
	 			Thread.sleep(3000);
	 			//Download.click();
	 			Download.sendKeys(Keys.ENTER ,Keys.TAB);
	 			System.out.println("Audio Downloaded sucessfully.");
	 			Thread.sleep(3000);
	 			//BackwordReloadTab.click();
	 		}
	 		
			 
		}
				
			  public void AddFeedback_TC() throws InterruptedException, IOException {
					driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
					
					String feed = (String) customer.get("Feedback");
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,0)");
					Thread.sleep(9000);
					if(AddFeedbackBtn.isDisplayed()) {
						AddFeedbackBtn.click();
						Thread.sleep(5000);
						SubmitBtn.click();
						if(FeedReqFieldmsg.isDisplayed()){
							System.out.println(FeedReqFieldmsg.getText());
						    Thread.sleep(9000);
						    FeedbackTextArea.isDisplayed();
						    {
						    	FeedbackTextArea.sendKeys(" ");
								if (FeedReqFieldmsg.isDisplayed()) {
									System.out.println(FeedReqFieldmsg.getText());
									FeedbackTextArea.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
									Thread.sleep(3000);
									SubmitBtn.click();
								}
								Thread.sleep(5000);
								FeedbackTextArea.sendKeys(feed);
								SubmitBtn.click();
								WebElement e = driver.findElement(By.cssSelector("div.MuiAlert-message"));
								if (e.isDisplayed()) {
									//pass
									System.out.println("Success: Feedback Saved successfully.");

								}
								else {
									// screenshot
									System.out.println("Success: Feedback not Saved successfully.");
				                      }
				                }

						    }
						}
			  } 
			  
			  public String AddGoal_TC() throws InterruptedException, IOException {
				  String msg = null;
					driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
					
					String goal = (String) customer.get("Goal");
					String goalstatus = (String) customer.get("GoalStatus");
					String com = (String) customer.get("Comments");
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,0)");
					Thread.sleep(9000);
					if(backBtn.isDisplayed()) {
						backBtn.click();
						Thread.sleep(15000);
						SubmitBtn.click();
			           }
					js.executeScript("window.scrollBy(0,350)");
					if(AddGoalBtn.isDisplayed()){
						AddGoalBtn.click();
						Thread.sleep(4000);
						if(AddGoalLabel.isDisplayed())
						{
							System.out.println(AddGoalLabel.getText());
							GoalSubmitbtn.click();
							Thread.sleep(2000);
							GoalReqfieldmsg.isDisplayed();
							System.out.println(GoalReqfieldmsg.getText());
							
						}
						
					}

					if (GoalText.isDisplayed()) {
						GoalText.click();
						Thread.sleep(8000);
						GoalSubmitbtn.click();
					}
					Thread.sleep(3000);
					if (GoalReqfieldmsg.isDisplayed()) {
						System.out.println(GoalReqfieldmsg.getText());
						GoalText.sendKeys(" ");
						Thread.sleep(6000);
					}
					if (GoalReqfieldmsg.isDisplayed()) {
						System.out.println(GoalReqfieldmsg.getText());
						GoalText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						GoalSubmitbtn.click();
					}
					GoalText.sendKeys("a@@");
					Thread.sleep(6000);
					if (GoalReqfieldmsg.isDisplayed()) {
						System.out.println(GoalReqfieldmsg.getText());
						GoalText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						GoalSubmitbtn.click();
					}
					GoalText.sendKeys("*&(^(*)@@$&%%^$");
					Thread.sleep(5000);
					if (GoalReqfieldmsg.isDisplayed()) {
						System.out.println(GoalReqfieldmsg.getText());
						GoalText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						GoalSubmitbtn.click();
					}
					Thread.sleep(5000);
					GoalText.sendKeys("11");
					if (GoalReqfieldmsg.isDisplayed()) {
						System.out.println(GoalReqfieldmsg.getText());
						GoalText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
						Thread.sleep(3000);
						GoalSubmitbtn.click();
					}
					Thread.sleep(5000);
					GoalText.sendKeys(goal);	
					

			  
			  //Goal Status
			  WebElement GoalStatus = driver.findElement(By.cssSelector("#select-improvement"));
			  GoalStatus.click();
				List<WebElement> StatusList = driver.findElements(By.xpath("//body/div[3]/div[3]/ul/li"));
				if (GoalStatus.isDisplayed()) {
					// System.out.println(ct);
					// State.click();
					int NoOfStatus = StatusList.size();
					// System.out.println(NoOfOrg);
					int i = 0;
					while (i < NoOfStatus) {
						String CList = StatusList.get(i).getText();
						// System.out.println(SList);
						// System.out.println(FeaturesNames.get(i).getText());
						if (CList.contains(goalstatus)) {
							StatusList.get(i).click();

							Thread.sleep(5000);
							break;
						}
						i++;
					}

				}
				Thread.sleep(8000);

				//Comments
				
				if (CommentsText.isDisplayed()) {
					CommentsText.click();
					Thread.sleep(8000);
					GoalSubmitbtn.click();
				}
				Thread.sleep(3000);
				if (CommentsReqfieldmsg.isDisplayed()) {
					System.out.println(CommentsReqfieldmsg.getText());
					CommentsText.sendKeys(" ");
					Thread.sleep(6000);
				}
				if (CommentsReqfieldmsg.isDisplayed()) {
					System.out.println(CommentsReqfieldmsg.getText());
					CommentsText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					GoalSubmitbtn.click();
				}
				CommentsText.sendKeys("a@@");
				Thread.sleep(6000);
				if (CommentsReqfieldmsg.isDisplayed()) {
					System.out.println(CommentsReqfieldmsg.getText());
					CommentsText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					GoalSubmitbtn.click();
				}
				CommentsText.sendKeys("*&(^(*)@@$&%%^$");
				Thread.sleep(5000);
				if (CommentsReqfieldmsg.isDisplayed()) {
					System.out.println(CommentsReqfieldmsg.getText());
					CommentsText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					GoalSubmitbtn.click();
				}
				Thread.sleep(5000);
				CommentsText.sendKeys("11");
				if (CommentsReqfieldmsg.isDisplayed()) {
					System.out.println(CommentsReqfieldmsg.getText());
					CommentsText.sendKeys((Keys.SHIFT), (Keys.UP), (Keys.DELETE));
					Thread.sleep(3000);
					GoalSubmitbtn.click();
				}
				Thread.sleep(5000);
				CommentsText.sendKeys(com);	
				Thread.sleep(5000);
				GoalSubmitbtn.click();
				Thread.sleep(2000);
				System.out.println(AlertMessage.getText());
				return msg = AlertMessage.getText();
		/*		if (GoalOrgRecord.isDisplayed()) {
					Thread.sleep(1200);
					System.out.println(GoalOrgRecord.getText());
				}
				Thread.sleep(5000);
				if (RecordCusOrgName.isDisplayed()) {
					System.out.println(RecordCusOrgName.getText());
					msg1 = RecordCusOrgName.getText();
				}*/
				
			  }
			  
			  public void ScoreCard_TC() throws InterruptedException, IOException {
					driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
					
					JavascriptExecutor js = (JavascriptExecutor) driver;
					String manual = (String) customer.get("MScore");
					String auto = (String) customer.get("AScore");
					String both = (String) customer.get("BScore");
					
					js.executeScript("window.scrollBy(300,0)");
					
					// Select score card
					Thread.sleep(3000);
					WebElement SCustomer = driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div/div[1]/button"));
					SCustomer.click();
					List<WebElement> CustomerList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
					if (SCustomer.isDisplayed()) {
						// State.click();
						int NoOfOrg = CustomerList.size();
						int i = 0;
						while (i < NoOfOrg) {
							String CList = CustomerList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (CList.contains(manual)) {
								CustomerList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}

					}
					Thread.sleep(8000);
					
					// Select score card
					Thread.sleep(3000);
					WebElement AutomatedScore = driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div/div[1]/button"));
					AutomatedScore.click();
					List<WebElement> scoreList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
					if (AutomatedScore.isDisplayed()) {
						// State.click();
						int NoOfOrg = scoreList.size();
						int i = 0;
						while (i < NoOfOrg) {
							String CList = scoreList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (CList.contains(auto)) {
								scoreList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}

					}
					
                       Thread.sleep(8000);
					
					// Select score card
					Thread.sleep(3000);
					WebElement BothScore = driver.findElement(By.xpath("//div/div[2]/div[2]/div[1]/div/div[1]/button"));
					BothScore.click();
					List<WebElement> bscoreList = driver.findElements(By.xpath("//body/div[2]/div[3]/ul/li"));
					if (BothScore.isDisplayed()) {
						// State.click();
						int NoOfOrg = bscoreList.size();
						int i = 0;
						while (i < NoOfOrg) {
							String CList = bscoreList.get(i).getText();
							// System.out.println(SList);
							// System.out.println(FeaturesNames.get(i).getText());
							if (CList.contains(both)) {
								bscoreList.get(i).click();

								Thread.sleep(5000);
								break;
							}
							i++;
						}

					}
					
					//CSv for AI
				/*	if(ScoreDownloadBtn.isDisplayed()) {
				    	   ScoreDownloadBtn.click();
				    	   System.out.println("score card downloaded sucessfully.");
				       }
					 int scorecardrows=  driver.findElements(By.xpath("//div/div[2]/div[1]/table/thead/tr/th")).size(); 
				       System.out.println("Total no of Rows:"+ scorecardrows); */
					
					
				       
				       js.executeScript("window.scrollBy(0,550)");
				       
				       
				       if(ScoringPercentage.isDisplayed())
						{
							System.out.println(ScoringPercentagevalues.getText());
							Thread.sleep(5000);
						
						}
						else
						{
							System.out.println("Scoring percentage dial is not displayed");
							
						}
				       
				       Thread.sleep(9000);
				       if(ScriptAdherencecard.isDisplayed()) {
				    	   
				    	   int rows=  driver.findElements(By.xpath("//div/div[2]/div[1]/table/thead/tr/th")).size(); 
					       System.out.println("Total no of Rows:"+ rows); 
					       
					       ScriptAdherenceDownload.click();
					       System.out.println("Script adherence scorecard download sucessfully.");
					       
					       Thread.sleep(5000);
					       js.executeScript("window.scrollBy(0,0)");
				       }
				      
				       }
			  
			}
		
		
