package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		driver.get(url);
		
		String name="Viswa";
		
		//Switching to the frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(name);
		alert.accept();
		
		String result=driver.findElementById("demo").getText();
		if(result.contains(name))
			System.out.println(result);
		else
			System.out.println("result doesn't have your name");
		
		driver.close();
	}

}
