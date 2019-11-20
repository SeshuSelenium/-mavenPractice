package task.gmail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GmailTask {
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		// String parent = driver.getWindowHandle();
		// System.out.println(parent);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("na4567");
		driver.findElement(By.id("identifierNext")).click();
		String wrongId = driver.findElement(By.xpath(
				"//*[@id='view_container']/div /div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div/div[2]"))
				.getText();
		System.out.println(wrongId);
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys();
		driver.findElement(By.id("identifierNext")).click();
		String status = driver.findElement(By.xpath(
				"//*[@id='view_container']/div /div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div/div[2]"))
				.getText();
		System.out.println(status);
		Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("nagaseshareddy99");
		driver.findElement(By.id("identifierNext")).click();

		Thread.sleep(5000);
		String passPage = driver.findElement(By.id("forgotPassword")).getText();
		System.out.println(passPage);

		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("9515599998123");
		driver.findElement(By.id("passwordNext")).click();
		String wrongPass = driver
				.findElement(By.xpath("//*[text()='Wrong password. Try again or click Forgot password to reset it.']"))
				.getText();
		System.out.println(wrongPass);
		Thread.sleep(5000);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys();
		driver.findElement(By.id("passwordNext")).click();
		String emptyPass = driver.findElement(By.xpath("//*[text()='Enter a password']")).getText();
		System.out.println(emptyPass);
		Thread.sleep(5000);

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("darling143");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		String success = driver.findElement(By.xpath("//*[text()='Compose']")).getText();
		System.out.println(success);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='More'])[2]")).click();
		WebElement bin =driver.findElement(By.linkText("Bin"));
		wait = new  WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(bin));
		bin.click();
		Thread.sleep(5000);
		while (2 > 1) {
			
			if(driver.findElement(By.xpath("(//*[@class='ts'])[3]")).isDisplayed()) {

				driver.findElement(By.xpath("(//*[@role='checkbox'])[1]")).click();
				driver.findElement(By.xpath("//*[@aria-label='Delete']")).click();
				WebElement refresh=driver.findElement(By.xpath("//*[@aria-label='Refresh']"));
				wait=new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(refresh));
				refresh.click();
							}
			else
			{
				break;
			}
		}
		driver.close();
	}

}
