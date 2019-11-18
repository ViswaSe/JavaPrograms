package day10.tasks;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLeadDataProviderIntegration extends ProjectSpecificMethods{
	
	@BeforeTest
	public void doTest()
	{
		filename="EditLeadTestData";
	}
	
	@Test(dataProvider="fetchData",dependsOnMethods= 
		{"day10.tasks.CreateLeadDataProviderIntegration.createLead"})
	public void setData(String newCompany) throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		String pageTitle=driver.getTitle();
		System.out.println("Page Title is "+pageTitle);
		
		driver.findElementByXPath("(//a[@class='subMenuButton'])[3]").click();
		WebElement companyName=driver.findElementById("updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys(newCompany);
		driver.findElementByName("submitButton").click();
		
		String updateCompanyName=driver.findElementById("viewLead_companyName_sp").getText();
		if(updateCompanyName.contains(newCompany))
		{
			System.out.println("CompanyName updated successfully "+updateCompanyName);
		}
	}
	
}
