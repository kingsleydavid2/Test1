package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.Homepage;

//import com.thestreet.test.pages.LoginPage;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class BaseTest {
	
	public static WebDriver driver;
	public static Homepage ALLpageelements;
	
	
	@BeforeSuite
	public void beforeSuite() {
		

		System.setProperty("WebDriver.chrome.driver", "D://Sel1/temp/chromedriver.exe");
		driver = new ChromeDriver();
		ALLpageelements = new Homepage();
	
		}
	
	@AfterSuite
	public void afterSuite() {
		driver.quit();
		

}
}

