package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LearnParameters {

	ChromeDriver driver;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String username,String password)
	{	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url); //using the parameter var.name here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys(username);
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
