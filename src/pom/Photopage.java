package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Photopage extends BasePage {

	@FindBy(xpath="//img[@class='user-img']")
	private WebElement cam;
	@FindBy(xpath="//input[@id='fileUpload']")
	private WebElement uploadpic;
	@FindBy(xpath="//button[.='SAVE PHOTO']")
	private WebElement savepic;

	
	 public Photopage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 public void clickoncamera(WebDriver driver) throws Exception
		{
			ElementIsPresent(driver,cam);
			cam.click();
		}
	 public void clickonupload() 
		{
			
			uploadpic.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
		}
	 public void clickonsave(WebDriver driver) throws Exception
		{
			ElementIsPresent(driver,savepic);
			savepic.click();
		}
	
	
	
	

}
