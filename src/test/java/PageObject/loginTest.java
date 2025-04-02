package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginTest {
		WebDriver ldriver;
		
		
public loginTest(WebDriver rDriver) {
	ldriver= rDriver;
	PageFactory.initElements(rDriver, this);
}

	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(xpath="input[@id='Password']")
	WebElement password;

	@FindBy(xpath="//button[text()='Log in']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement LogoutBtn;
	
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
