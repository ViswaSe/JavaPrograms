package day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
/*		String username="ram91465@gmail.com";
		String password="ASWATHmadhura";*/
		String username="siva.sachin@live.com";
		String password="Facebook@1";
		String search="Bala";
		
		driver.findElementById("email").sendKeys(username);
		driver.findElementById("pass").sendKeys(password);
		driver.findElementById("loginbutton").click();
		
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys(search);
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//li[@data-edge='keywords_places']").click();
		
		Thread.sleep(3000);
		List<WebElement> results=driver.findElements(By.tagName("a"));
		
		for(WebElement each:results)
		{
			if(each.getText().equals(search))
			{
				System.out.println(search+" link is available in the content");
				Thread.sleep(2000);
				WebElement likeButton=driver.findElementByXPath("//a[text()='"+search+"']/preceding::button[1]");
				
				if(likeButton.getAttribute("className").contains("likedButton"))
				{
					System.out.println(search+" is already liked for this user id");
					break;
				}
				else
				{
					likeButton.click();
					System.out.println(search+" button liked successfully");
					break;
				}
				
			}
			
		}
		
		driver.findElementByLinkText(search).click();
		String pagetitle=driver.getTitle();
		Thread.sleep(2000);
		if(pagetitle.contains(search))
		{
			String totalLike=driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
			totalLike=totalLike.replaceAll("\\D", "");
			System.out.println("Total likes for the "+search+" page is "+totalLike);
		}
		
		driver.close();
	}

}
