package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement us;
	@FindBy(id="pLogin")
	private WebElement pwd;
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginbtn;

	@FindBy(xpath="//a[.='UPDATE PROFILE']")
	private WebElement profieclk;
	
	 public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
		
		public void enterUsername(String user)
		{
			us.sendKeys(user);
		}
		public void enterPassword(String passwd)
		{
			pwd.sendKeys(passwd);
			
		}
		public void clickOnLogin()
		{
			loginbtn.click();
		}
		 
		public void clickonprofile(WebDriver driver) throws Exception
		{
			ElementIsPresent(driver,profieclk);
			profieclk.click();
		}
			
		}
