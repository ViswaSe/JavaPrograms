package week2.task.leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url="http://testleaf.herokuapp.com/pages/checkbox.html";
		driver.navigate().to(url);
		
		//Select the languages that you know?
		driver.findElementByXPath("//label[@for='java']/following::input[1]").click();
		driver.findElementByXPath("//label[@for='java']/following::input[2]").click();
		driver.findElementByXPath("//label[@for='java']/following::input[3]").click();
		driver.findElementByXPath("//label[@for='java']/following::input[5]").click();
		
		//Confirm Selenium is checked 
		
		boolean checkSelenium=driver.findElementByXPath("(//label[@for='java']/following::input[1])[2]").isSelected();
		System.out.println("Selenium check box selection in the page is "+checkSelenium);
		
		//DeSelect only checked
		WebElement deSelectOption=driver.findElementByXPath("(//div[@class='example'])[3]");
		List<WebElement> lst=deSelectOption.findElements(By.tagName("input"));
		
		for(WebElement each:lst)
		{
			if(each.isSelected())
			{
				System.out.println(each.getText());
				each.click();
			}
		}
		
		//Select all Check boxes below
		WebElement lastCheckBoxes=driver.findElementByXPath("(//div[@class='example'])[4]");
		List<WebElement> allOptions=lastCheckBoxes.findElements(By.tagName("input"));
		for(WebElement each:allOptions)
		{
			each.click();
		}
	}

}
