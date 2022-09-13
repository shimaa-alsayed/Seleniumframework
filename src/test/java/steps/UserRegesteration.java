package steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageClass;
import pages.UserRegisterationPage;
import test.TestBaseClass;

public class UserRegesteration extends TestBaseClass{
	HomePageClass homepageobject;
	UserRegisterationPage userregisterfobject;
	
	@Given("the user in the home page")
	public void the_user_in_the_home_page() {

		homepageobject = new HomePageClass (driver);
		homepageobject.OpenRegisterationPage();

	}
	@When("I click on register link")
	public void i_click_on_register_link() {
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));

	}
	@When("I entered {string} , {string} , {string} , {string}")
	public void i_entered(String firstname, String lastname, String email, String password) {
		userregisterfobject = new UserRegisterationPage(driver);
		userregisterfobject.userRegisteration(firstname, lastname , email, password);
	}
	@Then("The registration page displayed successfully")
	public void the_registration_page_displayed_successfully() {
		userregisterfobject.userlogout();

	}
	
	
	
	
}
	