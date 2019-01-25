package Practice;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc 
{

	public static void main(String[] args) throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(5000);
		ArrayList<String>  lst = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(lst.get(1));  // focus to 2nd window
		
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		
		driver.switchTo().frame("login_page");
		
		//driver.findElement(By.name("fldLoginUserId")).sendKeys("87655678");
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		

	}

}
