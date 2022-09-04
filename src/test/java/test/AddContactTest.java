package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	@Test
	@Parameters({"Loginemail","password","Name","Company","Email","phone","address","City","State","Zip"})
	public void addingContact(String loginemail, String password, String Name, String Company, String Email, String Phone, String Address,  String City, String State, String Zip) {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		LoginPage loginToTechfios = PageFactory.initElements(driver, LoginPage.class);
		loginToTechfios.login(loginemail, password);
		
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.navigateToAddContact();
		
		AddContact contact = PageFactory.initElements(driver, AddContact.class);
		contact.fillingUpAddressForm(Name, Company, Email, Phone, Address, City, State, Zip);
		
//		driver.close();
//		driver.quit();
		
	}

}
