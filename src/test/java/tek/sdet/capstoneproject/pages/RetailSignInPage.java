package tek.sdet.capstoneproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstoneproject.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this); 
	}
	
	@FindBy(id = "signinLink")
	public WebElement signIn;
	
	@FindBy(id="email")
	public WebElement emailField;
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement LoginButton;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(id="newAccountBtn")
	public WebElement creatNewAccount;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="emailInput")
	public WebElement emailfield;
	
	@FindBy(id="passwordInput")
	public WebElement passwordfield;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPas;
	
	@FindBy(id="signupBtn")
	public WebElement signUp;
	
	

	
}
