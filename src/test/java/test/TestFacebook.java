package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.PomFacebookLogin;

@Listeners(generics.Utility.class)
public class TestFacebook {

	public WebDriver driver;

	@BeforeMethod
	public void loginMethod() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Raja/Downloads/New folder (8)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}

	@Test
	public void login() throws Exception {

		
	
		PomFacebookLogin fb = new PomFacebookLogin(driver);
		fb.login();
	

	}
}