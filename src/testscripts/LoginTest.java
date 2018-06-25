package testscripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import generic.BaseTest;


import generic.Excel;
import pom.Homepage;
import pom.LoginPage;
import pom.Logoutpage;



public class LoginTest extends BaseTest {
	@Test
	public void uploadingCV() throws Exception
	{
		LoginPage u=new LoginPage(driver);
		u.flogin();
		Thread.sleep(5000);
		
		Homepage h= new Homepage(driver);
		h.enterUsername(Excel.getdata(path, "Sheet1", 1, 0));
		h.enterPassword(Excel.getdata(path, "Sheet1", 2, 0));
		h.clickOnLogin();
		Thread.sleep(2000);

		
	
		
		//******************logoutApplication********//
		Logoutpage l1=new Logoutpage(driver);
		Actions a=new Actions(driver);
		l1.logoutapp(a,driver);
		
		
	}

}
