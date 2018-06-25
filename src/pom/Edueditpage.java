package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edueditpage extends BasePage {
	@FindBy(xpath="(//span[@class='col s1 icon edit'])[1]")
	private WebElement eduedit;
	@FindBy(xpath="//button[@id='saveEducation']")
    private WebElement saveedu;

	 public Edueditpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	 public void clickoneduedit(WebDriver driver) throws Exception 
	 {
		ElementIsPresent(driver, eduedit);
		 eduedit.click();
		}
		
	 public void clickonedusave(WebDriver driver)throws Exception 
		{
			ElementIsPresent(driver, saveedu);
			saveedu.click();
		}
	


}
