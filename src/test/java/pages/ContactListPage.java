package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class ContactListPage extends ProjectSpecificationMethods{

	@FindBy(id="logout")
	WebElement logout;
	
	public ContactListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ContactListPage clickLogout() {
		
		logout.click();
		return this;
	}
}
