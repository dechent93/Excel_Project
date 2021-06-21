package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {	//evoking constructor
		this.driver = driver;
	}
	
	//Element library
	
//	WebElement USER_NAME = driver.findElement(By.xpath("//*[@id=\"username\"]")); This technique does not work with page object model.
//	By USER_NAME_FIELD_LOCATOR = By.xpath("//*[@id=\"username\"]");This technique does not work with page object model.
	
	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]") 
	WebElement USERNAME_FIELD;
	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy(how=How.XPATH, using="/html/body/div/div/div/form/div[3]/button") 
	WebElement LOGIN_BUTTON;
		
	//Interactive Methods
	
	public void insertUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
		
	public void insertPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
		
	}
	public void clickSignInButton() {
		LOGIN_BUTTON.click();
		
	}
	public void signInOperation(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		LOGIN_BUTTON.click();
	}
}
