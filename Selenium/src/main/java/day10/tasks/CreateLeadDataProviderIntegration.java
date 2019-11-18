package day10.tasks;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadDataProviderIntegration extends ProjectSpecificMethods {
	
	@BeforeTest
	public void provideData()
	{
		filename="CreateLeadTestData";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,
			String email,String value,String mobile)
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(email);
		
		WebElement marketCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select ob=new Select(marketCampaign);
		
		List<WebElement> allMarketCampaign=ob.getOptions();
		int size=allMarketCampaign.size();
		ob.selectByIndex(size-1);
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select ob1=new Select(industry);
		ob1.selectByValue(value);
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(mobile);
		
		driver.findElementByName("submitButton").click();
		System.out.println("Lead created successfully in the LeafTaps Application");
		
	}

}
