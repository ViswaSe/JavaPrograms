package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
		//Window Handles
		
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowHandles);
		System.out.println("Overall opened window size: "+windowHandles.size());
		
		for(String eachWindow:windows)
		{
			System.out.println(eachWindow);
		}
		System.out.println("Parent Window Title: "+driver.getTitle());
		
		//Switching to the child window
		
		driver.switchTo().window(windows.get(1));
		System.out.println("your window title is: "+driver.getTitle());
		driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys("Vishva");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
		driver.switchTo().window(windows.get(0));
		System.out.println("Overall opened window size: "+driver.getWindowHandles().size());
		System.out.println("Now you came back to: "+driver.getTitle());
		
		driver.close();
		
	}

}
