package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResumePage extends BasePage
{
	@FindBy(xpath="(//span[@class='edit icon'])[1]")
	private WebElement editsum;
	@FindBy(xpath="//button[.='Save']")
    private WebElement savesum;

	 public ResumePage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	 public void clickoneditsum(WebDriver driver) throws Exception 
	 {
		ElementIsPresent(driver, editsum);
		 editsum.click();
		}
		
	 public void clickonsavesum(WebDriver driver)throws Exception 
		{
			ElementIsPresent(driver, savesum);
			savesum.click();
		}


}
