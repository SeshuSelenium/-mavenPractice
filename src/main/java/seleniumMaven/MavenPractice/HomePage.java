package seleniumMaven.MavenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class HomePage 
{
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
    
    	By username= By.id("email");
    	
    	By password = By.name("pass");
    	
    	By login = By.xpath("//*[@id='loginbutton']");
    	
    	By forget_password_link = By.linkText("Forgotten account?");
    	
    	public void enterUserID(String uid) {
    		driver.findElement(username).sendKeys(uid);
    		
    	}
    	
    	public void enterPassword(String pass) {
    		driver.findElement(password).sendKeys(pass);
    		
    	}
    	
    	public void click_on_login() {
    		driver.findElement(login).click();
    	}
    	
    	public void click_on_forget_password() {
    		driver.findElement(forget_password_link).click();
    	}
       
    
}
