package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class SubCategoryPage {
	public WebDriver driver;

	public SubCategoryPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//p[text()=\"Sub Category\"]")
	private WebElement clickSubcategorymenu;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement clicknewcategory;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	private WebElement categoryfield;
	@FindBy(xpath = "//option[@value='698']")
	private WebElement selectcategory;
	@FindBy(xpath="//input[@id='subcategory']")
	private WebElement entersubcategoryfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement choosefilebutton;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']")
	private WebElement clickcancelbutton;
	@FindBy(xpath = "//h1[@class='m-0 text-dark']")
	private WebElement issubcategorytitledisplayed;
	
	public void subCategoryMenu() {
		PageUtility.clickOnElement(clickSubcategorymenu);
	}
	public SubCategoryPage clickNewCategory() {
		PageUtility.clickOnElement(clicknewcategory);
		return this;
	}
	public SubCategoryPage selectCategory() {
		PageUtility.clickOnElement(selectcategory);
		return this;
	}
	public SubCategoryPage CategoryField() {
		PageUtility.clickOnElement(categoryfield);
		return this;
	}
	
	public SubCategoryPage entersubCategory(String category) {
		entersubcategoryfield.sendKeys(category);
		return this;
		 
	}
	public SubCategoryPage chooseFilebutton(String choosebutton) {
		choosefilebutton.sendKeys(choosebutton);
		return this;
		 
	}
	public SubCategoryPage clickSavebutton() {
		PageUtility.clickOnElement(clicksavebutton);
		return this;
		 
	}
	public void cancelButton() {
		PageUtility.clickOnElement(clickcancelbutton);
	}
	public boolean categoryTitleDisplayed() {
		return issubcategorytitledisplayed.isDisplayed();
	}


}
