package day10;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider extends LearnParameters{
	
	@DataProvider(name="fetchData")
	public Object[][] getData() throws IOException
	{
		ReadExcel obj=new ReadExcel();
		return obj.readData();
		
/*		Object[][] data=new Object[2][6];
		data[0][0]="Aspire Systems";
		data[0][1]="Vishveshwar";
		data[0][2]="Duraiswamy";
		data[0][3]="vichuharish06@gmail.com";
		data[0][4]="IND_SOFTWARE";
		data[0][5]="9578184557";
		
		data[1][0]="Cognizant";
		data[1][1]="Vishva";
		data[1][2]="D";
		data[1][3]="vichucts@gmail.com";
		data[1][4]="IND_SOFTWARE";
		data[1][5]="9629772394";
		
		return data; */
	
	}
		
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cName,String fName,String lName,String email,String value,String mob) {
		
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
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(mob);
		
		driver.findElementByName("submitButton").click();
		System.out.println("Lead created successfully in the LeafTaps Application");

	}


}
