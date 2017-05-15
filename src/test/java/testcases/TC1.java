package testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import core.BaseTest;
import methods.wrappermethods;

public class TC1 extends wrappermethods {

	ExtentReports report;
	ExtentTest logger; 
	@Test (priority=1)
	public void loginpage1() throws InterruptedException {
	driver.navigate().to("https://www.linkedin.com");
	report=new ExtentReports("C:\\Report\\LearnAutomation.html");
	logger=report.startTest("VerifyLogin");
	logger.log(LogStatus.PASS, "Browser started ");
	Thread.sleep(5000);
	ALLpageelements.userName.sendKeys("tstchennai16@gmail.com");
	ALLpageelements.passWord.sendKeys("thestreet");
	logger.log(LogStatus.INFO, "LinkedIn login is up and running");
	ALLpageelements.Login.click();
	logger.log(LogStatus.PASS, "Login Passed");
	verifyTitle("LinkedIn1");
	
	report.endTest(logger);
	report.flush();
	//clickById("login-submit");
	Thread.sleep(8000);
	//verifyTitle("ember2652");
}
	
	@Test (priority=2)
	public void loginpage2() throws InterruptedException {
	driver.navigate().to("https://www.linkedin.com");
	
}
}

