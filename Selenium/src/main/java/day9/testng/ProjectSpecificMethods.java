package day9.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	
	@BeforeMethod
	public void login()
	{
		String url="http://leaftaps.com/opentaps";
		String userName="DemoSalesManager";
		String password="crmsfa";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
