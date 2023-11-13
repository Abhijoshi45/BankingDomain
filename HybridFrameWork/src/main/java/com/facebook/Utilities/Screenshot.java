package com.facebook.Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.facebook.Base.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot extends BaseClass {
	
	
	public static void getScreenShot() throws Exception {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		
		System.out.println(d);
		
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots"+ screenshotName));	
		
	}
	
	public static void getAshot() throws IOException {
		
		ru.yandex.qatools.ashot.Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		Date d = new Date();
		
		System.out.println(d);
		
		String screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		
		ImageIO.write(screenshot.getImage(), "jpg", new File(".//src//test//resources//Screenshots//Ashot_"+screenshotName));
	}
	
}
