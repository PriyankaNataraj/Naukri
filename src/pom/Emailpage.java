package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emailpage extends BasePage {
	@FindBy(xpath="//div[.='My Naukri']")
	private WebElement editmail;
	@FindBy(xpath="//a[.='Settings']")
    private WebElement setbtn;
	@FindBy(xpath="//li[.='Account']")
    private WebElement accbtn;
	@FindBy(xpath="//a[.='Change Email']")
    private WebElement changebtn;
	@FindBy(xpath="//input[@id='secondary-email']")
	 private WebElement entermail;
	@FindBy(xpath="//button[.='Save']")
	 private WebElement savebtn;

	 public Emailpage(WebDriver driver) throws InterruptedException
		{
		 Thread.sleep(4000);
			PageFactory.initElements(driver,this);
		}
		
	public void mynaukri(Actions a)
	{
		
		a.moveToElement(editmail).perform();
	}
	public void settings(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, setbtn);
		setbtn.click();
	}
	public void accounts(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, accbtn);
		accbtn.click();
	}
	public void change(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, changebtn);
		changebtn.click();
	}
	public void enteremail(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, entermail);
		entermail.sendKeys("nati.arya@gmail.com");
	}
	public void savemail(WebDriver driver) throws Exception
	{
		ElementIsPresent(driver, savebtn);
		savebtn.click();
	}
	


}
