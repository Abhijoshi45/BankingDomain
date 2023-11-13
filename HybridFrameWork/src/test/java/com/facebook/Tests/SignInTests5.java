package com.facebook.Tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.Base.BaseClass;
import com.facebook.Pages.SignIn;
import com.facebook.Utilities.Screenshot;

public class SignInTests5 extends BaseClass{
	
	
	
	public static SignIn signin;
	
	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {
		driver = intilizeBroser("facebookURL");
		System.out.println("**********Strating Test**********" +m.getName()+"*********");
		
	}
	
	
	@Test(priority =4)
	public void loginWithBlankCradinital() throws Exception {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("");
		 signin.enterPassword("");
		 signin.clickLoginButton();
		 Thread.sleep(3000);
		 Screenshot.getScreenShot();
		 
		 String actualtext = signin.verifyMessageAfterEnteringBlankCred();
		 String expectedtext = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		 Assert.assertEquals(actualtext, expectedtext, "String doesnt match -");
		 
	}
	
	@AfterMethod
	public void afterMethod() {
		Killbrowser();
	}

}
