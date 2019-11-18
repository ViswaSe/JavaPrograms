package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {
	
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
		
		//Print all the values from the table
		
		for(int i=0;i<rowSize;i++)
		{
			WebElement eachRow=table.findElements(By.tagName("tr")).get(i);
			for(int j=0;j<colSize;j++)
			{
				count=eachRow.findElements(By.tagName("td")).size();
				
				if(count>=1)
				{
					String text=eachRow.findElements(By.tagName("td")).get(j).getText();
					System.out.print(text+" ");
				}
				else
				{
					break;
				}
			}
			System.out.println();
		}
		
		driver.close();
	}

}
