package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.BaseClass;
import constants.Constants;
import constants.Messages;
import pages.CategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class CategoryTest extends BaseClass {

	@Test(description = "adding a new product to the category", priority = 1)
	public void addingANewProductToTheCategory() throws IOException { 

		String username = ExcelUtility.readStringData(1, 0, "Login");
		String password = ExcelUtility.readStringData(1, 1, "Login");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username).enterPasswordOnPasswordField(password).clickSignInButton();
		
		String categoryname = ExcelUtility.readStringData(1, 0, "Category");
		String choosefile = Constants.TESTDATAFILE1;
        CategoryPage categorypage = new CategoryPage(driver);
		categorypage.clickCategoryPage().clickCategoryNewButton().addCatergoryField(categoryname).clickDiscountField().chooseFileButton(choosefile).clickSaveButton().categoryTitleDisplayed();
		boolean categoryTitleDisplayed = categorypage.categoryTitleDisplayed();
		Assert.assertTrue(categoryTitleDisplayed, Messages.TITLENOTFOUND);
	}

	

}
