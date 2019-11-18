package day10;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public Object[][] readData() throws IOException
	{
		String filepath="./data/CreateLeadTestData.xlsx";
		XSSFWorkbook workbook=new XSSFWorkbook(filepath);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int columns=sheet.getRow(0).getLastCellNum();
		
		System.out.println("row size: "+(rows+1));
		System.out.println("cell size: "+columns);
		System.out.println();
		
		Object[][] data=new Object[rows][columns];
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columns;j++)
			{
				String value=row.getCell(j).getStringCellValue();
				if(value!="")
					data[i-1][j]=value;
				else
					data[i-1][j]="";
			}
		}
		
		workbook.close();
		
		return data;
	}

}
