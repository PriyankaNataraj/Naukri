package testscripts;

import org.testng.annotations.Test;

import pom.Edueditpage;
import pom.Homepage;
import pom.LoginPage;
import generic.Autoconstant;
import generic.BaseTest;
import generic.Excel;

public class UpdateeduTest extends BaseTest implements Autoconstant {
	@Test
	public void education() throws Exception
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
	
		Edueditpage p=new Edueditpage(driver);
		p.clickoneduedit(driver);
		p.clickonedusave(driver);
	}

}
