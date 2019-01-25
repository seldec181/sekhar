package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//div[@class='iUmrbN']")).click();
		
		WebElement w=driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Pendrives")).click();
		
	}

}
