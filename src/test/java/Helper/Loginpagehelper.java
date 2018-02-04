package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Locator.Locatoreader;
import Util.Driverhelper;

public class Loginpagehelper extends Driverhelper {
	
	public Locatoreader loginlocators;
	public Loginpagehelper(WebDriver driver) {
		super(driver);
		loginlocators = new Locatoreader("loginPage.xml");
	}

	public void clickonagree() {
		
		//driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right']")).click();
		

		//WaitForElementPresent(loginlocators.getLocator("Login.Iagree"), 10);
			clickOn(loginlocators.getLocator("Login.Iagree"));
			//driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right']")).click();
			
			//sendKeys(loginlocators.getLocator("loginPage.Searchpage"), "Lotus");
		
		 }
	
public void Login() {
	
	//WebElement s=driver.findElement(By.linkText("Sign In"));
		
		//WebElement s =driver.findElement(By.xpath("//a[@class='btn btn-orange-fill register']"));
	//s.click();
	
	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//s.click();
		
		
	WaitForElementPresent(loginlocators.getLocator("Login.Loginapp"), 10);
	clickOn(loginlocators.getLocator("Login.Loginapp"));
		WaitForElementPresent(loginlocators.getLocator("Login.Email"), 10);
			clickOn(loginlocators.getLocator("Login.Email"));
			sendKeys(loginlocators.getLocator("Login.Email"), "test360.53@gmail.com");
			WaitForElementPresent(loginlocators.getLocator("Login.Pwd"), 20);
			clickOn(loginlocators.getLocator("Login.Pwd"));
			sendKeys(loginlocators.getLocator("Login.Pwd"), "360logica");
			WaitForElementPresent(loginlocators.getLocator("Login.Submit"), 20);
			clickOn(loginlocators.getLocator("Login.Submit"));
		
		 }
	public void productsearch() throws InterruptedException{
		
		WaitForElementPresent(loginlocators.getLocator("Login.Productsearch"), 10);
		clickOn(loginlocators.getLocator("Login.Productsearch"));
		sendKeys(loginlocators.getLocator("Login.Productsearch"), "Lotus");	
		//WaitForElementPresent(loginlocators.getLocator("Login.Search"), 10);
		clickOn(loginlocators.getLocator("Login.Search"));
		//driver.findElement(By.xpath("Logout")).click();
		WaitForElementPresent(loginlocators.getLocator("Login.Productclick"), 10);
		clickOn(loginlocators.getLocator("Login.Productclick"));
		WaitForElementPresent(loginlocators.getLocator("Login.AllQA"), 10);
		clickOn(loginlocators.getLocator("Login.AllQA"));
//		WebDriver driver = new ChromeDriver();
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)", "");
	}
	
public void logout() throws InterruptedException{
		
	
	WebElement Name = driver.findElement(By.linkText("Deepak"));
	Actions action = new Actions(driver);
    action.moveToElement(Name).build().perform();
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("LogOut Suceessful");
	
	
}
public void Askquestion() throws InterruptedException{
		
	
	Thread.sleep(5000);
	clickOn(loginlocators.getLocator("Login.AskQA"));
}
}
