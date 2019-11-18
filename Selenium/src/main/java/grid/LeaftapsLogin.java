package grid;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LeaftapsLogin {
	
	public static void main(String args[]) throws IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
	
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4455/wd/hub"),dc);
		
		String url="http://leaftaps.com/opentaps";
		String userName="DemoSalesManager";
		String password="crmsfa";
	
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		WebDriver augmentDriver=new Augmenter().augment(driver);
		
		File src=((TakesScreenshot)augmentDriver).getScreenshotAs(OutputType.FILE);
		File desc=new File("./grid/login.jpg");
		FileUtils.copyFile(src, desc);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.quit();
		
	}

}
