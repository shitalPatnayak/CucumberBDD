package Testrunner;

//import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "E:/Selenium_Workspace/My_Framework/Features/", //given folder name here so it ll run all features file
		//if i want to run only 2 features file
		features = {"E:/Selenium_Workspace/My_Framework/Features/AddCustomer.feature","E:/Selenium_Workspace/My_Framework/Features/LoginFeature.feature"},
		//same wise we can run multiple step definition files
		glue = "StepDefinition",
		dryRun=true,  //check if we implemented all steps in stepdef file or not
		monochrome=true,   //output in readable format
		//Want to execute only sanity from all feature files
		//tags="@Sanity",
		tags="@Sanity or @Regression", //sanity and regression whereever either or mentioned all ll execute
		plugin = {"pretty","html:target/report1.html","json:target/report2.json","junit:target/report3.xml"} 
		)

public class Run extends AbstractTestNGCucumberTests{
 //This class will be empty
}
