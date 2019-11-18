package testdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_001_CreateLead_Positiveflow{
	
	public ChromeDriver driver;
	public String url="";
	public String actualTitle;

	@Given("Open the ChromeBrowser")
	public void open_the_ChromeBrowser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("Maximize the window")
	public void maximize_the_window() {
		driver.manage().window().maximize();

	}
	
	@Given("Load the url")
	public void load_the_url() {
		driver.get(url);
	}

	@Given("Set the Timeouts implicit wait")
	public void set_the_Timeouts_implicit_wait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Enter the username as (.*)")
	public void enter_the_username(String username) {

		driver.findElementById("username").sendKeys(username);
	}

	@Given("Enter the password as (.*)")
	public void enter_the_password(String password) {
		driver.findElementById("password").sendKeys(password);

	}

	@When("Click on Login Button after entered credentials")
	public void click_on_Login_Button_after_entered_credentials() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("Login should be successfully done")
	public void login_should_be_successfully_done() {
		actualTitle=driver.getTitle();
		if(actualTitle.contains("Test Automation Platform"))
			System.out.println("Title matches successfully "+actualTitle);

		System.out.println("Login successfully done");

	}

	@When("Click on the crmsfa link in the loginpage")
	public void click_on_the_crmsfa_link_in_the_loginpage() {
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@Then("User should be navigated to the homepage")
	public void user_should_be_navigated_to_the_homepage() {
		actualTitle=driver.getTitle();
		if(actualTitle.contains("My Home"))
			System.out.println("Title matches successfully "+actualTitle);

		System.out.println("User navigated to the home page successfully");

	}

	@When("Click on Create Lead link")
	public void click_on_Create_Lead_link() {
		driver.findElementByLinkText("Create Lead").click();

	}

	@Then("User should be navigated to the createleadpage")
	public void user_should_be_navigated_to_the_createleadpage() {
		actualTitle=driver.getTitle();
		if(actualTitle.contains("Create Lead"))
			System.out.println("Title matches successfully "+actualTitle);

		System.out.println("User navigated to the create lead page successfully");

	}

	@When("User enters the company name in the createleadpage as (.*)")
	public void user_enters_the_company_name_in_the_createleadpage(String cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);

	}

	@When("User enters the first name of the lead in the createleadpage as (.*)")
	public void user_enters_the_first_name_of_the_lead_in_the_createleadpage(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);

	}

	@When("User enters the last name of the lead in the createleadpage as (.*)")
	public void user_enters_the_last_name_of_the_lead_in_the_createleadpage(String lname) {

		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("User should click on the createlead button in the createleadpage")
	public void user_should_click_on_the_createlead_button_in_the_createleadpage() {
		driver.findElementByName("submitButton").click();

	}

	@Then("Lead should be successfully created in the leaftaps application")
	public void lead_should_be_successfully_created_in_the_leaftaps_application() {
		actualTitle=driver.getTitle();
		if(actualTitle.contains("View Lead"))
			System.out.println("Title matches successfully "+actualTitle);

		System.out.println("Lead created successfully in the leaftaps application");
		
		driver.quit();

	}




}
