package Reg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class setup {
	
public static WebDriver driver;
//public static Actions action= new Actions(driver);

	@BeforeSuite
	public static void Open() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Softwares\\Materials\\chromedriver.exe");

		 driver = new ChromeDriver();
		 //driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://developers.schoolskies.com/Login");
		//Actions action= new Actions(driver);
	 
	}
	@BeforeMethod
	public  static void Login() {

		
		System.out.println("Driver"+ driver);
		
		driver.findElement(By.id("Teacher")).click();
		driver.findElement(By.id("Teacher")).click();
		driver.findElement(By.id("UserName")).sendKeys("9597094449");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("BtnLogin")).click();

	}
	
}
