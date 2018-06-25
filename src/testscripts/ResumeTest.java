package testscripts;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.Homepage;
import pom.ResumePage;
import pom.LoginPage;

public class ResumeTest extends BaseTest{
	@Test
	public void summary() throws Exception
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
	
		ResumePage s=new ResumePage(driver);
		s.clickoneditsum(driver);
		s.clickonsavesum(driver);
	}

}

