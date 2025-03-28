package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;

public class TC001_SignupTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() {
		
		sheetname="signup";
	}
	@Test(dataProvider = "readData")
	public void signupTest(String firstName,String LastName, String email,String password,String testType, String expected) throws IOException {
		
		HomePage obj = new HomePage(driver);
		obj.clickSignUp()
		.enterFirstName(firstName)
		.enterLastName(LastName)
		.enteremail(email)
		.enterPass(password)
		.clickSubmitBtn()
		.validateSignup(testType, expected);
	}
}
