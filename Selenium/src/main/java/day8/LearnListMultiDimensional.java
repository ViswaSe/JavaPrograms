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

public class LearnListMultiDimensional {

	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String url="https://www.zoomcar.com/chennai/";
		driver.get(url);

		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[@class='component-popular-locations']/div[2]").click();
		driver.findElementByClassName("proceed").click();

		Date date=new Date();
		DateFormat df=new SimpleDateFormat("dd");
		String today=df.format(date);
		int tomorrow=Integer.parseInt(today)+1;
		String tomDate=Integer.toString(tomorrow);
		driver.findElementByXPath("//div[contains(text(),'"+tomDate+"')]").click();
		driver.findElementByClassName("proceed").click();

		Thread.sleep(1000);
		driver.findElementByXPath("//div[contains(text(),'"+tomDate+"')]").click();
		driver.findElementByClassName("proceed").click();

		WebElement carList=driver.findElementByClassName("car-list-layout");
		List<WebElement> list=carList.findElements(By.className("car-listing"));
		List<Cars> ob=new ArrayList<Cars>();

		for(int i=0;i<list.size();i++)
		{
			String priceVal=list.get(i).findElement(By.className("price")).getText().replaceAll("\\D","");
			String carName=list.get(i).findElement(By.tagName("h3")).getText();
			WebElement bookNow=list.get(i).findElement(By.className("book-car"));
			int price=Integer.parseInt(priceVal);
			ob.add(new Cars(carName,price,bookNow));
		}

		Collections.sort(ob);
		
		for(Cars each:ob)
		{
			System.out.println(each.carName+"="+each.price+" "+each.bookNow.getText());
		}
		
		System.out.println(ob.get(0).carName);
		ob.get(0).bookNow.click();
		
		//driver.close();
	}

}
class Cars implements Comparable<Cars>
{
	int price;
	String carName;
	WebElement bookNow;
	public Cars(String carName,int price,WebElement bookNow)
	{
		this.carName=carName;
		this.price=price;
		this.bookNow=bookNow;
	}
	public int compareTo(Cars o) {
		if(price<o.price)
			return 1;
		else
			return -1;
	}
}

