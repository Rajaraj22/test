package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomFacebookLogin;

public class TestFramework extends BaseTest{
	
	@Test
	public void test() throws Exception {
		
		PomFacebookLogin f=new PomFacebookLogin(driver);
		f.login();
		
	}

}
