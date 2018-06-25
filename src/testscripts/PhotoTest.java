package testscripts;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.Homepage;
import pom.Photopage;
import pom.LoginPage;

public class PhotoTest extends BaseTest {
	@Test
	public void photo() throws Exception
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
			Thread.sleep(3000);
		
		Photopage t=new Photopage(driver);

		Thread.sleep(4000);
		t.clickoncamera(driver);
		Thread.sleep(4000);
		t.clickonupload();
		t.clickonsave(driver);
		Thread.sleep(3000);
	
	}

	}
