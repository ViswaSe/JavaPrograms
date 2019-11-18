package week2.task.leafground;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		String url="http://testleaf.herokuapp.com/pages/Dropdown.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		//Select training pgm using index
		
		WebElement trainingPgm=driver.findElementById("dropdown1");
		Select obj=new Select(trainingPgm);
		obj.selectByIndex(1);
		
		//Select training pgm using text
		WebElement trainingPgm2=driver.findElementByName("dropdown2");
		Select ob1=new Select(trainingPgm2);
		ob1.selectByVisibleText("Loadrunner");
		
		//Select training pgm using value
		WebElement trainingPgm3=driver.findElementById("dropdown3");
		Select ob2=new Select(trainingPgm3);
		ob2.selectByValue("2");
		
		//Get number of drop down values
		WebElement trainingPgm4=driver.findElementByClassName("dropdown");
		Select ob3=new Select(trainingPgm4);
		List<WebElement> dd=ob3.getOptions();
		int total=dd.size();
		System.out.println("Number of drop down values are "+total);
		
		//you can also select using sendkeys
		driver.findElementByXPath("(//div[@class='example'])[5]/select").sendKeys("Selenium");
		
		//Select your programs
		WebElement selectPgms=driver.findElementByXPath("(//div[@class='example'])[6]/select");
		Select ob5=new Select(selectPgms);
		ob5.selectByValue("1");
		
		driver.close();
		
	}

}
