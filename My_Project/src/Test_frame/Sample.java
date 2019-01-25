package Test_frame;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample 
{
  @BeforeMethod
  public void f3()
  {
	  System.out.println("==========common code========");
  }
  @Test(priority=2)	
  public void f1()
  {
	  System.out.println("hello");
  }
  @Test(priority=1)
  public void f2()
  {
	  System.out.println("testing");
  }
}
