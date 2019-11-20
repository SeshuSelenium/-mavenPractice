package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.utility.BrowserFactory;
import com.utility.ScreenshotFactory;

import lib.ExcellDataComplig;
import seleniumMaven.MavenPractice.HomePage;

public class FacebookValidetion {
	
	public WebDriver driver;
	
	@Test
	public void checkValidation() {
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://www.facebook.com/");
		
		//HomePage login_page = PageFactory.initElements(driver, HomePage.class);
		
		HomePage login = new HomePage(driver);
		String sheet = "facebook";
//		ExcellDataComplig excel = new ExcellDataComplig("E:\\facebookIdPassword.xlsx");
//		String userID = excel.getData(sheet, 1, 0);
//		String userPassword = excel.getData(sheet, 1, 1);
//		System.out.println(userID);
//		System.out.println(userPassword);
		login.enterUserID("darling.reddy.988");
		login.enterPassword("darling143");
		login.click_on_login();
				
		ScreenshotFactory screen = new ScreenshotFactory(driver);
		screen.takeScreenShot();
	}
	

}
