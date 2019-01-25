package Practice;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read 
{

	private static XSSFWorkbook wb;

	public static void main(String[] args) throws Exception
	{
		//get the excel file
		FileInputStream fin=new FileInputStream("E:\\eclipse\\Data.xlsx");
		wb = new XSSFWorkbook(fin);
		//sheet in the workbook
		XSSFSheet ws=wb.getSheet("Sheet1");  
		
 		Row row;
		for(int r=0;r<=ws.getLastRowNum();r++) //for all the rows in the sheet
		{
			row=ws.getRow(r);
			for(int c=0;c<row.getLastCellNum();c++) //for all the cells in the row
			{
				System.out.println(row.getCell(c).getStringCellValue()); //read value
			}
			System.out.println("============");
		} 
		fin.close();
	}

}
