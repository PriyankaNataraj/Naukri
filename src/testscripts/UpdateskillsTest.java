package testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.Editpage;
import pom.Homepage;
import pom.LoginPage;
import pom.Logoutpage;
import generic.Autoconstant;
import generic.BaseTest;
import generic.Excel;

public class UpdateskillsTest extends BaseTest implements Autoconstant
{
		@Test
		public void update() throws Exception
		{
			
		LoginPage u=new LoginPage(driver);
		u.flogin();
		Thread.sleep(3000);
	
		
	Homepage h= new Homepage(driver);
		h.enterUsername(Excel.getdata(path, "Sheet1", 1, 0));
		h.enterPassword(Excel.getdata(path, "Sheet1", 2, 0));
		h.clickOnLogin();
		Thread.sleep(2000);
		h.clickonprofile(driver);
	
		Editpage e=new Editpage(driver);
	
		e.clickoneduedit(driver);
		e.clickonedusave(driver);
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		Logoutpage l=new Logoutpage(driver);
		l.logoutapp(a, driver);
	
	
		
		
	}

}

