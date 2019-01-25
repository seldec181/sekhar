package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooke 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("dksfjsdkfj");
		driver.findElement(By.name("pass")).sendKeys("dfsdfsdf");
		driver.findElement(By.id("loginbutton")).click();
		String str=driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		
		System.out.println(str);
		

	}

}
