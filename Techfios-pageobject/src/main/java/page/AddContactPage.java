package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContactPage {
    

	WebDriver driver;
	public  AddContactPage(WebDriver ldriver) {
		this.driver = driver;
	}
	@FindBy(name="account")
	WebElement FullName;
	@FindBy(name="company")
	WebElement CompanyName;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="address")
	WebElement address;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="zip")
	WebElement zip;
	@FindBy(id="submit")
	WebElement submit;
	
	public void fillingupaddressForm(String FName, String CName, String Email, String Phone, String Address, String City, String State, String ZIP) {
		 FullName.sendKeys(FName);
		 CompanyName.sendKeys(CName);
		 email.sendKeys(Email);
		 phone.sendKeys(Phone);
		 address.sendKeys(Address);
		 city.sendKeys(City);
		 state.sendKeys(State);
		 zip.sendKeys(ZIP);
		 submit.click();
		 
		 
	}
	
}
