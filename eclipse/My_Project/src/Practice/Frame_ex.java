package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_ex 
{

	public static void main(String[] args)
    {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		WebElement w1=driver.findElement(By.id("draggable"));
		WebElement w2=driver.findElement(By.id("droppable"));
		
		new Actions(driver).dragAndDrop(w1,w2).perform();

		//driver.switchTo().window(driver.getWindowHandle());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Selectable")).click();
		
		////////////change focus to the frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		/////////////////To select mulitple values in the list
		WebElement parent=driver.findElement(By.id("selectable"));
		List<WebElement> lst=parent.findElements(By.tagName("li"));
		
		new Actions(driver)
			.keyDown(parent,Keys.CONTROL)
			.click(lst.get(2))
			.click(lst.get(5))
			.click(lst.get(6))
			.keyUp(parent,Keys.CONTROL)
			.perform();	
		
	}

}
