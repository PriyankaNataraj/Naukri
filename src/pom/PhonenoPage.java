package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhonenoPage extends BasePage{
	@FindBy(xpath="//div[.='My Naukri']")
	private WebElement editph;
	@FindBy(xpath="//a[.='Settings']")
    private WebElement setbtn;
	@FindBy(xpath="//li[.='Account']")
    private WebElement accbtn;
	@FindBy(xpath="//i[@class='icon']")
    private WebElement changebtn;
	@FindBy(xpath="//input[@id='edit-phone']")
	 private WebElement editphone;
	@FindBy(xpath="//button[.='Save']")
	 private WebElement savebtn;
	 public PhonenoPage(WebDriver driver) throws InterruptedException
		{
		 Thread.sleep(4000);
			PageFactory.initElements(driver,this);
		}
	 public void mynaukri(Actions a)
		{
			
			a.moveToElement(editph).perform();
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
		public void enterphone(WebDriver driver) throws Exception
		{
			ElementIsPresent(driver, editphone);
			editphone.sendKeys("9112003006");
		}
		public void savephone(WebDriver driver) throws Exception
		{
			ElementIsPresent(driver, savebtn);
			savebtn.click();
		}


	

}
