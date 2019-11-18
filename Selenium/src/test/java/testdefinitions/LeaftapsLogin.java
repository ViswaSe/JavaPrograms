package testdefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaftapsLogin {
	
	public ChromeDriver driver;
	public String actualTitle;
	
	@Given("Open the Browser")
	public void open_the_Browser() {
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    
	}

	@And("Load the url as (.*)")
	public void load_the_url_as(String url) {
	       driver.get(url);
	}

	@Given("maximize the window")
	public void maximize_the_window() {
	    
	    driver.manage().window().maximize();
	}

	@When("User enters the username as (.*)")
	public void user_enters_the_username(String username) {
	    driver.findElementById("username").sendKeys(username);
	    
	}

	@When("User enters the password as (.*)")
	public void user_enters_the_password(String password) {
	    
		driver.findElementById("password").sendKeys(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
	    
		actualTitle=driver.getTitle();
		if(actualTitle.contains("Test Automation Platform"))
			System.out.println("Title matches successfully "+actualTitle);

		System.out.println("Login successfully done");
		driver.quit();
	}


}
