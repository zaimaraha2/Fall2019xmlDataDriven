package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	@Test
	@Parameters({"username","password","account","company","email","phone","address","city","state","zip"})
	public void AddContactInformation(String username, String password, String FName, String CName, String Email, String Phone, String Address, String City, String State, String ZIP ) {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
	LoginPage logintotechfios = PageFactory.initElements(driver, LoginPage.class);
	logintotechfios.Login(username, password);	
	
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	home.NavigateToContact();
	
	AddContactPage addcontact = PageFactory.initElements(driver, AddContactPage.class);
	addcontact.fillingupaddressForm(FName, CName, Email, Phone, Address, City, State, ZIP);
	driver.close();
	driver.quit();
	}
		
		
	}

