package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Homepagestock;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization1;
import pojo.Browser2;

public class PinPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver =Browser2.openBrowser();
	}
	
	@Test
	
	//public void loginToZerodhaWithPinTest() throws IOException, InterruptedException {
		//ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
	
	public void clickOnLoginWithoutData() throws IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnlogin();
		String text = zerodhaLoginPage.getErrorText();
		
		String expectedText = "User ID should be minimum 6";
		
		Assert.assertEquals(text,expectedText);  //Hard Assert
		
		String userName = Parametrization1.getData("maven1",0,1);
		String password = Parametrization1.getData("maven1",1,1);
		zerodhaLoginPage.enterUserID(userName);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnlogin();
		Thread.sleep(5000);
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pin = Parametrization1.getData("maven1",2,1);
		System.out.println(pin);
		zerodhaPinPage.enterPin(pin, driver);
		zerodhaPinPage.clickOnContinue();
		
		Thread.sleep(5000);
		Homepagestock homepagestock = new Homepagestock(driver);
		homepagestock.clickOnSearchbox();
		String company =Parametrization1.getData("maven1",4,1);
		Thread.sleep(3000);
		homepagestock.enterComapanyName(company);
		
		homepagestock.mouseAction(driver);
	    homepagestock.misClick(driver);
	    homepagestock.marketClick(driver);
	    String qty = Parametrization1.getData("maven",3,1);
	    homepagestock.enterQuality(qty);
	    homepagestock.submit();
	  		
	}

}

