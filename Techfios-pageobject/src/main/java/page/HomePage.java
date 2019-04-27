package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public  HomePage(WebDriver ldriver) {
		this.driver = driver;
	}
	@FindBy(xpath= "//span[text()='CRM']")
	WebElement CRM;
	@FindBy(xpath= "//a[text()='Add Contact']")
	WebElement AddContact;
	
	
	public void NavigateToContact() {
	
		 CRM.click();
		 AddContact.click();
	}


}
