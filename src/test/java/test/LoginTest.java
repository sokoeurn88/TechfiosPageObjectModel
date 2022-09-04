package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	@Test
	public void TechfiosLoginTest() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		
		
		LoginPage loginToTechfios = PageFactory.initElements(driver, LoginPage.class);	//PageFactory allow access to LoginPage's method
		loginToTechfios.login("techfiosdemo@gmail.com", "abc123");
		
//		driver.close();
//		driver.quit();
	}

}
