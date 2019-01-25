package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_login
{

	public static void main(String[] args) throws Exception
	{
		String err;
		
		FileInputStream fin=new FileInputStream("d:\\sel_dec18\\data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet ws=wb.getSheet("Sheet2");  
		
		Row row;
		for(int r=1;r<=ws.getLastRowNum();r++) //for all the rows in the sheet
		{
			row=ws.getRow(r);
			FirefoxDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
			
			driver.findElement(By.name("username")).sendKeys(row.getCell(0).getStringCellValue());
			driver.findElement(By.name("signin")).click();
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
			driver.findElement(By.name("verifyPassword")).click();
			Thread.sleep(5000);
			
			try
			{
				if(driver.findElement(By.linkText("Sign Out")).isDisplayed())
				{
					row.createCell(2).setCellValue("Login is success");
					driver.findElement(By.linkText("Sign Out")).click();
				}
			}
			catch(Exception e)
			{
				err=driver.findElement(By.xpath("//p[@class='error-msg']")).getText();
				row.createCell(2).setCellValue("Login is failed  :  "+err);			
			}
			driver.close();
		}
		FileOutputStream fout=new FileOutputStream("d:\\sel_dec18\\data.xlsx");
		wb.write(fout);
		fin.close();
		fout.close();
	}

}
