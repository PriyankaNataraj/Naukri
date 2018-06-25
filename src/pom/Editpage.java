package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editpage extends BasePage{
	@FindBy(xpath="(//span[@class='edit icon'])[2]")
	private WebElement edit;
	@FindBy(xpath="//button[@id='saveKeySkills']")
    private WebElement save;

	 public Editpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	 public void clickoneduedit(WebDriver driver) throws Exception 
	 {
		ElementIsPresent(driver, edit);
		 edit.click();
		}
		
	 public void clickonedusave(WebDriver driver)throws Exception 
		{
			ElementIsPresent(driver, save);
			save.click();
		}
	
}
