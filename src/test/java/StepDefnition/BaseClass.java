package StepDefnition;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.SearchCustomer;
import PageObject.loginTest;

//maintain all common variables and methods- parent class-all the step definitions class will be child class
public class BaseClass {

	
	public static WebDriver driver;
	public loginTest loginpg;
	public SearchCustomer searchcust;
	public static Logger Log;
	public Properties readConfig;
	
//We are seeing we are creating new email for every new add new customer in all scenarios- use random from java to create random email add
	
	public String generateEmailid() {
		return(RandomStringUtils.randomAlphabetic(5)); //call this in step definition-check if this id depricated
	}
}
