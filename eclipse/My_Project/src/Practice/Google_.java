package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_
{

	public static void main(String[] args)
	{
		//FirefoxDriver driver=new FirefoxDriver();
		 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//WebElement x=driver.findElement(By.name("q"));
		//x.sendKeys("selenium");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		
	}

}
