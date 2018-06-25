package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class NotifyPage extends BasePage {
	@FindBy(xpath="//a[@id='blobId']")
	private WebElement notify;
	 public NotifyPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	 public void clickonnotify(Actions a) 
	 {
		
		 a.moveToElement(notify).perform();
		}
	

}
