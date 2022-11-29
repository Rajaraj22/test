package test;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomFacebookLogin;

@Listeners(generics.Utility.class)
public class TestFramework extends BaseTest {

	@Test
	public void test() throws Exception {

		DOMConfigurator.configure("log4j.xml");
		PomFacebookLogin f = new PomFacebookLogin(driver);
		f.login();

	}

}
