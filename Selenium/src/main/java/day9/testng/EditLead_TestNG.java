package day9.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class EditLead_TestNG extends ProjectSpecificMethods{

	@Test
	public void runEditLead() throws InterruptedException {
		
		//login();
		
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
