 package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google2 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ENTER);
		
		
		
		/*
		 * Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		 */

	}

}
