package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLoginPage;
import Utility.Parametrization1;
import pojo.Browser2;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		driver = Browser2.openBrowser();
	}

	@Test
	public void loginWithValidCredentials() throws IOException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String userName = Parametrization1.getData("maven1",0,1);
		String password = Parametrization1.getData("maven1",1,1);
		zerodhaLoginPage.enterUserID(userName);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnlogin();
	}
	
	@Test
	
	public void forgotPasswordLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
	}
	
	@Test
	public void signupLinkTest() {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignUp();		
	}
}
