package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") 
	WebElement COMPANY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")
	WebElement GROUP_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON_ON_ADD_CONTACT;
	


	// Interactive Methods

	String enteredName;
	public void enterFullName(String fullName) {
		enteredName = fullName + generateNumber(999);
		NAME_FIELD.sendKeys(enteredName);
	}
		
	public void enterCompanyName(String company) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(COMPANY_FIELD));
		selectDropdown(COMPANY_FIELD, company);		
	}
	
	public void enterEmail(String email) {
		EMAIL_FIELD.sendKeys(email+generateNumber(999));
	}
	
	public void enterPhone(String phone) {
		PHONE_FIELD.sendKeys(phone + generateNumber(99));
	}
	
	public void enterAddress(String address) {
		ADDRESS_FIELD.sendKeys(address);
	}
	
	public void enterCity(String city) {
		CITY_FIELD.sendKeys(city);
	}
	
	public void enterState(String state) {
		STATE_FIELD.sendKeys(state);
	}
	
	public void enterZip(String zip) {
		ZIP_FIELD.sendKeys(zip);
	}
	
	public void enterCountry(String country) {
		COUNTRY_FIELD.sendKeys(country);
	}
	public void selectGroup(String group) {
		selectDropdown(GROUP_FIELD, group);		

	}
	public void clickSaveButtonOnAddContact() {
		SAVE_BUTTON_ON_ADD_CONTACT.click();
	}
	
}
