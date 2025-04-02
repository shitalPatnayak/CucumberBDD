package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomer {
		WebDriver ldriver;
		
		
public addCustomer(WebDriver rDriver) {
	ldriver= rDriver;
	PageFactory.initElements(rDriver, this);
}

	@FindBy(xpath="//a[href='#']//p[text()='Customers']")
	WebElement lnkCustomer_menu;
	//likewise add all customer details xpath here -vdo -2
	
	public void enteremail(String emailadd) {
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void enterpassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void ClickonLogin(String Loginbutton) {
		LoginBtn.click();
	}
	
	
	
	public void ClickonLogout(String Logoutbutton) {
		LogoutBtn.click();
	}
	
	
}
