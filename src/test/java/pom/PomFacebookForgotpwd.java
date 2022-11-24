package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFacebookForgotpwd {

	@FindBy(linkText = "Forgotten password?")
	private WebElement fpwd;

	public PomFacebookForgotpwd(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void forgotPwd() {
		
		fpwd.click();
	}

}
