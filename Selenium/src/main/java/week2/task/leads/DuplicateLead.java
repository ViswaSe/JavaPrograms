package week2.task.leads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("vichuharish06@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		WebElement firstResultingLead=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]");
		String leadName=firstResultingLead.getText();
		firstResultingLead.click();
		driver.findElementByXPath("//a[@class='subMenuButton']").click();
		
		String pageTitle=driver.getTitle();
		if(pageTitle.contains("Duplicate"))
		{
			System.out.println("Page Title is "+pageTitle);
		}
		
		driver.findElementByClassName("smallSubmit").click();
		String duplicateLeadName=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(duplicateLeadName);
		
		if(duplicateLeadName.equals(leadName))
		{
			System.out.println("Duplicate Lead created successfully and the lead name as "+duplicateLeadName);
		}
		driver.close();
	}

}
