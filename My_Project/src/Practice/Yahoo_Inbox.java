package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Inbox
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		
		driver.findElement(By.name("username")).sendKeys("venkat123456a");
		driver.findElement(By.name("signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("mqq987654");
		driver.findElement(By.name("verifyPassword")).click();
		Thread.sleep(5000);
		
		String str;
		for(int r=1;r<=40;r++)
		{
			str=driver.findElement(By.xpath("//table[@id='datatable']/tbody/tr["+r+"]/td[6]")).getText();
			if(str.contains("Fresher"))
			{
				driver.findElement(By.xpath("(//input[@name='mid'])["+r+"]")).click();
			}

		}
		

	}

}
