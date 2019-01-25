package Test_frame;

import org.openqa.selenium.By;

public class Inbox extends MainClass
{
	
  public void deletemail() throws Exception
  {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(InboxP.xcheckbox)).click();
	  driver.findElement(By.id(InboxP.idelete)).click();
  }
}
