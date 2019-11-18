package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTableInteractions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url="https://erail.in/";
		driver.get(url);
		
		String fromStn="Kumbakonam";
		String toStn="Tambaram";
		
		WebElement fromStation=driver.findElementById("txtStationFrom");
		fromStation.clear();
		fromStation.sendKeys(fromStn,Keys.TAB);
		
		WebElement toStation=driver.findElementById("txtStationTo");
		toStation.clear();
		toStation.sendKeys(toStn,Keys.ENTER);
		
		Thread.sleep(3000);
		
		WebElement table1=driver.findElementByXPath("//table[contains(@class,'DataTableHeader')]");
		
		//To find how many columns in the table
		List<WebElement> columns=table1.findElements(By.tagName("td"));
		int tableColumnSize=columns.size();
		System.out.println("Train column size: "+tableColumnSize);
		
		//To find how many rows available in the table
		
		WebElement table2=driver.findElementByXPath("(//table[contains(@class,'TrainListHeader')])[2]");
		List<WebElement> rows=table2.findElements(By.tagName("tr"));
		int tableRowSize=rows.size();
		System.out.println("Train Row Size: "+tableRowSize);
		
		//To get the last train details
		WebElement lastTrain=rows.get(tableRowSize-1);
		List<WebElement> lastTrainDetails=lastTrain.findElements(By.tagName("td"));
		String lastTrainNumber=lastTrainDetails.get(0).getText();
		String lastTrainName=lastTrainDetails.get(1).getText();
		
		System.out.println();
		System.out.println("Your last Train is "+lastTrainNumber+"=="+lastTrainName);
		System.out.println();
		
		//To Print the entire table details
		
		for(int i=0;i<tableRowSize;i++)
		{
			WebElement eachRow=rows.get(i);
			List<WebElement> tableCol=eachRow.findElements(By.tagName("td"));
			int tableCols=tableCol.size();
			
			for(int j=0;j<tableCols;j++)
			{
				String text=tableCol.get(j).getText();
				System.out.print(text+"  ");
			}
			System.out.println();
			
		}
	}

}
