package dailyhomework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import day10.tasks.ProjectSpecificMethods;

public class WebTableInteractions extends ProjectSpecificMethods{
	
	@Test
	public void webTableValidations()
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_birthDate-button").click();
		WebElement table=driver.findElementByXPath("//div[@class='calendar']/table");
		
		
		//To print the header rows from the calendar
		List<WebElement> headerRows=table.findElement(By.tagName("thead")).findElements(By.tagName("tr"));
		int rows=headerRows.size();
		for(int i=0;i<rows;i++)
		{
			WebElement eachRow=headerRows.get(i);
			int cols=eachRow.findElements(By.tagName("td")).size();
			for(int j=0;j<cols;j++)
			{
				String text=eachRow.findElements(By.tagName("td")).get(j).getText();
				System.out.print(text+" ");
			}
			System.out.println();		
		}
		
		//To print the data from the webtable
		List<WebElement> dataRows=table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		int dataRowSize=dataRows.size();
		int dataColSize=dataRows.get(0).findElements(By.tagName("td")).size();
		
		for(int i=0;i<dataRowSize;i++)
		{
			WebElement dataRow=dataRows.get(i);
			for(int j=0;j<dataColSize;j++)
			{
				String value=dataRow.findElements(By.tagName("td")).get(j).getText();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	
	}

}
