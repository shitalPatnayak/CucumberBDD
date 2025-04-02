package StepDefnition;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;

public class Stepdef_BrowserClose extends BaseClass {
	@Then("Close Browser")
	public void teardown2(Scenario sc) {   //scenario class from java to check status of steps-fail/pass
		System.out.println("end2 of execution");
		if(sc.isFailed()==true) {
			
		}
		driver.quit();
	}

}
