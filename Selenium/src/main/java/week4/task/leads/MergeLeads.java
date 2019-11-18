package week4.task.leads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.get(url);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		
		//Selecting 1st lead icon for merge leads
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> windows=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys("Vishva");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement firstLeadId=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]");
		String leadId=firstLeadId.getText();
		firstLeadId.click();
		driver.switchTo().window(list.get(0));
		
		//Selecting 2nd lead icon for merge leads
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		windows=driver.getWindowHandles();
		list.clear();
		list.addAll(windows);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//label[contains(text(),'First name')]/following::input[1]").sendKeys("Vishva");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a[1]").click();
		driver.switchTo().window(list.get(0));
		
		driver.findElementByClassName("buttonDangerous").click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		
		String result=driver.findElementByClassName("x-paging-info").getText();
		if(result.contains("No records"))
			System.out.println(result+" for lead id: "+leadId);
		
		driver.close();
		
	}

}
