package Reg;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class insert extends setup
{
	
	
	@Test(priority=1)
	public static void posthomework() 
	{
		driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("homework");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		//System.out.println("Home page working");
		driver.findElement(By.xpath("//span[contains(text(),'Add Homework')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Student Groups')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Classes')]")).click();
		Actions action= new Actions(driver);
		
		//explicit wait
		
		WebDriverWait wait=new WebDriverWait(driver,300);
		//wait until element present
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ClassSectionIdList_chosen")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
	    WebElement element = driver.findElement(By.id("ClassSectionIdList_chosen"));
	    action.moveToElement(element).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
		//driver.findElement(By.id("ClassSectionIdList_chosen")).sendKeys("LKG");
		//driver.findElement(By.id("ClassSectionIdList_chosen")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("ClassSectionIdList_chosen")).sendKeys(Keys.ENTER);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		action.moveToElement(driver.findElement(By.id("SubjectId_chosen"))).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//driver.findElement(By.id("SubjectId_chosen")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.id("SubjectId_chosen")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("HomeWorkDescriptionMultiLingual")).sendKeys("test homework");
		
		driver.findElement(By.id("btnsubmit")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("skipBtn")));
		action.moveToElement(driver.findElement(By.id("skipBtn"))).click().build().perform();;
		

		
		//deletin all hoework
		//System.out.println(driver.findElement(By.className("btn tg-sm btn-danger")).getSize());
		
		//Assert.
		
		//Deleting homework
		driver.findElement(By.xpath("//tbody[1]//tr[1]//td[9]//a[1]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("DeleteHomeWork")));
		action.moveToElement(driver.findElement(By.id("DeleteHomeWork"))).click().build().perform();
		//Set <String> s1=driver.getWindowHandles();
		//System.out.println(s1);	
	}
	@Test(priority=2)
	public static void Notes() 
	{
		//driver.findElement(By.id("ExpandMenuToggle")).click();
		driver.findElement(By.id("SearchMenu")).sendKeys("Notes");
		driver.findElement(By.id("SearchMenu")).sendKeys(Keys.ENTER);
		//System.out.println(" page working");
		driver.findElement(By.id("headingOne")).click();
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ClassSectionIdList_chosen"))).click().sendKeys(Keys.ENTER).build().perform();
		action.moveToElement(driver.findElement(By.id("SubjectId"))).click().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}
}

