package generics;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest implements AutoConstant {

	public static WebDriver driver;

	@BeforeClass
	public void openBrowser() {

		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		//System.out.println("App open");
		//Reporter.log("App open");

		   DOMConfigurator.configure("log4j.xml"); 
		    Log.info("open browser");
	}

	@AfterMethod
	public void closeBrowser() {

		Log.info("close browser");
	//	driver.close();

	}
}
