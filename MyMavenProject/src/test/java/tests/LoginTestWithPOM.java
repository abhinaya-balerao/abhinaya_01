package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;
import pages.SignInPage;

public class LoginTestWithPOM extends BaseTest{

	@Test
	public void checkValidCredentials(){
		LandingPage landingPage = new LandingPage(driver);
		SignInPage signInPage = landingPage.signIn();
		signInPage.loginToAccount("abhinaya1306@gmail.com", "rayaan18");
	}
}
