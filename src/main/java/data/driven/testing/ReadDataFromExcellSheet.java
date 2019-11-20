package data.driven.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.BrowserFactory;

import gherkin.StringUtils.ToString;

public class ReadDataFromExcellSheet {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		
		
		File scr = new File("E:\\facebookIdPassword.xlsx");
		FileInputStream input = new FileInputStream(scr);
		Workbook wb = new XSSFWorkbook(input);
		Sheet s = wb.getSheet("facebook");
		long x = (long)s.getRow(1).getCell(1).getNumericCellValue();
		s.getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(x);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int rowCount = s.getLastRowNum();
		System.out.println(rowCount);
		
		
		int j =1;
		for (int i = 0; i <=rowCount; i++) {
			driver.findElement(By.id("email")).clear();
			long userID =(long) s.getRow(j).getCell(1).getNumericCellValue();
			driver.findElement(By.id("email")).sendKeys(String.valueOf(userID));
			
			
			
			driver.findElement(By.id("pass")).clear();
			String userPassword = s.getRow(j).getCell(2).getStringCellValue();
			driver.findElement(By.id("pass")).sendKeys(userPassword);
			
		}
		driver.findElement(By.id("loginbutton")).click();
		
		wb.close();
		
	}
	
	

}
