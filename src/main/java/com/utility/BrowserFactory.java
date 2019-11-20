package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			FirefoxProfile profile = new FirefoxProfile();
			 profile.setPreference("permissions.default.desktop-notification", 1);
		        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver(capabilities);
			
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}
