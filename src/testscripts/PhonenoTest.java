package testscripts;

import generic.BaseTest;
import generic.Excel;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.LoginPage;
import pom.PhonenoPage;

public class PhonenoTest extends BaseTest
{
	@Test
	public void uploademail() throws Exception
	{
		
	LoginPage u=new LoginPage(driver);
	u.flogin();
	Thread.sleep(3000);
	Homepage h= new Homepage(driver);
	h.enterUsername(Excel.getdata(path, "Sheet1", 1, 0));
	h.enterPassword(Excel.getdata(path, "Sheet1", 2, 0));
	h.clickOnLogin();
	Thread.sleep(2000);

	Actions a=new Actions(driver);
	PhonenoPage c=new PhonenoPage(driver);
	c.mynaukri(a);
	Thread.sleep(3000);
	c.settings(driver);
	Thread.sleep(4000);
	c.accounts(driver);
	Thread.sleep(2000);
	c.change(driver);
	Thread.sleep(2000);
	c.enterphone(driver);
	c.savephone(driver);
	}

}
