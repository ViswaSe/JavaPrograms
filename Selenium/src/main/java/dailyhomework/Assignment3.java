package dailyhomework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment3 {
	
	public String browser,url,username,password,taxId,invoiceItem;
	public static RemoteWebDriver driver;
	
	@BeforeTest
	public void provideData()
	{
		browser="ie";
		url="https://acme-test.uipath.com/account/login";
		username="kumar.testleaf@gmail.com";
		password="leaf@12";
		taxId="RO094782";
		invoiceItem="IT Support";
	}
	
	@BeforeMethod
	public void init()
	{
		
		switch(browser.toLowerCase())
		{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeOptions op=new ChromeOptions();
				op.addArguments("--disable-notifications");
				driver=new ChromeDriver(op);
				break;
			
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32 bit.exe");
				FirefoxOptions opt=new FirefoxOptions();
				opt.addArguments("--disable-notifications");
				driver=new FirefoxDriver(opt);
				break;
			
			case "ie":
				System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
				driver=new InternetExplorerDriver();
				break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void interactWithACMESite()
	{
		driver.findElementById("email").sendKeys(username,Keys.TAB,password);
		driver.findElementById("buttonLogin").click();
		
		Actions builder=new Actions(driver);
		WebElement eleInvoices=driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[5]");
		builder.moveToElement(eleInvoices).perform();
		WebElement eleSearchForInvoices=driver.findElementByLinkText("Search for Invoice");
		builder.click(eleSearchForInvoices).perform();
		
		driver.findElementById("vendorTaxID").sendKeys(taxId);
		driver.findElementById("buttonSearch").click();
		
		WebElement table=driver.findElementByXPath("//table");
		List<WebElement> invoiceNumber=table.findElements(By.xpath("//td[text()='"+invoiceItem+"']/preceding::td[2]"));
		
		System.out.println("Total invoices available for the mentioned item is: "+invoiceNumber.size());
		
		for(WebElement eachInvoice:invoiceNumber)
		{
			System.out.println(eachInvoice.getText()+"-"+invoiceItem);
		}
		
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElementByLinkText("Log Out").click();
	}

	@AfterSuite
	public void closeAllBrowser()
	{
		driver.quit();
	}
}
