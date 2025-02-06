package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import automationCore.BaseClass;
import constants.Messages;
import pages.AdminUsersPage;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends BaseClass {

	@Test(groups = { "smoke" }, description = "adding a new user in the admin user section", priority = 1)
	public void addNewAdminUserInTheAdminUsersSection() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver).enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

		FakerUtility faker = new FakerUtility();
		String username1 = faker.generateNewUserName();
		String password1 = faker.generateNewPassword();
		AdminUsersPage obj = new AdminUsersPage(driver);
		obj.clickadminUsersPage();
		obj.newUserClick().enterUsernameField(username1).enterPassword(password1).clickUserType().clickSaveButton();
		boolean admintitleisdisplayed = obj.adminTitleIsDisplayed();
		Assert.assertTrue(admintitleisdisplayed, Messages.ADMINERROR);
	}

	@Test(description = "search and verify the user ", priority = 2)
	public void searchAndVerifyTheUsersInAdminUsersSection() throws IOException {
		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password);
		loginpage.clickSignInButton();

		AdminUsersPage adminuser = new AdminUsersPage(driver);
		adminuser.clickadminUsersPage();
		adminuser.searchField().categorySearchField().searchButtonClick().resetButtoncClick();
		boolean admintitleisdisplayed = adminuser.adminTitleIsDisplayed();
		Assert.assertTrue(admintitleisdisplayed, Messages.ADMINERROR);

	}
}