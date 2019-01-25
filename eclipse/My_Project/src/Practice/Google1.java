package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google1 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		List<WebElement> lst=driver.findElements(By.xpath("//a[contains(.,'GitHub')]"));
		for(int i=0;i<lst.size();i++)
		{
			lst.get(i).click();
			Thread.sleep(5000);
			driver.navigate().back();
			lst=driver.findElements(By.xpath("//a[contains(.,'GitHub')]"));
		}
		

	}

}
