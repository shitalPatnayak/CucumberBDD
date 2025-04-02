package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer {
	WebDriver ldriver;
	
	
public SearchCustomer(WebDriver rDriver) {
	ldriver= rDriver;
	PageFactory.initElements(rDriver, this);
}
	
	@FindBy(id="SearchEmail")
	WebElement emailadd;
	
	@FindBy(id="search-customers")
	WebElement Searchbtn;
	
	@FindBy(xpath="div[class='dt-scroll-headInner'] table[class='table table-bordered table-hover table-striped dataTable']")
	WebElement SearchResult;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody//tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody//tr[1]//td")
	List<WebElement> tableColumns;
	
	public void Emailaddress(String email) {
		emailadd.sendKeys(email);	
		}
	public void clickSearchbtn() {
		Searchbtn.click();	
		}
	
	public boolean SearchCustByemail(String email) {
		boolean found=false;
		
		//total rows
		int totalrows=tableRows.size();//total elements
		int totalColumns=tableColumns.size();
		
		
		for(int i=1;i<=totalrows;i++) {    //scan through rows  and check 1st value i=0 is the header so i=1 taken
			WebElement ElementEmail=ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]"));
			String ActualEmailAdd=ElementEmail.getText();
			if (ActualEmailAdd.equals(email)){
				found=true;
			}
		}
		return found;
		}
	
}
