package week2.task.leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/pages/table.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Get the count of number of columns  
		WebElement table=driver.findElementByXPath("//table");
		int colSize=table.findElements(By.tagName("th")).size();
		System.out.println("Column size: "+colSize);
		
		//Get the count of number of rows  
		int rowSize=table.findElements(By.tagName("tr")).size();
		System.out.println("row size: "+rowSize);
		
		//Get the progress value of 'Learn to interact with Elements'
		String progressValue=driver.findElementByXPath("//font[contains(text(),'Learn to interact')]/following::font[1]").getText();
		System.out.println("Learn to Interact with Elements: "+progressValue);
		
		//Check the vital task for the least completed progress.
		List<WebElement> progressValues=table.findElements(By.xpath("//font[contains(text(),'%')]"));
	
		int max=0;
		int min=0;
		int temp;
		
		for(WebElement each:progressValues)
		{
			String text=each.getText();
			temp=Integer.parseInt(text.replaceAll("\\D", ""));
			
			if(max<temp)
			{
				max=temp;
			}
			else
			{
				min=temp;
			}
		}
		System.out.println("Minimum progress: "+min);
		driver.findElementByXPath("//font[contains(text(),'"+max+"')]/following::input").click();
		
	}

}
