package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	public WebDriver driver;

	@BeforeTest
	public void pre() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver75\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

	}

	@Test(priority = 0)
	public void b() {
		driver.findElement(By.xpath("(//a[text()='Become a Certified Professional '])[2]")).click();
		driver.findElement(By.xpath("//*[text()='No thanks']")).click();
	}
//	@Test(priority =0)
//	public void a() {
//		System.out.println("A");
//	}

	@AfterTest
	public void post() {
//		driver.quit();

	}

}
