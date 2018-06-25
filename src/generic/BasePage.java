package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage implements Autoconstant {
public void  VerifypageisDisplay(WebDriver driver,String eResult) throws Exception
{
	
	WebDriverWait wait=new WebDriverWait(driver,50);
   try {
  wait.until(ExpectedConditions.titleIs(eResult));
   Reporter.log("Pass:Expected page is displayed",true);
   }
   catch(Exception e)
   {
	Reporter.log("Fail:Expected page is not displayed",true);
	Assert.fail();
   }
}

//****************************
public void VerifyText(WebElement e,String  expected)
{
	String actual=e.getText();
	Assert.assertEquals(actual, expected);	
}

//*******************************
public void ElementIsPresent(WebDriver driver,WebElement element) throws Exception
{
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	   try {
	   wait.until(ExpectedConditions.visibilityOf(element));
	   Reporter.log("Pass:Element is displayed",true);
	   }
	   catch(Exception e)
	   {
		Reporter.log("Fail:Element is not displayed,TimeOut",true);
		Assert.fail();
	   }

}

}
