package Util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.rules.TestRule;
//import org.junit.rules.TestWatcher;
//import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Helper.Loginpagehelper;



public class Drivertestcase {

	WebDriver driver;
	public Propertyreader propertyreader;
	public Loginpagehelper Loginpagehelper;
	//public HeaderHelper header;
	
	@BeforeClass
	public void setup() throws Exception{
		//System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		openUrl();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.influenster.com/");
		//"https://qatest.qa.knowblyapp.com/");
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Loginpagehelper = new Loginpagehelper(driver);
		
	}

	public WebDriver getDriver(){
		return driver;
	}

	public void openUrl() throws Exception{
		propertyreader = new Propertyreader();
		String url = propertyreader.readPropertyFile("URL");
		driver.get(url);
	}
	
		/*@After
		public void teardown() throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File(System.getProperty("user.dir")+"//screenshots//"+System.currentTimeMillis()+".png");
			FileUtils.copyFile(source, destFile);
			System.out.println("Screenshot Taken");
			
			loginpage = null;
			header = null;
			videopage = null;
			
			try {

				if (!(driver == null))
					driver.quit();
			} catch (Exception e1) {

			}
		}*/
	
//	@Rule
//	public TestRule testWatcher = new TestWatcher() {
//	  @Override
//	  public void failed(Throwable e, Description test){
//	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	      String currentDir = System.getProperty("user.dir");
//	      String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
//	      try {
//	          FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + test.getMethodName() + timeStamp + ".png"));
//	      } catch (IOException e1) {
//	          e1.printStackTrace();
//	      }
//	      System.out.println("Screenshot Taken");
//			
//			loginpage = null;
//			header = null;
//			videopage = null;
//			
//			try {
//
//				if (!(driver == null))
//					driver.quit();
//			} catch (Exception e1) {

//			}
//	  }
	//};
}
