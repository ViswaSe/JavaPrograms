package week2.task.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPage {

	public static void main(String[] args) {
		
		String url="http://testleaf.herokuapp.com/pages/Edit.html";
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.findElementById("email").sendKeys("vichuharish06@gmail.com");
		driver.findElementByXPath("//input[contains(@value,'Append')]").sendKeys("Appending Text",Keys.TAB);
		
		String text=driver.findElementByName("username").getAttribute("value");
		System.out.println("Attribute value is "+text);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		boolean checkEnabled=driver.findElementByXPath("//label[@for='disabled']/following::input[1]").isEnabled();
		System.out.println("Last field enable option is "+checkEnabled);
		
		driver.close();
	}

}
