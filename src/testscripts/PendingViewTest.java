package testscripts;

import generic.BaseTest;
import generic.Excel;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.LoginPage;
import pom.Logoutpage;
import pom.PendingviewPage;

public class PendingViewTest extends BaseTest
	{
		@Test
		public void pending() throws Exception
		{
			
		LoginPage u=new LoginPage(driver);
		u.flogin();
		Thread.sleep(3000);
		Homepage h= new Homepage(driver);
		h.enterUsername(Excel.getdata(path, "Sheet1", 1, 0));
		h.enterPassword(Excel.getdata(path, "Sheet1", 2, 0));
		h.clickOnLogin();
		Thread.sleep(2000);

		PendingviewPage v= new PendingviewPage(driver);
		Thread.sleep(4000);
		v.profileclick( driver);
		Thread.sleep(4000);
		v.viewclick(driver);
		Thread.sleep(2000);
		Logoutpage l1=new Logoutpage(driver);
		Actions a=new Actions(driver);
		l1.logoutapp(a,driver);
		
		}


}
