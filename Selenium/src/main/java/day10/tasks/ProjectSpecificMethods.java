package day10.tasks;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	public String filename;

	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url,String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
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
	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException
	{
		return ExcelUtils.readData(filename);
	}

}
