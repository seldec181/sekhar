package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_alert_naukri 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Runtime.getRuntime().exec("D:\\sel_dec18\\fileupload.exe");
		
		Thread.sleep(5000);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//input[@value='Upload CV']"))).click().perform();
		//Thread.sleep(5000);

		
	
		/*
		//get clipboard memory reference and set content into clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().
		             setContents(new StringSelection("d:\\data.xlsx"),null);
				
		Robot r=new Robot();
		 
		r.keyPress(KeyEvent.VK_CONTROL);  //paste the text from clipboad
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		*/
		
		Runtime.getRuntime().exec("taskkill /f /im geckodriver.exe");
	}

}
