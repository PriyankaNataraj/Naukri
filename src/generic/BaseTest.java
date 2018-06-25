package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant {
	public  WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/");
	}
	@AfterMethod
	public void closeapp()
	{
	driver.close();
	}

}
