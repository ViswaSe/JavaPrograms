package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTask2 {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="https://erail.in/";
		driver.navigate().to(url);
		
		String from="Kumbakonam";String to="Tambaram";
		
		WebElement fromStation=driver.findElementById("txtStationFrom");
		fromStation.clear();
		fromStation.sendKeys(from,Keys.TAB);
		
		WebElement toStation=driver.findElementById("txtStationTo");
		toStation.clear();
		toStation.sendKeys(to,Keys.ENTER);
		
		WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		int rowSize=table.findElements(By.tagName("tr")).size();
		System.out.println("Total number of rows in the table are "+rowSize);
		
		int colSize=table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).size();
		System.out.println("Total number of columns in the table are "+colSize);
		
		int count;
		
		List<String> list=new ArrayList<String>();
		
		//Sort the trainnames in the list and validate with the result appearing after clicking on the trainname link in UI
		
		for(int i=0;i<rowSize;i++)
		{
			WebElement eachRow=table.findElements(By.tagName("tr")).get(i);
			count=eachRow.findElements(By.tagName("td")).size();
			
			if(count>=1)
			{
				String text=eachRow.findElements(By.tagName("td")).get(1).getText();
				list.add(text);
			}
			else
			{
				continue;
			}
		}
			
			System.out.println("Trains available: ");
			for(String each:list)
			{
				System.out.println(each);
			}
			
			Collections.sort(list);
			
			driver.findElementByLinkText("Train Name").click();
			
			WebElement sortedTable=driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
			List<WebElement> sortedRows=sortedTable.findElements(By.tagName("tr"));
			int sortSize=sortedRows.size();
			System.out.println("Row Size after sorted the table is "+sortSize);
			
			List<String> list1=new ArrayList<String>();
			
			for(int i=0;i<sortSize;i++)
			{
				String text=sortedRows.get(i).findElements(By.tagName("td")).get(1).getText();
				list1.add(text);
			}
			System.out.println("Trains available after Sorting: ");
			for(String each:list1)
			{
				System.out.println(each);
			}
			
			if(list1.size()==(rowSize-1))
			{
				System.out.println("Sorted results matching with the row count successfully");
			}
			
			driver.close();
	}	
}


