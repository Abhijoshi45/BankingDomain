package com.facebook.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.facebook.Base.BaseClass;

import com.facebook.Utilities.Screenshot;

public class CartTest extends BaseClass {
	
public static WebDriver driver;



@Test
public void openURL() throws Exception {
	
	driver = intilizeBroser("amazonLiveurl");
	
	Screenshot.getAshot();
	
}













}
