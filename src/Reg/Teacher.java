package Reg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Teacher extends setup
{

	
	
	@Test(priority=1)
	public  static void Login() {

		
		System.out.println("Driver"+ driver);
		
		driver.findElement(By.id("Teacher")).click();
		driver.findElement(By.id("Teacher")).click();
		driver.findElement(By.id("UserName")).sendKeys("9597094449");
		driver.findElement(By.id("Password")).sendKeys("password");
		driver.findElement(By.id("BtnLogin")).click();

	}
/*	@Test(priority=2)
	public static void medialib() 
	{
		driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("media");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		//driver.findElement(By.linkText("/MediaLibrary")).click();
		driver.findElement(By.id("headingOne")).click();
		
	}*/
	@Test(priority=3)
	public static void homework() 
	{
		driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("homework");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println("Home page working");
	}
	@Test(priority=4)
	public static void Notes() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("Notes");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	
	@Test(priority=5)
	public static void Test() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("test");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	
	@Test(priority=6)
	public static void Announce() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("Announcement");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	
	@Test(priority=7)
	public static void Impt() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("Important");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	@Test(priority=8)
	public static void profile() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("profile");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	@Test(priority=9)
	public static void sprofile() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("student profile");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		System.out.println(" page working");
	}
	
	
	//@AfterSuite
	//public void close()
	//{
	//	driver.close();
	
	//}

	
	
	
}
