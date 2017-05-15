package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseTest;

public class Homepage extends BaseTest {
public Homepage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@class='login-email']")
	public WebElement userName;
	
	@FindBy (xpath = "//input[@id='login-password']")
	public WebElement passWord;
	
	@FindBy (xpath = "//input[@id='login-submit']")
	public WebElement Login;
	
	//@FindBy (xpath = ("//div[@id='testId']/a").getAttribute("href"))
	public WebElement verifyTextContainsByID;

}
