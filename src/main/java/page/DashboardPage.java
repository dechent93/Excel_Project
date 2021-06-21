package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]")
	WebElement CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]")
	WebElement ADD_CUSTOMER_BUTTON_ELEMENT;



	public void validateDashboardPage() {

		waitForElement(driver, 3, DASHBOARD_ELEMENT);
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dashboard page not found");

	}

	public void clickCustomerButton() {
		waitForElement(driver, 3, CUSTOMER_ELEMENT);
		Assert.assertEquals(CUSTOMER_ELEMENT.getText(), "Customers", "Customers page not found");
		CUSTOMER_ELEMENT.click();

	}

	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
//	public void clickListCustomerButton() {
//		LIST_CUSTOMER_BUTTON_ELEMENT.click();
//	}
}