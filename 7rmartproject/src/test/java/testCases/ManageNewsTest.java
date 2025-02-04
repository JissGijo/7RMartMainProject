package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends BaseClass {

	@Test(description = "Addding A New News To The Manage News Section", priority = 1)
	public void adddingANewNewsToTheManageNewsSection() throws IOException { 

		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickSignInButton();

		// add news
		String news = ExcelUtility.readStringData(1, 0, "News");
		ManageNewsPage managepage = new ManageNewsPage(driver);
		managepage.clickmanagenewsmenu();
		managepage.clicknewfield().clicksavebutton().newstextfield(news).clicksavebutton();
		boolean isTitledisplayed = managepage.isTitleDisplayed();
		Assert.assertFalse(isTitledisplayed, Messages.MANAGENEWSTITLE);

	}

}
