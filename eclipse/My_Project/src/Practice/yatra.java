package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra 
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
				
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Bangalore (BLR)");
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
				
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollTo(0,50)");
		Thread.sleep(2000);
		//driver.findElement(By.id("BE_flight_origin_date")).click();
		//new Actions(driver).moveToElement(driver.findElement(By.linkText("26"))).click().perform();
		
		WebElement fcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		
		while(fcal.findElement(By.xpath("div/div/span[1]")).getText().matches("APRIL")==false)
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(1000);
			fcal=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		}
		Thread.sleep(2000);
		fcal.findElement(By.xpath("//a[text()='26']")).click();
		
		
		//driver.findElement(By.id("BE_flight_paxInfoBox")).click();
		//driver.findElement(By.xpath("//div[@data-flightagegroup='adult']/div/div/span[1]")).click();
		
		//driver.findElement(By.xpath("//div[@data-flightagegroup='child']/div/div/span[1]")).click();
		//driver.findElement(By.xpath("//span[@class='done']")).click();
		
		//driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		

	}

}
