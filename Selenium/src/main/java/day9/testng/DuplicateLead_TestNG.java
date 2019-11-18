package day9.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class DuplicateLead_TestNG extends ProjectSpecificMethods{

	@Test
	public void runDuplicateLead() throws InterruptedException {
		
		//login();
		
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
		Thread.sleep(1000);
		String duplicateLeadName=driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(duplicateLeadName);
		
		if(duplicateLeadName.equals(leadName))
		{
			System.out.println("Duplicate Lead created successfully and the lead name as "+duplicateLeadName);
		}
		driver.close();
	}

}
