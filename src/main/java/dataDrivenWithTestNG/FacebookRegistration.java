package dataDrivenWithTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.ExcellDataComplig;

public class FacebookRegistration {

	public WebDriver driver;
	public Select select;
	ExcellDataComplig excel;
	@BeforeTest
	public void precondition() {
		
		
		excel = new ExcellDataComplig("C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\cradetials\\facebook.xlsx");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void Registration() throws Exception {
		
		for(int i =0; i<3;i++) {		
		driver.findElement(By.name("firstname")).clear();
		String firstName = excel.getData("facebookRegistration", 1, 0);
		driver.findElement(By.name("firstname")).sendKeys(firstName);
		
		driver.findElement(By.name("lastname")).clear();
		String lastName = excel.getData("facebookRegistration", 1, 1);
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		
		
		driver.findElement(By.name("reg_email__")).clear();
		//double mobile = excel.intGetData("facebookRegistration", 1, 2);
		driver.findElement(By.name("reg_email__")).sendKeys("9515599998");
		
		
		driver.findElement(By.name("reg_passwd__")).clear();
		String newPassword = excel.getData("facebookRegistration", 1, 3);
		driver.findElement(By.name("reg_passwd__")).sendKeys(newPassword);
		Thread.sleep(5000);
		driver.findElement(By.name("birthday_day")).click();
		driver.findElement(By.xpath("//*[@id='day']/option[25]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//*[@id='month']/option[13]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//*[@id='year']/option[29]")).click();
		driver.findElement(By.xpath("//*[@id='u_0_11']/span[2]/label")).click();
		}
	}
}
