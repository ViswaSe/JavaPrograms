package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartActionClass {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="https://www.flipkart.com/";
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement homeFurnitures=driver.findElementByXPath("//span[text()='Home & Furniture']");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(homeFurnitures).perform();
		driver.findElementByLinkText("Paintings").click();
		
		driver.close();
		
	}

}
