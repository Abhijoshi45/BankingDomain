package com.facebook.Tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.Base.BaseClass;
import com.facebook.Pages.SignIn;
import com.facebook.Utilities.Screenshot;

public class SignInTests extends BaseClass{
	
	
	
	public static SignIn signin;
	
	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {
		driver = intilizeBroser("facebookURL");
		System.out.println("**********Strating Test**********" +m.getName()+"*********");
		
	}
	
	
	@Test(priority = 1)
	public void loginWithValidCredential() throws Exception {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("abhishekjoshi9057@gmail.com");
		 signin.enterPassword("Pass@1234");
		 signin.clickLoginButton();
		 Screenshot.getScreenShot();
	}
	
	@Test(priority = 2)
	public void loginWithInValidEmail() {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("Ajdjjfdkk@hmail.com");
		 signin.enterPassword("Pass@1234");
		 signin.clickLoginButton();
	}
	
	@Test(priority =3)
	public void loginWithInValidPassWord() {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("abhishekjoshi9057@gmail.com");
		 signin.enterPassword("2648425");
		 signin.clickLoginButton();
	}
	
	@Test(priority =4)
	public void loginWithBlankCradinital() {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("");
		 signin.enterPassword("");
		 signin.clickLoginButton();
		 
		 String actualtext = signin.verifyMessageAfterEnteringBlankCred();
		 String expectedtext = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		 Assert.assertEquals(actualtext, expectedtext, "String doesnt match -");
		 
	}

}
