package day3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		String url="http://leaftaps.com/opentaps";
		String userName="DemoSalesManager";
		String password="crmsfa";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Aspire Systems");
		driver.findElementById("createLeadForm_firstName").sendKeys("Vishva");
		driver.findElementById("createLeadForm_lastName").sendKeys("D");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("vichuharish06@gmail.com");
		
		WebElement marketCampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select ob=new Select(marketCampaign);
		//List<WebElement> allMarketCampaign=marketCampaign.findElements(By.tagName("option"));
		List<WebElement> allMarketCampaign=ob.getOptions();
		int size=allMarketCampaign.size();
		ob.selectByIndex(size-1);
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select ob1=new Select(industry);
		ob1.selectByValue("IND_SOFTWARE");
		
		driver.findElementByName("submitButton").click();
		driver.close();

	}

}
