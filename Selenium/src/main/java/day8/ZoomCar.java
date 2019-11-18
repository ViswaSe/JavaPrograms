package day8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-arguments");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String url="https://www.zoomcar.com/chennai";
		
		driver.get(url);
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		driver.findElementByClassName("proceed").click();
		
		//Select tomorrow's date
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("dd");
		String today=df.format(date);
		int tomorrow=Integer.parseInt(today)+1;
		
		String tomDate=Integer.toString(tomorrow);
		String future=Integer.toString(tomorrow+1);
		
		driver.findElementByXPath("//div[contains(text(),'"+tomDate+"')]").click();
		driver.findElementByClassName("proceed").click();
		
		Thread.sleep(1000);
		
		//Confirm the start date
		driver.findElementByXPath("//div[contains(text(),'"+future+"')]").click();
		driver.findElementByClassName("proceed").click();
		Thread.sleep(1000);
		//Capturing the results
		WebElement carList=driver.findElementByClassName("car-list-layout");
		List<WebElement> list=carList.findElements(By.className("car-listing"));
		List<Integer> prices=new ArrayList<Integer>();
		
		//Find the highest brand and click on the car for booking
		for(WebElement each:list)
		{
			String price=each.findElement(By.className("price")).getText();
			price=price.replaceAll("\\D", "");
			prices.add(Integer.parseInt(price));
		}
		
		Collections.sort(prices);
		
		System.out.println(prices);
		
		int maxPrice=prices.get(prices.size()-1);
		
		for(WebElement each:list)
		{
			String text=each.findElement(By.className("price")).getText();
			text=text.replaceAll("\\D","");
			if(text.equals(Integer.toString(maxPrice)))
			{
				String result=each.findElement(By.tagName("h3")).getText();
				System.out.println("Highest brand- car name:"+result+"and the car price: "+maxPrice);
				each.findElement(By.className("book-car")).click();
			}
		}
		
		driver.close();
		
	}

}
