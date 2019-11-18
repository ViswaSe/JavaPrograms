package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/home.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//h5[text()='Alert']").click();
		
		//Click the button to display a alert box.
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		//Click the button to display a confirm box. 
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Thread.sleep(1000);
		Alert alert1=driver.switchTo().alert();
		String alert1Text=alert1.getText();
		System.out.println(alert1Text);
		alert1.dismiss();
		String result=driver.findElementById("result").getText();
		if(result.contains("OK"))
			System.out.println("you clicked on OK");
		else
			System.out.println(result);
		
		//Click the button to learn line-breaks in an alert. 
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		Thread.sleep(1000);
		Alert alert2=driver.switchTo().alert();
		String alert2Text=alert2.getText();
		alert2.accept();
		System.out.println(alert2Text);
	}

}
