package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signInButton;
	@FindBy(xpath="//p[text()=\"Dashboard\"]") 
	private WebElement dashboardtitle;
	@FindBy(xpath="//button[@data-dismiss='alert']")
	private WebElement alertdisplayed;
	
	
	
	
	public LoginPage enterUsernameOnUsernameField(String username) {
		usernameField.sendKeys(username);
		return this;
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
		return this;
	}

	public HomePage clickSignInButton() {
		signInButton.click();
		return new HomePage(driver);
	}
	public boolean isSignInButtonDisplayed()
	{
		return signInButton.isDisplayed();
	}
	public boolean isdashboardDisplayed()
	{
		return dashboardtitle.isDisplayed();
	}
	public boolean iserrorMessageDisplayed()
	{
		return alertdisplayed.isDisplayed();
	}
}
