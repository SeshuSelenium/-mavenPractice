package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelcomePageValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https:\\www.google.com");
		String Actual = driver.findElement(By.name("btnK")).getAttribute("value");
		String expacted = "Google Search";
		
		if(Actual.equals(expacted)) {
			System.out.println("Actual and expected both match");
		}else {
			System.out.println("Actual and ecpacted both are different");
		}
		
		String ActualSiginButtonStatus = driver.findElement(By.linkText("Sign in")).getText();
		String expectedSiginButtonStatus = "Sign in";
		if (ActualSiginButtonStatus.equals(expectedSiginButtonStatus)) {
			System.out.println("SiginButton Actual and expected both are match");
		}else {
		System.out.println("sing in button Actual and expected not mathch");
		}
	}

}
