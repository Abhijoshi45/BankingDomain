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

public class SignInTests3 extends BaseClass{
	
	
	
	public static SignIn signin;
	
	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {
		driver = intilizeBroser("facebookURL");
		System.out.println("**********Strating Test**********" +m.getName()+"*********");
		
	}
	
	
	@Test(priority = 2)
	public void loginWithInValidEmail() throws Exception {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail("Ajdjjfdkk@hmail.com");
		 signin.enterPassword("Pass@1234");
		 signin.clickLoginButton();
		 Screenshot.getScreenShot();
		 Screenshot.getAshot();
	}
	
	@AfterMethod
	public void afterMethod() {
		Killbrowser();
	}
		 
}


