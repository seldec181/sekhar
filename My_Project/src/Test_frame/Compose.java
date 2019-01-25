package Test_frame;

import org.openqa.selenium.By;

public class Compose extends MainClass
{
 public void sendmail() throws Exception
 {
	 Thread.sleep(5000);
	 driver.findElement(By.xpath(ComposeP.xcompose)).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id(ComposeP.ito)).sendKeys("abcd@gmail.com");
	 driver.findElement(By.id(ComposeP.isub)).sendKeys("testmail");
	 driver.findElement(By.name(ComposeP.nbody)).sendKeys("This is sample message in the body");
	 driver.findElement(By.id(ComposeP.isend)).click();
	 Thread.sleep(5000);
 }
 public void close() 
 {
	 driver.findElement(By.linkText(LoginP.lsignout)).click();
	 driver.close();
 }
}
