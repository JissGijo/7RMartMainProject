package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomePageTest extends BaseClass {
	private static final String ELEMENTNOTFOUND = null;

	@Test(groups = { "smoke" }, description = "click logout", priority = 1)

	public void logoutThePageFromHomePage() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickSignInButton();

		HomePage homepage = new HomePage(driver);
		homepage.clickAdminUser().clickLogOut();
		
		boolean islogintitledisplayed = homepage.isLoginTitleDispalyed();
		Assert.assertTrue(islogintitledisplayed,Messages.LOGOUTERROR);

	}
}