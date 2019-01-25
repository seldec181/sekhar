package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write 
{

	
	private static XSSFWorkbook wb;

	public static void main(String[] args) throws Exception
	{
		//get the excel file
		FileInputStream fin=new FileInputStream("E:\\eclipse\\Data.xlsx");
		wb = new XSSFWorkbook(fin);
		
		//sheet in the workbook
		XSSFSheet ws=wb.getSheet("Sheet2");  
		
		Row row=ws.createRow(0);  //create a row in the sheet
		row.createCell(0).setCellValue("selenium");  //create a cell in the row
		row.createCell(1).setCellValue("java");
		row.createCell(2).setCellValue("testing");
		
		row=ws.createRow(1);
		row.createCell(0).setCellValue("100");
		row.createCell(1).setCellValue("200");
		row.createCell(2).setCellValue("300");  
//		String test = '‪‪E:\eclipse\Data.xlsx';
		//file to write ,  write all workbook data into the file and close
		FileOutputStream fout = new FileOutputStream("E:\\eclipse\\Data.xlsx");
		wb.write(fout); 
		
		fin.close();
		fout.close(); 
		
		

	}

}
