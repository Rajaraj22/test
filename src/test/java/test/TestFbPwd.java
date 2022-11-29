package test;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.PomFacebookForgotpwd;

@Listeners(generics.Utility.class)
public class TestFbPwd extends TestFacebook {

	//@Test
	public void login() {

		Reporter.log("Facebook pwd",true);
		//String title1="Faceboo";
		//String title2 = driver.getTitle();
		//SoftAssert sa=new SoftAssert();
		//sa.assertEquals(title1, title2);
		PomFacebookForgotpwd fpwd = new PomFacebookForgotpwd(driver);
		fpwd.forgotPwd();
	}

}
