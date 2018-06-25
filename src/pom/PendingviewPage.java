package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PendingviewPage  extends BasePage {
		
		
		@FindBy(xpath="//a[.='UPDATE PROFILE']") //declaration
		private WebElement profileclk;
		
		@FindBy(xpath="//a[.='VIEW ALL']")     //declaration
		private WebElement viewclk;
		
		public PendingviewPage(WebDriver driver) //initialization
		{
			PageFactory.initElements(driver,this);
			
		}
		
		
		
		public void profileclick(WebDriver driver) throws InterruptedException     
		{
			Thread.sleep(3000);
			profileclk.click();
		}
		public void viewclick(WebDriver driver) throws Exception    
		{
		ElementIsPresent(driver,viewclk);
	
		viewclk.click();
		}


}
