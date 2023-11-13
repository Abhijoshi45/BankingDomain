package com.facebook.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
			
	}	
		public WebDriver intilizeBroser(String url) throws Exception  {
			
			try {
				
				Properties prop = new Properties();
				FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Properties\\config.properties");
				
				prop.load(fis);
				
				System.out.println(prop.getProperty("browser"));
				
				String browsername = prop.getProperty("browser"); 
				
				if(browsername.equals("chrome")) {
					//Execute the ChromeDriver
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					
				}else if(browsername.equals("firefox")){
					//Execute the FirefoxBroser
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					
				}else if(browsername.equals("edge")) {
					//Execute the EdgeBroser
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();			
			
				}
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(prop.getProperty(url));	
					
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				
				throw e;
				
			}
			
			return driver;
	}	


		public void waitforVisibility(WebElement e) {	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(e));
		}
		
		public void waitUntilElementIsClickable(WebElement e) {	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(e));
		}
		
		
		public void click(WebElement e) {
			waitforVisibility(e);
			waitUntilElementIsClickable(e);
			e.click();
		}
		
		public void sendKeys(WebElement e, String text) {
			waitforVisibility(e);
			e.sendKeys(text);
		}
		
		public void clearText(WebElement e) {
			waitforVisibility(e);
			e.clear();
		}
		
		public String getText(WebElement e) {
			waitforVisibility(e);
			return e.getText();
		}
		
		public void navigateBack() {
			driver.navigate().back();
		}
		
		public void acceptAlert() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert = "+ driver.switchTo().alert().getText());
			alert.accept();
		}
		
		public void dismissAlert() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Alert = "+ driver.switchTo().alert().getText());
			alert.dismiss();
		}
		
		public void scrollIntoView(WebElement e, int up, int down) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+up+","+down+")");
		}
		
		public void scrollIntoView(WebElement e) {
			((JavascriptExecutor)driver).executeScript("arrguments[0].scrollIntoViewIfneeded()", e);
		}
		
		public void scrollIntoViews(WebElement e, int left, int right) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+left+","+right+")");
		}
		
		public void switchToNextWindow() {
			Set<String> windowPopup = driver.getWindowHandles();
			Iterator<String> iterate = windowPopup.iterator();
			List<String> windowIndex = new ArrayList<String>();
			while(iterate.hasNext()) {
				windowIndex.add(iterate.next());
			}
			driver.switchTo().window(windowIndex.get(1));
			driver.manage().window().maximize();
			System.out.println("Switch to Window" + driver.getTitle());
		}
		
		public String getCurrentTime() {
			DateFormat dateformat = new SimpleDateFormat("hh:mm a");
			Date time = new Date();
			String time1 = dateformat.format(time);
			return time1;	
		}
		
		public String getCurrentDate() {
			DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
			Date date = new Date();
			String date1 = dateformat.format(date);
			return date1;
		}
		
		public void  Killbrowser() {
			driver.quit();
		}
}
