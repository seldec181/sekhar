package Test_frame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Login extends MainClass
{
 public void open()
 {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(LoginP.yurl);
 }
 public void valid_login()
 {
	open();
	driver.findElement(By.name(LoginP.nemail)).sendKeys("venkat123456a");
	driver.findElement(By.name(LoginP.nnext)).click();
	driver.findElement(By.name(LoginP.npwd)).sendKeys("mqq987654");
	driver.findElement(By.name(LoginP.nnext2)).click();
 }
 public void validate_login() throws Exception
 {
	    String err;
		
		FileInputStream fin=new FileInputStream("d:\\sel_dec18\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet ws=wb.getSheet("Sheet2");  
		
		Row row;
		for(int r=1;r<=ws.getLastRowNum();r++) //for all the rows in the sheet
		{
			row=ws.getRow(r);
			open();
			driver.findElement(By.name(LoginP.nemail)).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name(LoginP.nnext)).click();
			Thread.sleep(5000);
			driver.findElement(By.name(LoginP.npwd)).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.name(LoginP.nnext2)).click();
			Thread.sleep(5000);
			
			try
			{
				if(driver.findElement(By.linkText(LoginP.lsignout)).isDisplayed())
				{
					row.createCell(2).setCellValue("Login is success");
					driver.findElement(By.linkText(LoginP.lsignout)).click();
				}
			}
			catch(Exception e)
			{
				err=driver.findElement(By.xpath(LoginP.xerrmsg)).getText();
				row.createCell(2).setCellValue("Login is failed  :  "+err);			
			}			
		}
		FileOutputStream fout=new FileOutputStream("d:\\sel_dec18\\data.xlsx");
		wb.write(fout);
		fin.close();
		fout.close(); 
 }
 public void signup()
 {
	 open();
	 driver.findElement(By.id(LoginP.isignup)).click();
	 try
	 {
		 if(driver.findElement(By.name(LoginP.nfname)).isDisplayed())
		 {
			 Reporter.log("<font color='green'><b>Signup link is working</b></font>");
		 }
	 }
	 catch(Exception e)
	 {
		 Reporter.log("<font color='red'><b>signup link not working</b></font>");
	 }
 }
}
