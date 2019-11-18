package week2.task.leads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		String url="http://leaftaps.com/opentaps/control/main";
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is "+pageTitle);
		
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		String newCompany="Tata";
		WebElement companyName=driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys(newCompany);
		driver.findElementByName("submitButton").click();
		
		String updateCompanyName=driver.findElementById("viewLead_companyName_sp").getText();
		if(updateCompanyName.contains(newCompany))
		{
			System.out.println("CompanyName updated successfully "+updateCompanyName);
		}
		driver.close();
	}

}
