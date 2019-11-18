package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf_Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		String url="http://testleaf.herokuapp.com/home.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//h5[text()='Frame']").click();
		
		//Frame1
		driver.switchTo().frame(driver.findElementByXPath("//iframe"));
		WebElement frame1Button=driver.findElementById("Click");
		System.out.println("Before click: "+frame1Button.getText());
		frame1Button.click();
		System.out.println("After click: "+frame1Button.getText());
		driver.switchTo().defaultContent();
		
		//Frame2
		driver.switchTo().frame(driver.findElementByXPath("(//iframe)[2]"));
		driver.switchTo().frame("frame2");
		WebElement frame2Button=driver.findElementById("Click1");
		System.out.println("Before click: "+frame2Button.getText());
		frame2Button.click();
		System.out.println("After click: "+frame2Button.getText());
		driver.switchTo().defaultContent();
		
		//Find total number of frames in div tag in frames page.
		
		WebElement frameContent=driver.findElementByXPath("(//div[@id='wrapframe'])[3]");
		List<WebElement> frames=frameContent.findElements(By.tagName("iframe"));
		System.out.println("Total Number of frames in final div tag: "+frames.size());
		
		//Total Number of frames in the webpage
		List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total Number of frames in the browser: "+totalFrames.size());
		
	}


}
