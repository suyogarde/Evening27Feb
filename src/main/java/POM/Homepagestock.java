package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagestock {
	@FindBy(xpath="//input[@icon='search']")private WebElement searchbox;
    @FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement tatashare;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement buy;
	@FindBy(xpath="(//label[@class='su-radio-label'])[7]")private WebElement mis;
	@FindBy(xpath="(//label[@class='su-radio-label'])[8]")private WebElement cnc;
	@FindBy(xpath="(//label[@class='su-radio-label'])[9]")private WebElement market;
	@FindBy(xpath="(//label[@class='su-radio-label'])[10]")private WebElement limit;
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement quantity;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	
	public Homepagestock(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSearchbox() {
		searchbox.click();	
	}
	 public void enterComapanyName(String company) {
		searchbox.sendKeys(company);	
	}
	
	public void mouseAction(WebDriver driver ) throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(tatashare).perform();
		Thread.sleep(2000);
		action.moveToElement(buy);
		action.click();
		action.perform();
	}
	public void misClick(WebDriver driver) throws InterruptedException {
		Actions action =  new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(mis).perform();
		mis.click();
		action.perform();
	}
	
	public void marketClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(market).perform();
		market.click();
		action.perform();
	}
	public void enterQuality(String qty) {
		quantity.clear();
		quantity.sendKeys(qty);
	}
	
	public void submit() {
		submit.click();
	}
	
	
	
	
	
	
	
	
	
}
