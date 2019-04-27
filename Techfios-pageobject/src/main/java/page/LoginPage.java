package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver ldriver) {
		this.driver = driver;
	}
	@FindBy(xpath= "//input[@id=\"username\"]")
	WebElement Username;
	@FindBy(xpath= "//input[@id=\"password\"]")
	WebElement Password;
	@FindBy(xpath= "//button[@type=\"submit\"]")
	WebElement SignInButton;	
	
public void Login(String username, String password) {
	Username.sendKeys(username);
	Password.sendKeys(password);
	SignInButton.click();
}
}
