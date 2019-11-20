package data.driven.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {
	
	@Test(dataProvider ="facebook" )
	public void login(String uid, String password) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afe1oO9g7xfxB_wl5o0lB26U97A58cGP_5PTgoL7GeYFj020tkt_f5DVkbF4f_drtRuwqS9R9WYfOpvqzBKp9uW4S-XZek-szK1q1--m92FxQg&smuh=26896&lh=Ac-f1gynl_WgLmg_");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(uid);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
	}
	@DataProvider(name= "facebook")
	public Object[][] passData(){
		
		Object[][] data = new Object[3][2];
		data[0][0]= "9515599998";
		data[0][1]= "darling143";
		
		data[1][0]= "nagasesha";
		data[1][1]= "darling123";
		
		data[2][0]= "seshu0";
		data[2][1]= "reddy143";
		
		return data;
	}
	

}
