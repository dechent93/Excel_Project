package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CustomerSummary extends BasePage {

	WebDriver driver;

	public CustomerSummary(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//th[@colspan='3']") 
	WebElement SUMMARY_BUTTON_ON_SUMMARY_PAGE;

	public void validateCustomerSummary() {

		waitForElement(driver, 5, SUMMARY_BUTTON_ON_SUMMARY_PAGE);
		Assert.assertEquals(SUMMARY_BUTTON_ON_SUMMARY_PAGE.getText(), "Accounting Summary",
				"Summary Page does not exist");

	}
	
}
