package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Zoom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-arguments");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai/search/query?lat=12.9416037&lng=80.2362096&starts=2019-07-23%2011%3A30&ends=2019-07-25%2017%3A30&type=zoom_later&bracket=no_fuel");
		List<WebElement> carName = driver.findElementsByXPath("//div[@class='details']//h3");
		List<WebElement> prices = driver.findElementsByXPath("//div[@class='price']");
		List<CarList> list = new ArrayList<CarList>();
		for (int i = 0; i < carName.size(); i++) {
			String replaceAll = prices.get(i).getText().replaceAll("\\D", "" );	
			String car = carName.get(i).getText();
			Integer parseInt = Integer.parseInt(replaceAll);
			list.add(new CarList(parseInt, car));
		}
		Collections.sort(list);
		for (CarList carList : list) {
			System.out.println(carList.price);

		}


	}

}

class CarList implements Comparable<CarList>{
	Integer price;
	String carName;
	public CarList(Integer price, String carName) {
		super();
		this.price = price;
		this.carName = carName;
	}
	public int compareTo(CarList o) {
		if (o.price < o.price) {
			return -1;
		}return 1;
	}
	@Override
	public String toString() {
		return "CarList [price=" + price + ", carName=" + carName + "]";
	}


}
