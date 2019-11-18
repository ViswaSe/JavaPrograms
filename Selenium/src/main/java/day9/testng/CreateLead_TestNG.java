package day9.testng;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateLead_TestNG extends ProjectSpecificMethods{

	@Test
	public void runCreateLead() {
		
		//login(); this is not required as login functionality is defined as @BeforeSuite()
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Aspire Systems");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vishva");
		driver.findElementById("createLeadForm_lastName").sendKeys("D");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vichuharish06@gmail.com");
		
		WebElement marketCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select ob=new Select(marketCampaign);
		
		List<WebElement> allMarketCampaign=ob.getOptions();
		int size=allMarketCampaign.size();
		ob.selectByIndex(size-1);
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select ob1=new Select(industry);
		ob1.selectByValue("IND_SOFTWARE");
		
		driver.findElementByName("submitButton").click();
		System.out.println("Lead created successfully in the LeafTaps Application");

	}

}
