package day9.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class DeleteLead_TestNG extends ProjectSpecificMethods{

	@Test
	public void runDeleteLead() throws InterruptedException {
		
		//login();
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[3]").click();
		driver.findElementByName("emailAddress").sendKeys("vichuharish06@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		
		WebElement firstResultingLead=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a[1]");
		String leadId=firstResultingLead.getText();
		firstResultingLead.click();
		driver.findElementByClassName("subMenuButtonDangerous").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[contains(text(),'Lead ID')]/following::input[1]").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);
		String warningMessage=driver.findElementByClassName("x-paging-info").getText();
		if(warningMessage.contains("No records"))
		{
			System.out.println("Lead Deleted successfully: "+warningMessage);
		}
		driver.close();
	}

}
