package com.facebook.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.facebook.Base.BaseClass;

public class CreateNewAccount extends BaseClass {
	
	public CreateNewAccount(WebDriver driver) {
		
	}
	@FindBy (xpath = "(//a[@role='button'])[2]") private WebElement createNewAccount;
	@FindBy(id="u_6_b_7Q") private WebElement firstName;
	@FindBy(id = "u_6_d_Ux") private WebElement surName;
	@FindBy(id = "u_6_g_mJ") private WebElement mobileNumber;
	@FindBy(id = "password_step_input") private WebElement passWord;
	@FindBy(xpath = "//select[@id='day']/option") private WebElement day;
	@FindBy(xpath ="//select[@id='month']/option") private WebElement month;
	@FindBy(xpath = "//select[@id='year']/option") private WebElement year;
	@FindBy(xpath = "(//input[@type='radio'])[1]") private WebElement female;
	@FindBy(xpath = "(//input[@type='radio'])[2]") private WebElement male;
	@FindBy(xpath = "(//input[@type='radio'])[3]") private WebElement custom;
	@FindBy(xpath = "(//select[@id='js_jl']/option)[2]") private WebElement selectYoyrPronounsShe;
	@FindBy(xpath = "(//select[@id='js_jl']/option)[3]") private WebElement selectYoyrPronounsHe;
	@FindBy(xpath = "(//select[@id='js_jl']/option)[4]") private WebElement selectYoyrPronounsThey;
	@FindBy(id = "u_6_q_bJ") private WebElement genderOptional;
	@FindBy(xpath="(//button[text()='Sign Up'])[1]") private WebElement singUp;
	
	public CreateNewAccount clickOnCreateNewAccount() {
		click(createNewAccount);
		System.out.println("Click On Create New Account");
		return this;	
	}
	
	public CreateNewAccount enterFirstName (String text) {
		sendKeys(firstName, text);
		System.out.println("First Name Entered");
		return this;
	}
	
	public CreateNewAccount enterSurname(String text) {
		sendKeys(surName, text);
		System.out.println("Surname Entered");
		return this;
	}
	
	public CreateNewAccount enterMobileN(int no) {
		sendKeys(mobileNumber, null);
		System.out.println("Mobile Entered");
		return this;
	}
	
	public CreateNewAccount enterPassword(String text) {
		sendKeys(passWord, text);
		System.out.println("Password Enterd");
		return this;
	}
	
	public CreateNewAccount enterDeath() {
		Select sc = new Select(day);
		sc.selectByIndex(21);
		sc.selectByValue("12");
		return this;
	}
	
	public CreateNewAccount enterMonth() {
		Select sc = new Select(month);
		sc.selectByIndex(5);
		sc.selectByValue("6");
		sc.selectByVisibleText("March");
		return this;
	}
	
	public CreateNewAccount enterYear() {
		Select sc = new Select(year);
		sc.selectByIndex(35);
		sc.selectByValue("20");
		return this;
	}
	
	public CreateNewAccount clickFemale() {
		click(female);
		System.out.println("Clicked on Female");
		return this;
	}
	
	public CreateNewAccount clickMale() {
		click(male);
		System.out.println("Clicked on Male");
		return this;
	}
	
	public CreateNewAccount clickCustom() {
		click(custom);
		System.out.println("Clicked on Custom");
		return this;
	}
	
	public CreateNewAccount clickSelectYourPronounsShe() {
		click(selectYoyrPronounsShe);
		System.out.println("Clicked on She");
		return this;
	}
	
	public CreateNewAccount clickSelectYourPronounsHe() {
		click(selectYoyrPronounsHe);
		System.out.println("clicked on he");
		return this;		
	}
	
	public CreateNewAccount clickSelectYourPronounsThey() {
		click(selectYoyrPronounsThey);
		System.out.println("Click on They");
		return this;
	}
	
	public CreateNewAccount enterGenderOptional(String text) {
		sendKeys(genderOptional, text);
		System.out.println("Entered Gender");
		return this;	
	}
	
	public CreateNewAccount clickOnSingUp() {
		click(singUp);
		System.out.println("Clicked on Sing Up");
		return this;
	}

}
