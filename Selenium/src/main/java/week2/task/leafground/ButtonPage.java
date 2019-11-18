package week2.task.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/pages/Button.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click button to travel home page
		
		String prevTitle=driver.getTitle();
		driver.findElementById("home").click();
		String afterTitle=driver.getTitle();
		System.out.println("Previous click of button title name is "+prevTitle);
		System.out.println("After click of button title name is "+afterTitle);
		driver.findElementByXPath("//h5[text()='Button']").click();
		
		//Find position of button (x,y) 
		System.out.println("Location of the button is "+driver.findElementById("position").getLocation());
		
		//Find button color
		String cssValue = driver.findElementById("color").getCssValue("background-color");
		System.out.println("Color value is "+cssValue);
		
		//Find the size of the button
		 Dimension size = driver.findElementById("size").getSize();
		 System.out.println("Height of the button is "+size.getHeight());
		 System.out.println("Width of the button is "+size.getWidth());
		 
		 driver.close();
	}

}
