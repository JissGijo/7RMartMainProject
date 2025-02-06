package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class CategoryPage {
	public WebDriver driver;

	public CategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()=\"Category\"]")
	private WebElement clickcategorymenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clickcategorynew;
	@FindBy(xpath = "//input[@id='category']")
	private WebElement categoryfield;
	@FindBy(xpath = "//li[@id='134-selectable']")
	private WebElement discountfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement choosefilebutton;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath = "//h1[text()=\"Add Category\"]")
	private WebElement iscategorytitledisplayed;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchfield;
	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement categorysearchfield;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement searchbuttton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetbutton;

	public CategoryPage clickCategoryPage() {
	     WaitUtility.waitUntilElementToBeClickable(driver, clickcategorymenu);
		PageUtility.clickOnElement(clickcategorymenu);
		return this;
	}    

	public CategoryPage clickCategoryNewButton() {
		PageUtility.clickOnElement(clickcategorynew);
		return this;
	}

	public CategoryPage addCatergoryField(String categoryname) {
		categoryfield.sendKeys(categoryname);
		return this;

	}

	public CategoryPage clickDiscountField() {
		PageUtility.clickOnElement(discountfield);
		return this;
	}

	public CategoryPage chooseFileButton(String choosebutton) {
		choosefilebutton.sendKeys(choosebutton);
		return this;
	}

	public CategoryPage clickSaveButton() {

		Actions act = new Actions(driver);
		act.moveToElement(clicksavebutton).click().perform();
		return this;

	}

	public boolean categoryTitleDisplayed() {
		return iscategorytitledisplayed.isDisplayed();
	}

	public CategoryPage clickSearchField() {
		PageUtility.clickOnElement(searchfield);
		return this;
	}

	public CategoryPage categorySearchField(String categoryname) {
		categorysearchfield.sendKeys(categoryname);
		return this;
	}

	public CategoryPage clickSearchButton() {
		PageUtility.clickOnElement(searchbuttton);
		return this;
	}

	public CategoryPage clickResetButton() {
		PageUtility.clickOnElement(resetbutton);
		return this;
	}
}
