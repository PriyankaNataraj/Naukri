package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Logoutpage extends BasePage {
	
	
	@FindBy(xpath="//div[.='My Naukri']") //declaration
	private WebElement mynaukri;
	
	@FindBy(xpath="//a[.='Logout']")     //declaration
	private WebElement log;
	
	public Logoutpage(WebDriver driver) //initialization
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void logoutapp(Actions a,WebDriver driver) throws Exception    //logout action(utilization)
	{
	ElementIsPresent(driver,mynaukri);
	a.moveToElement(mynaukri).perform();
	log.click();
	}

}

