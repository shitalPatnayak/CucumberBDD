package StepDefnition;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.LogManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.SearchCustomer;
import PageObject.loginTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass{
	
//	public WebDriver driver;
//	public loginTest loginpg;
//	public SearchCustomer searchcust;
	
	//@Before(order=1)
	@Before("@Sanity")//it will execute before only for sanity test scenarios
	public void setup1() {
		
		//initialize properties file here
		readConfig = new Properties();
		//fileinput stream object create to read config file in readonly mode
		FileInputStream file= new FileInputStream("config.properties");
		readConfig.load(file); //use try catch block here
		//now read the values stored in properties file for browser read
		
		
		//initialize Logger here
		Log= LogManager.getLogger("StepDef");
		System.out.println("SetUp-Sanity method executed");
		
		String browser = readConfig.getProperty("browser"); // browser is the key from properties file
		//switch case to propagate diff browsers
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@Before(order=0)
	public void setup2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		loginpg = new loginTest(driver);
		searchcust = new SearchCustomer(driver);  //object created to call all the methods from page object class
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);  //from feature
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginpg.enteremail(emailadd);
		loginpg.enterpassword(password);
	}

	@When("User clicks on Login")
	public void user_clicks_on_login() {
		loginpg.ClickonLogin(null);
	}

	@Then("Page title should be {string}")  //we have implemented 2 steos here- calling 2 steps from feature for title
	public void page_title_should_be(String expectedTitle) {
		String ActualTitle= driver.getTitle();
		if (ActualTitle.equals(expectedTitle)){
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("User clicks on logout link")
	public void user_clicks_on_logout_link() {
		loginpg.ClickonLogout(null);
	}
	
	//Addnew cutomer feature
	@Then("User can view dashboard")
	public void user_can_view_dashboard() {

	}

	@When("User clicks on Customer Menu")
	public void user_clicks_on_customer_menu() {

	}

	@When("click on customer menu item")
	public void click_on_customer_menu_item() {

	}

	@When("click on add new button")
	public void click_on_add_new_button() {

	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() {

	}

	@When("User enter customer info")
	public void user_enter_customer_info() {

	}

	@When("click on save button")
	public void click_on_save_button() {

	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {

	}
	
	//SearchCustomer feature
	@When("enter custometr email")
	public void enter_custometr_email() {
		searchcust.Emailaddress("ash@gmail.com");
	}

	@When("click on search button")
	public void click_on_search_button() {
		searchcust.clickSearchbtn();
	}

	@Then("User should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
		String ExpectedEmail="ash@gmail.com";  //u can create variable as well
			Assert.assertTrue(searchcust.SearchCustByemail(ExpectedEmail));  //you can write if statement also for this		
	}


	@After(order=1) //it will run after teardown2- reverse of before()
	public void teardown1() {
		System.out.println("end1 of execution");
		driver.quit();
	}

	
	@BeforeStep  //runs before every steps of a scenario
	public void BeforeStepMethodDemo() {
		System.out.println("This is after step");
	}
	
	@AfterStep
	public void AfterStepMethodDemo() {
		System.out.println("This is after step");
	}

}
