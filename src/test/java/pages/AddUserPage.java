package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecificationMethods;

public class AddUserPage extends ProjectSpecificationMethods{
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	@FindBy(xpath ="//h1[text()='Contact List']")
	WebElement contactList;
	
	@FindBy(xpath="//span[text()='Email address is already in use']")
	WebElement error;
	
	
	public AddUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public AddUserPage enterFirstName(String firstName) {
		
		firstname.sendKeys(firstName);
		return this;
		
	}
	
	public AddUserPage enterLastName(String LastName) {
		
		lastname.sendKeys(LastName);
		return this;
		
	}
	
	public AddUserPage enteremail(String mail) {
		
		email.sendKeys(mail);
		return this;
		
	}
	
	public AddUserPage enterPass(String pass) {
		
		password.sendKeys(pass);
		return this;
		
	}
	
	public AddUserPage clickSubmitBtn() {
		
		submitBtn.click();
		return this;
		
	}
	
	public AddUserPage validateSignup(String testType, String expcted) {
		
		if(testType.equalsIgnoreCase("ValidCredentials")) {
			
				String actual = contactList.getText();
				Assert.assertEquals(actual, expcted);	
				
			
				
		} else if(testType.equalsIgnoreCase("MailInUse")){
			
			String actual = error.getText();
			Assert.assertEquals(actual, expcted);
			
		}
		return this;
	}

}
