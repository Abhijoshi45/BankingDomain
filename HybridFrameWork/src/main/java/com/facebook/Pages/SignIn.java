package com.facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.Base.BaseClass;

public class SignIn extends BaseClass {
	
	public SignIn(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy (id = "email") private WebElement email;
	@FindBy (id = "pass") private WebElement password;
	@FindBy (xpath = "//button[@data-testid='royal_login_button']") private WebElement loginbutton;
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgetYourPassword;
	@FindBy (xpath = "(//a[@role='button'])[2]") private WebElement createNewAccount;
	@FindBy (xpath = "//div[@class='_9ay7']") private WebElement Message;
	
	
	public SignIn enterEmail(String text) {
		sendKeys(email, text);
		System.out.println("Entered Email Address");
		return this;
	}
	
	public SignIn enterPassword(String text) {
		sendKeys(password, text);
		System.out.println("Entered Password");
		return this;
	}
	
	public SignIn clickLoginButton () {
		click(loginbutton);
		System.out.println("Clicked On Login Button");
		return this;
	}
	
	public SignIn clickOnForgetYourPassword() {
		click(forgetYourPassword);
		System.out.println("Clicked on Forget Your Password Link");
		return this;
	}
	
	public SignIn ClickOnCreateOnNewAccount() {
		click(createNewAccount);
		System.out.println("Click on Create on New Account");
		return this;
	}
	
	public String verifyMessageAfterEnteringBlankCred() {
		String textmsg = getText(Message);
		return textmsg;
		
	}

}
