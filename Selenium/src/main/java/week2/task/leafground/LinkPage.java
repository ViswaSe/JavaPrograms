package week2.task.leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/pages/Link.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Go to Home Page by clicking on the link
		String prevTitle=driver.getTitle();
		driver.findElementByLinkText("Go to Home Page").click();
		String afterTitle=driver.getTitle();
		System.out.println("Before click on the link the title is "+prevTitle);
		System.out.println("After click on the link the title is "+afterTitle);
		
		driver.findElementByXPath("(//a[@class='wp-categories-link maxheight'])[3]").click();
		
		//Find where am supposed to go without clicking me?
		String goToLink=driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
		System.out.println(goToLink);
		
		//Go to HomePage (Interact with same link name - use xpath)
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		System.out.println("Link is clicked");
		
		driver.findElementByXPath("(//a[@class='wp-categories-link maxheight'])[3]").click();
		
		//Find how many links are available in the page
		
		List<WebElement> links=driver.findElementsByTagName("a");
		for(WebElement eachLink:links)
		{
			System.out.println(eachLink.getText());
		}
		System.out.println("Total available links in the page is "+links.size());
		
		driver.close();
	}

}
