package mypackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ReadExcel(String excelPath)
		
	{
		try
		{
			File src = new File (excelPath);
			FileInputStream fs = new FileInputStream(src);
			wb = new XSSFWorkbook(fs);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetnumber, int row, int column)
	{
		sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
//To know th row count
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row = row+1;		
		return row;
	}
	
}
