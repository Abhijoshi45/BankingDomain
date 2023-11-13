package com.facebook.Tests;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.Base.BaseClass;
import com.facebook.Pages.SignIn;
import com.facebook.Utilities.FeatchData;
import com.facebook.Utilities.Screenshot;

public class SignInTests4 extends BaseClass{
	
	
	
	public static SignIn signin;
	
	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {
		driver = intilizeBroser("facebookURL");
		System.out.println("**********Strating Test**********" +m.getName()+"*********");
		
	}
	

	
	@Test(dataProvider = "data", dataProviderClass = FeatchData.class)
	public void loginWithInValidPassWord(String email, String password) throws Exception {
		 signin = new SignIn(driver);
		 
		 signin.enterEmail(email);
		 signin.enterPassword(password);
		 signin.clickLoginButton();
		 Screenshot.getScreenShot();
	}
	
	@AfterMethod
	public void afterMethod() {
		Killbrowser();
	}

}
