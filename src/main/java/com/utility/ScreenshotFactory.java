package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class ScreenshotFactory {
	
	public WebDriver driver;
	public ScreenshotFactory(WebDriver driver) {
		this.driver=driver;
	}
	
	public void takeScreenShot() {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\Screenshots\\facebook.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
