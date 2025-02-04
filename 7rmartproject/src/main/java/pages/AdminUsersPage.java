package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {

  public WebDriver driver;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	@FindBy(xpath = "//a[@class='small-box-footer']")
	private WebElement adminUsersClick;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newuserclick;
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernametextfield;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordtextfield;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement clicksavebutton;
	@FindBy(xpath = "//section[@class='content']//div[1]//a[2]")
	private WebElement searchfield;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement categorysearchfield;
	@FindBy(xpath = "//button[@name='Search']")
	private WebElement searchbuttton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetbutton;
	@FindBy(xpath = "//h1[text()=\"Admin Users\"]")
	private WebElement admintitleisdisplayed;

	public void  clickadminUsersPage() {
				PageUtility.clickOnElement(adminUsersClick);
				
	}

	public AdminUsersPage newUserClick() {
		PageUtility.clickOnElement(newuserclick);
		return this;
		
	}

	public AdminUsersPage  enterUsernameField(String username) {
		usernametextfield.sendKeys(username);
		return this;
	}
	public AdminUsersPage  enterPassword(String password) {
		passwordtextfield.sendKeys(password);
		return this;
	}

	public AdminUsersPage  clickUserType() {
		Select select = new Select(usertype);
		select.selectByVisibleText("Staff");
		return this;
		
	}

	public AdminUsersPage  clickSaveButton() {
		PageUtility.clickOnElement(clicksavebutton);
		return this;
	}
	public AdminUsersPage  searchField()
	{
		PageUtility.clickOnElement(searchfield);
		return this;
		
	}
	public AdminUsersPage  categorySearchField()
	{
		categorysearchfield.sendKeys("jiss");
		return this;
	}
	public AdminUsersPage searchButtonClick() {
		PageUtility.clickOnElement(searchbuttton);
		return this;
	}
	public AdminUsersPage resetButtoncClick() {
		PageUtility.clickOnElement(resetbutton);
		return this;
		
	}
	public boolean adminTitleIsDisplayed() {
		return admintitleisdisplayed.isDisplayed();
	}
}
