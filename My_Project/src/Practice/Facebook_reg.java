package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_reg 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("abcd");
		//lastname
		//email
		//phoneno
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("3");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Apr");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		

	}

}
