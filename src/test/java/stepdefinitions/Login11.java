package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.Driverfactory;
import io.cucumber.java.en.*;
import pages.Login11pof;



public class Login11 {
	
	WebDriver driver;

    Login11pof loginPage;
	
	
	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() throws Exception {
		
		
		Thread.sleep(10000);
		System.out.println(">> user is on login page");

		driver = Driverfactory.getDriver();
		
		loginPage = new Login11pof(driver);
		loginPage.gotolinpage();
		
	
		
	   
	}

	@When("User enters valid email address {string} into email field")
	public void user_enters_valid_email_address_into_email_field(String email) throws Exception {
		Thread.sleep(5000);
		loginPage.enteremail(email);
		
	  
	}

	@When("User enters valid password {string} into password field")
	public void user_enters_valid_password_into_password_field(String password) throws Exception {
		Thread.sleep(5000);
		
		loginPage.enterpassword(password);
	  
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws Exception {
		Thread.sleep(10000);
		
		loginPage.clickonlogibutton();
		
		
	   
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() throws Exception {
		
		Thread.sleep(5000);
		loginPage.clicklogout();
		Thread.sleep(5000);
	   
	}


}
