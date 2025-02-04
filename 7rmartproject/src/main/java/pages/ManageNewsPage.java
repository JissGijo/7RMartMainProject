package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//p[text()='Manage News']")
	private WebElement clickmanagenewsmenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clicknewfield;

	@FindBy(xpath = "//textarea[@id='news']")
	private WebElement newstextfield;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//h1[@class='m-0 text-dark']")
    private WebElement isTitleDisplayed;
    
	public void clickmanagenewsmenu() {
		PageUtility.clickOnElement(clickmanagenewsmenu);
	}

	public ManageNewsPage clicknewfield() {
		PageUtility.clickOnElement(clicknewfield);
		return this;

	}

	public ManageNewsPage newstextfield(String news) {
		newstextfield.sendKeys(news);
		return this;
	}

	public ManageNewsPage clicksavebutton() {
		PageUtility.clickOnElement(clicksavebutton);
		return this;
	}
	public boolean isTitleDisplayed() {
		return isTitleDisplayed.isDisplayed();
	}
	
	}

