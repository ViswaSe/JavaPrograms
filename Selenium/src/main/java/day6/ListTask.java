package day6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListTask {
	
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
		
		//Add the resulting values to the list and validate the list size with row count
		
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
			
			if(list.size()==(rowSize-1))
			{
				System.out.println("List Size: "+(list.size()+1));
				System.out.println("List size is matching with the row count in the UI Page");
			}
			driver.close();
	}	
}


