package day10.tasks;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static Object[][] readData(String filename) throws IOException
	{
		String filepath="./data/"+filename+".xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(filepath);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("row size="+rows);
		System.out.println("cell size="+cells);
		
		Object[][] data=new Object[rows][cells];
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cells;j++)
			{
				String value=row.getCell(j).getStringCellValue();
				if(value.equals(""))
					data[i-1][j]="";
				else
					data[i-1][j]=value;
			}
		}
		
		workbook.close();
		
		return data;
	}

}
