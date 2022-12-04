package tek.sdet.capstoneproject.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstoneproject.pages.POMFactory;
import tek.sdet.capstoneproject.utilities.CommonUtility;

public class RetailSignInSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user clicked on Sign In option");
	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered the email" + email + "and password" + password);
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		 click(factory.signInPage().LoginButton);
	        logger.info("user clicked on Login button");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().account)); 
		    logger.info("user logged in to acount");    
		    slowDown();
	}
	
	@And("User click on Creat New Account button")
	public void userClickOnCreatNewAccountButton() {
		click(factory.signInPage().creatNewAccount);
		logger.info("User clicked on Create New Account succefully");
		slowDown();
		
	}
	
	@And("User fill the signUp information with below data")
	public void userEnteredTheGivenData (DataTable data) {
		List<Map<String, String>>signUpData=data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameField,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailfield,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordfield,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPas,signUpData.get(0).get("confirmPassword"));
		logger.info("user could enter the data successfully");
		slowDown();
		
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUp);
		logger.info("User clicked on SignUp Button");
		
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("User successfully Logged into account page");
		slowDown();
	}
	
	

}
